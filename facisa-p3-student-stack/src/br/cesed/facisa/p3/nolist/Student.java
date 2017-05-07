package br.cesed.facisa.p3.nolist;

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
}
