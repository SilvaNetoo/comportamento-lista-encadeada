import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestOwnRow {

	OwnRow myRow;
	
	@Before
	public void TestOwnRow(){
		myRow = new OwnRow(3);
	}
	
	@Test
	public void testEnqueue(){
		myRow.enqueue("Neto");
		myRow.enqueue("Victor");
		myRow.enqueue("Wesley");
		Assert.assertEquals(myRow.size(), 3);
	}

	@Test
	public void testDequeue(){
		myRow.enqueue("Neto");
		myRow.enqueue("Victor");
		myRow.enqueue("Wesley");
		myRow.dequeue();
		Assert.assertEquals(myRow.firstOnRow(), "Victor");
	}
	
	@Test
	public void testFirstOnRow(){
		myRow.enqueue("Neto");
		myRow.enqueue("Victor");
		myRow.enqueue("Wesley");
		Assert.assertEquals(myRow.firstOnRow(), "Neto");
	}
	
	@Test
	public void testLastOnRow(){
		myRow.enqueue("Neto");
		myRow.enqueue("Victor");
		myRow.enqueue("Wesley");
		Assert.assertEquals(myRow.lastOnRow(), "Wesley");
	}
	
	@Test
	public void testIsEmpty(){
		Assert.assertEquals(myRow.isEmpty(), true);
	}
}
