
public class StudentRow {

	private Student firstStudent;
	private Student lastStudent;
	private int count;
	
	public boolean isEmpty(){
		return firstStudent == null && lastStudent == null;
	}
	
	//o metodo está retornando não apenas o primeiro estudante, mas toda a fila encadeada solicionar
	public Student firstOnRow(){
		return firstStudent;
	}
	
	//o metodo está retornando não apenas o primeiro estudante, mas toda a fila encadeada solicionar
	public Student lastOnRow(){
		return lastStudent;
	}
	
	public void enqueue(Student stud){
		if(isEmpty()){
			firstStudent = stud;
			lastStudent = stud;
			count++;
		} else {
			Student aux = lastStudent;
			lastStudent = stud;
			lastStudent.setNextStudent(aux);
			count++;
		}
	}
	
	public void dequeue(){
		if(!isEmpty()){
			Student previous = null;
			Student aux = lastStudent;
			while(aux.getNextStudent() != null){
				previous = aux;
				aux = aux.getNextStudent();
			}
			
			
			previous.setNextStudent(firstStudent);
			firstStudent = previous;
			count--;
		} else {
			System.out.println("Row is empty!");
		}
	}
	
	public int size(){
		return count;
	}
}
