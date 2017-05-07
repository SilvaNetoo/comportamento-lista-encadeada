package br.cesed.facisa.p3.arraylist;

public class Student {

	private Object element;
	protected Student nextStudent;

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}

	public Student getNextStudent() {
		return nextStudent;
	}

	public void setNextStudent(Student next) {
		this.nextStudent = next;
	}

	@Override
	public String toString() {
		return "Student [element=" + element + "]";
	}
	
	
}
