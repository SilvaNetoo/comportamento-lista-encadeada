package br.cesed.facisa.p3.nolist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestStudentStack {

	StudentStack student;
	
	@Before
	public void TestStudentStack(){
		student = new StudentStack();
	}
	
	@Test
	public void testPush() {
		Student neto = new Student("Neto",21);
		student.push(neto);
		Student wesley = new Student("Wesley",21);
		student.push(wesley);
		Assert.assertEquals(student.top(),wesley);
	}

	@Test
	public void testPop(){
		Student neto = new Student("Neto",21);
		student.push(neto);
		Student wesley = new Student("Wesley",21);
		student.push(wesley);
		Student abella = new Student("Wesley",21);
		student.push(abella);
		Student mysael = new Student("Neto",21);
		student.push(mysael);
		student.pop();
		Assert.assertEquals(student.top(),abella);
	}
	
}