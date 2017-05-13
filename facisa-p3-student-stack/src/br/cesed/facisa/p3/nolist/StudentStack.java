package br.cesed.facisa.p3.nolist;

/**
 * Class representing the behavior of a stack
 * @author Neto
 *
 */
public class StudentStack {

	private Student firstStudent;
	private Student lastStudent;
	
	/**
	 * Return true or false depending of the condition
	 * @return true or false
	 */
	public boolean isEmpty(){
		return firstStudent == null && lastStudent == null;
	}
	
	/**
	 * Add the student at last position of stack
	 * @param stud 
	 */
	public void push(Student stud){
		if(isEmpty()){
			firstStudent = stud;
			lastStudent = stud;
		}else{
			lastStudent.setNext(stud);
			lastStudent = stud;
		}
	}
	
	/**
	 * Remove the student that's on last position of stack
	 * @throws Exception The exception thrown if the stack size is less than zero 
	 */
	public void pop(){
		if(!isEmpty()){
			Student previous = null;
			Student aux = firstStudent;
			 while(aux.getNext() != null){
				 previous = aux;
				 aux = aux.getNext();
			 }
			lastStudent = previous;
			previous.setNext(lastStudent);
		} else {
			System.out.println("Pilha is empty!");
		}
		
	}
	
	/**
	 * Return the last student of the stack
	 * @return student return last student
	 * @throws Exception The exception thrown if the stack size is greater than zero
	 */
	public Student top(){
		if(!isEmpty()){
			return lastStudent;
		}else{
			System.out.println("Pilha is empty!");
		}
		return null;
		
	}
}
