package calculator;

import junit.framework.TestCase;

public class CalculatorMainTest extends TestCase{

	public void testAdd(){
		assertEquals(60, new CalculatorFunction().add(10, 50));
	}
	
	public void testSub(){
		assertEquals(50, new CalculatorFunction().sub(100, 50));
	}
	
	public void testMul(){
		assertEquals(500, new CalculatorFunction().mul(10, 50));
	}
	
	public void testDiv(){
		assertEquals(20, new CalculatorFunction().div(1000, 50));
	}
	
	public void testFact(){
		assertEquals(24, new CalculatorFunction().fact(4));
	}

}
