
public class StudentRow {

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
	
	public Object firstOnRow(){
		Student aux = null;
		if(!isEmpty()){
			aux = firstStudent;
		}else{
			System.out.println("Row is empty!");
		}
		 return aux.getObj();
	}
	
	public void enqueue(Object obj){
		Student aux = new Student();
		aux.setObj(obj);
		if(this.count == 0){
			aux.setNextStudent(lastStudent);
			firstStudent = aux;
			lastStudent = firstStudent;
		}else{
			lastStudent.setNextStudent(aux);
			lastStudent = aux;
		}
		count++;
	}
	
	public void dequeue(){
		if(count != 0){
			firstStudent = firstStudent.getNextStudent();
			count--;
		} else {
			System.out.println("Row is empty!");
		}
	}
}
