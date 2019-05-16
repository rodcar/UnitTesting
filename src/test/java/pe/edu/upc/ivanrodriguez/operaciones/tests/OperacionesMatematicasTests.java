package pe.edu.upc.ivanrodriguez.operaciones.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pe.edu.upc.ivanrodriguez.operaciones.OperacionesMatematicas;

public class OperacionesMatematicasTests {

	private OperacionesMatematicas operacionesMatematicas;
	private double a, b, esperado, actual;
	private final double DELTA = 0.001;
	
	@Before
	public void setUp() throws Exception {
		operacionesMatematicas = new OperacionesMatematicas();
	}

	@Test
	public void testSuma() {
		a = 5.0;
		b = 3.0;
		esperado = 8.0;
		actual = operacionesMatematicas.suma(a, b);
		
		assertEquals(esperado, actual, DELTA);
	}
	
	@Test
	public void testResta() {
		a = 10;
		b = 3;
		esperado = 7;
		actual = operacionesMatematicas.resta(a, b);
		
		assertEquals(esperado, actual, DELTA);
	}
	
	@Test
	public void testMultiplicaion() {
		a = 15;
		b = 4;
		esperado = 60;
		actual = operacionesMatematicas.multiplicacion(a, b);
		
		assertEquals(esperado, actual, DELTA);
	}

	@Test
	public void testDivision() {
		a = 30;
		b = 3;
		esperado = 10;
		actual = operacionesMatematicas.division(a, b);
		
		assertEquals(esperado, actual, DELTA);
	}
}
