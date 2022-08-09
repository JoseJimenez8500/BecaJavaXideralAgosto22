package com.curso.v3;

import java.util.*;

public class Cliente {

	public static void main(String[] args) {
		
		
		
		ComponentExpresion e1 = new LeafConstante(4);
		ComponentExpresion e2 = new LeafConstante(6);
		ComponentExpresion e3 = new LeafConstante(200);
		ComponentExpresion e4 = new LeafConstante(3);
		ComponentExpresion e5 = new LeafConstante(83);
		
		ComponentExpresion e6 = new CompositeResta(e1,e2);
		ComponentExpresion e7 = new CompositeMultiplicacion(e6,e3);
		ComponentExpresion e8 = new CompositeSuma(e4,e5);
		ComponentExpresion e9 = new CompositeDivision(e7,e8);
		
		System.out.println(e9.getValor());

	}

}
