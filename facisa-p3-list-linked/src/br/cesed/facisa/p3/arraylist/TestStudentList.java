package br.cesed.facisa.p3.arraylist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudentList {

	private NArrayList student;
	
	@Before
	public void TestStudentList(){
		student = new NArrayList();
	}
	
	@Test
	public void testSize() {
		Student neto = new Student("Neto", 21);
		student.add(neto);
		Student wesley = new Student("Wesley", 21);
		student.add(neto);
		Student victor = new Student("Victor", 21);
		student.add(victor);
		Assert.assertEquals(student.size(), 3);
	}

	@Test
	public void testAdd(){
		Student neto = new Student("Neto", 21);
		student.add(neto);
		Student wesley = new Student("Wesley", 21);
		student.add(neto);
		Student victor = new Student("Victor", 21);
		student.add(victor);
		Assert.assertEquals(student.lastStudent(), victor);
	}
	
	@Test
	public void testAddPosition(){
		Student neto = new Student("Neto", 21);
		student.add(neto);
		Student wesley = new Student("Wesley", 21);
		student.add(neto);
		Student victor = new Student("Victor", 21);
		student.add(victor);
		Student abella = new Student("Abella", 21);
		student.addPosition(abella, 1);
		Assert.assertEquals(student.lastStudent(), victor);
	}
	
	@Test
	public void testRemoveForElement(){
		
	}
}
