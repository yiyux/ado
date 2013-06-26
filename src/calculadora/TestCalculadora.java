package calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculadora {
	private Calculadora cal;
	
	@Before
	public void setUp(){
		cal = new Calculadora();
	}
	
	@Test
	public void testSumaDosNumeros() {
		cal.enter(5);
		cal.operation(op.add());
		cal.enter(5);
		assertEquals(10, cal.result());
	}
	
	
}
