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
		student.insertLast("Student 1");
		student.insertLast("Student 2");
		student.insertLast("Student 3");
		student.insertLast("Student 4");
		Assert.assertEquals(student.startDeque(), "Student 1");
	}
	
	@Test
	public void testEndOfTheDeque(){
		student.insertLast("Student 1");
		student.insertLast("Student 2");
		student.insertLast("Student 3");
		student.insertLast("Student 4");
		Assert.assertEquals(student.endOfTheDeque(), "Student 4");		
	}
	
	@Test
	public void testInsertFirst(){
		student.insertLast("Student 1");
		student.insertLast("Student 2");
		student.insertLast("Student 3");
		student.insertFirst("Student 4");
		Assert.assertEquals(student.startDeque(), "Student 4");
	}
	
	@Test
	public void testInsertLast(){
		student.insertLast("Student 1");
		student.insertLast("Student 2");
		student.insertLast("Student 3");
		student.insertLast("Student 4");
		Assert.assertEquals(student.endOfTheDeque(), "Student 4");
	}
	
	@Test
	public void tetRemoveFirst(){
		student.insertLast("Student 1");
		student.insertLast("Student 2");
		student.insertLast("Student 3");
		student.insertLast("Student 4");
		student.removeFirst();
		Assert.assertEquals(student.startDeque(), "Student 2");
	}

}
