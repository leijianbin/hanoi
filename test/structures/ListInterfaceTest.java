package structures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import structures.ListInterface;
import config.Configuration;

public class ListInterfaceTest {

	private ListInterface<Integer> impl;

	@Before
	public void setup() {
		impl = Configuration.getListInterfaceImplemenation();
		if(impl == null)
			fail("The BasicMath implementation is not specified in the Configuration class.");
	}

	@Test (timeout = 5000)
	public void testList1() {
		assertEquals("Newly constructed list should have size 0", 0, impl.size());
		assertEquals("Appending the list should return itself.", impl, impl.append(5));
		assertEquals("Size should now be 1.", 1, impl.size());
		impl.append(6).append(7).append(8);
		assertEquals("Size should now be 4.", 4, impl.size());
		assertEquals("First element should be 5.", new Integer(5), impl.remove(0));
		assertEquals("Second element should be 6.", new Integer(6), impl.remove(0));
		assertEquals("Third element should be 7.", new Integer(7), impl.remove(0));
		assertEquals("Fourth element should be 8.", new Integer(8), impl.remove(0));
		assertEquals("Size should now be 0.", 0, impl.size());
	}
	
	@Test (timeout = 5000)
	public void testList2() {
		assertEquals("Newly constructed list should have size 0", 0, impl.size());
		assertEquals("Appending the list should return itself.", impl, impl.append(5));
		assertEquals("Size should now be 1.", 1, impl.size());
		impl.append(6).append(7).append(8);
		assertEquals("Size should now be 4.", 4, impl.size());
		assertEquals("Second element should be 6.", new Integer(6), impl.remove(1));
		assertEquals("First element should be 5.", new Integer(5), impl.remove(0));
		assertEquals("List should contain 2 more elements.", 2, impl.size());
		impl.append(9).append(10);
		assertEquals("Size should now be 4.", 4, impl.size());
		
		assertEquals("Fourth element should be 10.", new Integer(10), impl.remove(3));
		assertEquals("Second element should be 8.", new Integer(8), impl.remove(1));
	}
	
	@Test (timeout = 5000)
	public void testListUnbounded() {
		for(int i = 0; i < 500000; i++)
			impl.append(i);
	}
	
	@Test (timeout = 5000, expected = NullPointerException.class)
	public void testNullPointer(){
		impl.append(null);
	}
	
	@Test (timeout = 5000, expected = IndexOutOfBoundsException.class)
	public void testOutOfBounds1(){
		impl.append(5).append(6).append(7);
		impl.remove(5);
	}
	
	@Test (timeout = 5000, expected = IndexOutOfBoundsException.class)
	public void testOutOfBounds2(){
		impl.append(5).append(6).append(7);
		impl.remove(-3);
	}

}
