package br.cesed.facisa.p3.nolist;

/**
 * Class representing the behavior of a stack
 * @author Neto
 *
 */
public class StudentStack {

	private Student student;
	private int sizeStack;
	
	/**
	 * Add the student at last position of stack
	 * @param element 
	 */
	public void push(Object element){
		if(student == null){
			Student auxStudent = new Student();
			auxStudent.setElement(element);
			auxStudent.setNextStudent(student);
			student = auxStudent;
			sizeStack++;
		}else{
			Student auxStudent = new Student();
			auxStudent.setElement(element);
			auxStudent.setNextStudent(student);
			student = auxStudent;
			sizeStack++;
		}
	}
	
	/**
	 * Remove the student that's on last position of stack
	 * @throws Exception The exception thrown if the stack size is less than zero 
	 */
	public void pop() throws Exception{
		if(sizeStack >= 0){
			student = student.getNextStudent();
			sizeStack--;
		}else{
			throw new Exception("Stack is empty!");
		}		
	}
	
	/**
	 * Return the last student of the stack
	 * @return student return last student
	 * @throws Exception The exception thrown if the stack size is greater than zero
	 */
	public Object top() throws Exception{
		if(sizeStack <= 0){
			throw new Exception("Stack is empty!");
		}
		return student.getElement();
	}
	
	void imprime() {
		for (Student q = this.student; q != null; q = q.nextStudent){
			System.out.println(q);
		}
	}
}
