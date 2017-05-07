package br.cesed.facisa.p3.nolist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestStudentStack {

	StudentStack knot;
	
	@Before
	public void TestStudentStack(){
		knot = new StudentStack();
	}
	
	@Test
	public void testPush() {
		knot.push("Silva Neto");
		knot.push("Victor Pontes");
		knot.push("Magno Dantas");
		try {
			Assert.assertEquals(knot.top(), "Magno Dantas");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testPop(){
		knot.push("Silva Neto");
		knot.push("Victor Pontes");
		knot.push("Magno Dantas");
		knot.push("José Victor");
		try {
			knot.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Assert.assertEquals(knot.top(), "Magno Dantas");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTop(){
		knot.push("Silva Neto");
		knot.push("Victor Pontes");
		knot.push("Magno Dantas");
		try {
			Assert.assertEquals(knot.top(), "Magno Dantas");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}