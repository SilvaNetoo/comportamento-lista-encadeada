package br.cesed.facisa.p3.arraylist;

public class NArrayList {

	private Student fisrtStudent;
	private Student lastStudent;
	private int amount;

	public Student lastStudent(){
		return lastStudent;
	}
	
	public Student firstStudent(){
		return fisrtStudent;
	}
	
	
	public boolean isEmpty(){
		return fisrtStudent != null && lastStudent != null;
	} 
	
	public void add(Student stud) {
		if(isEmpty()){
			fisrtStudent = stud;
			lastStudent = stud;
			amount++;
		} else {
			Student aux = lastStudent;
			lastStudent = stud;
			lastStudent.setNextStudent(aux);
			amount++;
		}
	}

	public void addPosition(Student stud, int position) {
		if(position != 0){
			int count = 0;
			Student previous = null;
			Student aux = lastStudent;
			while(count <= position){
				previous = aux;
				aux = aux.getNextStudent();
				count++;
			}
			lastStudent = previous;
			lastStudent.setNextStudent(stud);
			lastStudent = lastStudent.getNextStudent();
			lastStudent.setNextStudent(aux);
			amount++;
		}
		Student aux = lastStudent;
		lastStudent = stud;
		lastStudent.setNextStudent(aux);
		amount++;
	}

	public void removeForElement(Object element) {
		
	}

	public int size() {
		return amount;
	}
}
