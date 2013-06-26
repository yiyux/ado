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
		cal.add(3);
		assertEquals(8, cal.result());
	}
	
	@Test
	public void testSumaTresNumeros() {
		cal.enter(5);
		cal.add(3);
		cal.add(2);
		assertEquals(10, cal.result());
	}
	
	@Test
	public void testSumaCero() {
		cal.enter(5);
		cal.add(0);
		assertEquals(5, cal.result());
	}
	
}
