package com.cliente;

import java.util.*;

import com.interfaces.*;
import com.pojo.Empleado;

public class Principal0 {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",15,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,60.03));
		
		PredicadoEmpleado pe01 = new MayorEdadA();
		PredicadoEmpleado pe02 = new SueldoMayorA();
<<<<<<< HEAD
		PredicadoEmpleado pe03= new NombreMayorA();
=======
		PredicadoEmpleado pe03 = new NombreLetrasMayorA();
>>>>>>> ff196a6c82a786d496b6733e0d5dc91eb6a3776b
		
		System.out.println("Empleados con edad mayor a 20 años");
		for (Empleado e:listaEmpleados) 
			if (pe01.probar(e))
				System.out.println(e);
		
		
		System.out.println("Empleados ganan mas de 45");
		for (Empleado e:listaEmpleados) 
			if (pe02.probar(e))
				System.out.println(e);
		
<<<<<<< HEAD
		System.out.println("Empleados con mas de 6 letras en el nombre");
		for (Empleado e:listaEmpleados) 
			if (pe03.probar(e))
				System.out.println(e);
	
=======
		System.out.println("Empleados cuyo nombre es mayor a 6");
		for (Empleado e:listaEmpleados) 
			if (pe03.probar(e))
				System.out.println(e);
		
		
		
>>>>>>> ff196a6c82a786d496b6733e0d5dc91eb6a3776b
	}

}
