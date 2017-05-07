package br.cesed.facisa.p3.arraylist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TestStudentList {

	private NArrayList nList;
	
	@Before
	public void TestStudentList(){
		nList = new NArrayList();
	}
	@Test
	public void testSize() {
		nList.add("Object 1");
		nList.add("Object 2");
		nList.add("Object 3");
		nList.add("Object 4");
		nList.add("Object 5");
		nList.add("Object 6");
		Assert.assertEquals(nList.size(), 6);
	}

	@Test
	public void testAddPosition(){
		nList.add("Object 1");
		nList.add("Object 2");
		nList.add("Object 3");
		nList.showStudents();
		nList.addPosition("Object 4", 3);
		nList.showStudents();
		Assert.assertEquals(nList.size(), 4);
	}
	
	@Test
	public void testRemoveForElement(){
		nList.add("Object 1");
		nList.add("Object 2");
		nList.add("Object 3");
		nList.removeForElement("Object 3");
		Assert.assertEquals(nList.size(), 2);
	}
}
