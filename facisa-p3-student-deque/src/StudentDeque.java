
public class StudentDeque {

	private Student firstStudent;
	private Student lastStudent;
	private int count;
	
	public boolean isEmpty(){
		boolean empty = false;
		
		if(count == 0){
			empty = true;
		}

		return empty;
	}
	
	public Object startDeque(){
		Student aux = null;
		if(!isEmpty()){
			aux = firstStudent;
		} else {
			System.out.println("Deque is empty!");
		}
		
		return aux.getObj();
	}
	
	public Object endOfTheDeque(){
		Student aux = null;
		if(!isEmpty()){
			aux = lastStudent;
		} else {
			System.out.println("Deque is empty!");
		}
		
		return aux.getObj();
	}
	
	public void insertFirst( Object obj){
		if(lastStudent == null){
			firstStudent = new Student();
			lastStudent = firstStudent;
			Student aux = new Student();
			aux.setObj(obj);
			aux.setNextStudent(firstStudent);
			firstStudent = aux;
			count++;
		} else {
			Student aux = new Student();
			aux.setObj(obj);
			aux.setNextStudent(firstStudent);
			firstStudent = aux;
			count++;
		}
	}
	
	public void insertLast(Object obj){
		Student aux = new Student();
		aux.setObj(obj);
		if(count == 0){
			aux.setNextStudent(lastStudent);
			firstStudent = aux;
			lastStudent = firstStudent;
		} else {
			lastStudent.setNextStudent(aux);
			lastStudent = aux;
		}
		
		count++;
	}
	
	public void removeFirst(){
		if(count != 0){
			firstStudent = firstStudent.getNextStudent();
			count--;
		} else {
			System.out.println("Deque is empty!");
		}
	}
}
