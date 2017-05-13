import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestStudentDeque {

	StudentDeque student;
	
	@Before
	public void testeStudentDeque(){
		student = new StudentDeque();
	}
	
	@Test
	public void testIsEmpty(){
		Assert.assertEquals(student.isEmpty(), true);
	}
	
	@Test
	public void testStartDeque(){
		Student neto = new Student("Neto",21);
		student.insertLast(neto);
		Assert.assertEquals(student.startDeque(),neto);
	}
	
	@Test
	public void testEndOfTheDeque(){
		Student neto = new Student("Neto",21);
		student.insertFirst(neto);
		Student wesley = new Student("Wesley",21);
		student.insertFirst(wesley);
		Assert.assertEquals(student.endOfTheDeque(), neto);
	}
	
	@Test
	public void testInsertFirst(){
		Student neto = new Student("Neto",21);
		student.insertFirst(neto);
		Student wesley = new Student("Wesley",21);
		student.insertFirst(wesley);
		Assert.assertEquals(student.startDeque(), wesley);
	}
	
	@Test
	public void testInsertLast(){
		Student neto = new Student("Neto",21);
		student.insertLast(neto);
		Student wesley = new Student("Wesley",21);
		student.insertLast(wesley);
		Student abella = new Student("Abella",30);
		student.insertLast(abella);
		Assert.assertEquals(student.endOfTheDeque(), abella);
	}
}