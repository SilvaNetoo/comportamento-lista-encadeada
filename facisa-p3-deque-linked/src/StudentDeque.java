public class StudentDeque {

	private Student firstStudent;
	private Student lastStudent;
	private int count;
	
	public boolean isEmpty(){
		return firstStudent == null && lastStudent == null;
	}
	
	public Student startDeque(){
		return firstStudent;
	}
	
	public Student endOfTheDeque(){
		return lastStudent;
	}
	
	public void insertFirst(Student stud){
		
		//se não tem ninguém, stud é o início e o fim
		if(isEmpty()) {
			firstStudent = stud;
			lastStudent = stud;
		}
		
		Student aux = firstStudent;
		firstStudent = stud;
		firstStudent.setNext(aux);
	}
	
	public void insertLast(Student stud){
		
		//se não tem ninguém, stud é o início e o fim
		if(isEmpty()) {
			firstStudent = stud;
			lastStudent = stud;
		}
		
		lastStudent.setNext(stud);
		lastStudent = stud;
	}
	
	public void removeFirst(){
		
		if(firstStudent == null || firstStudent.getNext() == null) { //só tem um elemento
			firstStudent = null;
			lastStudent = null;
		} else  { 
			Student aux = firstStudent.getNext();
			firstStudent = aux;
		} 
		
	}
	
	public void removeLast(){
		
		if(firstStudent == null || firstStudent.getNext() == null) { //só tem um elemento
			firstStudent = null;
			lastStudent = null;
		} else  { 
			Student aux = firstStudent.getNext();

			//segue até o final
			while(aux.getNext() != null) {
				if(aux.getNext() != null) {
					aux.setNext(null);
					break;
				}
				aux = aux.getNext();
			}
		} 
		
		
	}
}