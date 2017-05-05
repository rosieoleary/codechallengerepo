package Marina;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarinaTest {
	
	Marina testmarina = new Marina("testname","testaddress",0);
	@Test
	public void testGetname(){
		
		assertEquals(testmarina.getName(),"testname");	
	}
	@Test
	public void testSetName(){
		testmarina.setName("newtestname");
		assertEquals(testmarina.getName(),"newtestname");
	}
	
	@Test
	public void testgetaddress(){
		assertEquals(testmarina.getAddress(),"testaddress");
	}
	//@Test
	//public void testsetadd

	@Test
	public void testgetnumOfBoats() {
		assertEquals(testmarina.getNumOfBoats(),0);
	}
	public void testsetNumOfBoats(){
		testmarina.setNumOfBoats(-10);
		assertEquals(testmarina.getNumOfBoats(),0);
	}
	public void testsetNumOfBoats2(){
		testmarina.setNumOfBoats((10));
		assertEquals(testmarina.getNumOfBoats(),10);
	}

}
