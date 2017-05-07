package br.cesed.facisa.p3.arraylist;

public class NArrayList {

	private Student student;
	private int amount;

	public void add(Object element) {
		if (student == null) {
			Student auxStudent = new Student();
			auxStudent.setElement(element);
			auxStudent.setNextStudent(student);
			student = auxStudent;
			amount++;
		} else {
			Student auxStudent = new Student();
			auxStudent.setElement(element);
			auxStudent.setNextStudent(student);
			student = auxStudent;
			amount++;
		}
	}

	public void addPosition(Object element, int position) {
		for (int i = 1; i <= position; i++) {
			student = student.getNextStudent();
		}
		Student auxStudent = new Student();
		auxStudent.setElement(element);
		auxStudent.setNextStudent(student);
		student = auxStudent;
		amount++;
	}

	public void removeForElement(Object element) {
		int count = 0;
		Student previous = null;
		Student next = this.student;

		while (next != element) {
			previous = next;
			next = next.nextStudent;
			count++;
		}
		
		for (int i = 0; i <= count ; i++) {
			student = student.nextStudent;
			if(i==count){
				student = student.getNextStudent();
			}
		}
		
		
	}

	public int size() {
		return amount;
	}
	
	public void showStudents(){
		for (Student i = this.student; i != null; i = i.nextStudent) {
			System.out.println(i);
		}
	} 
}
