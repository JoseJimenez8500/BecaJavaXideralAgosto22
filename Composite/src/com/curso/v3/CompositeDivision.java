package com.curso.v3;

public class CompositeDivision implements ComponentExpresion {
	
	ComponentExpresion ceIzquierda;
	ComponentExpresion ceDerecha;
	
	public CompositeDivision(ComponentExpresion x, ComponentExpresion y) {
		ceIzquierda = x;
		ceDerecha = y;
	}

	@Override
	public double getValor() {
		return ceIzquierda.getValor() / ceDerecha.getValor();
	}

}
