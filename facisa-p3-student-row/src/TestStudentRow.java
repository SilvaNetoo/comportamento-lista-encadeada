import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestStudentRow {

	StudentRow student;
	
	@Before
	public void testStudentRow(){
		student = new StudentRow();
	}
	
	@Test
	public void testIsEmpty(){
		Assert.assertEquals(student.isEmpty(), true);
	}
	
	@Test
	public void testFirstOnRow(){
		student.enqueue("Student 1");
		student.enqueue("Student 2");
		student.enqueue("Student 3");
		Assert.assertEquals(student.firstOnRow(), "Student 1" );
	}
	
	@Test
	public void testEnqueue(){
		student.enqueue("Student 1");
		student.enqueue("Student 2");
		student.enqueue("Student 3");
		student.enqueue("Student 4");
		Assert.assertEquals(student.isEmpty(), false);
	}
	
	@Test
	public void testDequeue(){
		student.enqueue("Student 1");
		student.enqueue("Student 2");
		student.enqueue("Student 3");
		student.dequeue();
		Assert.assertEquals(student.firstOnRow(), "Student 2");
	}

}
