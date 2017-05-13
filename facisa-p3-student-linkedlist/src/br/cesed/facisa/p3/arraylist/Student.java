package br.cesed.facisa.p3.arraylist;

public class Student {

	private String nome;
	private int age;
	protected Student nextStudent;

	public Student(String nome, int age) {
		this.nome = nome;
		this.age = age;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student getNextStudent() {
		return nextStudent;
	}

	public void setNextStudent(Student next) {
		this.nextStudent = next;
	}
	
}
