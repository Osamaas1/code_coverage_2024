package code_coverage_4.code_coverage_4;

import org.junit.Test;
import static org.junit.Assert.*;

public class Test_weak_method_1_a {
	
	WeakClass_1 tester= new WeakClass_1();
	
	@Test
	public void weakmethod1b() {
		int result = tester.weakMethod1(10, 2);
		int expected = 1;
		
		assertEquals(expected, result);
	}

	@Test
	public void weakmethod1b2() {
		int result = tester.weakMethod1(-10, 2);
		int expected = -1;
		
		assertEquals(expected, result);
	}


}
