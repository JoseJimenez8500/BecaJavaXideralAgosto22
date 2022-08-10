package com.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.curso.v0.*;

class TestComposite {

	@Test
	void testDouble() {
		double d1 = 5.0;
		assertEquals(5.0,d1);	
	}
	
	@Test
	void testDoubleSuma() {
		double d1 = 5.0;
		double d2 = 4.9;
		double r = d1+d2;
		assertEquals(9.9,r);	
	}
	
	@Test
	void testConstante1() {
		double testValor = 6.6;
		Expresion e = new Constante(testValor);
		assertEquals(testValor,e.getValor());
	}
	
	@Test
	void testConstante2() {
		Expresion e = new Constante(8.4);
		assertEquals(8.4,e.getValor());
	}
	
	@Test
	void testSuma() {
		double testValorA = 4.5;
		double testValorB = 8.9;
		Expresion left = new Constante(testValorA);
		Expresion right = new Constante(testValorB);
		Expresion e = new Suma(left,right);
		assertEquals(13.4,e.getValor());
	}
	
	@Test
	void testResta() {
		double testValorA = 4.5;
		double testValorB = 8.9;
		Expresion left = new Constante(testValorA);
		Expresion right = new Constante(testValorB);
		Expresion e = new Resta(left,right);
		assertEquals(-4.4,e.getValor());
	}
	
	@Test
	void testSuma1() {
		double testValorA = 4.5;
		double testValorB = 8.9;
		Expresion left = new Constante(testValorA);
		Expresion right = new Constante(testValorB);
		Expresion e1 = new Suma(right,left);
		Expresion e2 = new Resta(e1,right);
		assertEquals(4.5,e2.getValor());
	}
	
	@Test
	void testSuma2() {
		double testValorA = 4.5;
		double testValorB = 8.9;
		Expresion e = new Resta(
				new Suma(
						new Constante(testValorB),
						new Constante(testValorA)
						),
				new Constante(testValorB));
		assertEquals(4.5,e.getValor());
	}
	
	@Test
	public void testExpresionCompleja() {
		Expresion e = 
				new Division(
						new Multi(
								new Resta(
										new Constante(4.0),
										new Constante(6.0)
										),
								new Constante(200.0)
						),
						new Suma(
								new Constante(3),
								new Constante(83)
								)
								
						);
		
						
		assertEquals(-0.0001162, e.getValor(), 0.000001);
	}

}
