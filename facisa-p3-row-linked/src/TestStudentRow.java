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
		Student neto = new Student("Neto",21);
		student.enqueue(neto);
		Student wesley = new Student("Wesley",21);
		student.enqueue(wesley);
		Student abella = new Student("Abella",21);
		student.enqueue(abella);
		Student mysael = new Student("Mysael",21);
		student.enqueue(mysael);
		Assert.assertEquals(student.firstOnRow(), neto);
	}
	
	@Test
	public void testLastOnRow(){
		Student neto = new Student("Neto",21);
		student.enqueue(neto);
		Student wesley = new Student("Wesley",21);
		student.enqueue(wesley);
		Student abella = new Student("Abella",21);
		student.enqueue(abella);
		Student mysael = new Student("Mysael",21);
		student.enqueue(mysael);
		Assert.assertEquals(student.lastOnRow(), mysael);
	}
	
	@Test
	public void testEnqueue(){
		Student neto = new Student("Neto",21);
		student.enqueue(neto);
		Student wesley = new Student("Wesley",21);
		student.enqueue(wesley);
		Student abella = new Student("Wesley",21);
		student.enqueue(abella);
		Student mysael = new Student("Neto",21);
		student.enqueue(mysael);
		Assert.assertEquals(student.lastOnRow(),mysael);
	}
	
	@Test
	public void testDequeue(){
		Student neto = new Student("Neto",21);
		student.enqueue(neto);
		Student wesley = new Student("Wesley",21);
		student.enqueue(wesley);
		Student abella = new Student("Abella",21);
		student.enqueue(abella);
		student.dequeue();
		Assert.assertEquals(student.firstOnRow(), wesley);
	}

}
