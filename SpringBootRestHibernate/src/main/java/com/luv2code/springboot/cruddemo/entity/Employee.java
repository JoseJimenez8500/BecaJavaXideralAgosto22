package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.*;
import lombok.*;

@Data 
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name="cliente")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="telefono")
	private String telefono;
	
<<<<<<< HEAD
		
	// define constructors
	
	public Employee() {
	}

	

	public Employee(String nombre, String apellido, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

<<<<<<< HEAD


=======
	public Employee(int id,String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
>>>>>>> 6415283e0ea6e59e4468fae644e27f231f12ca39
	// define getter/setter
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	

	// define tostring

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
	}
	


	
		
=======
>>>>>>> 7d833ccdd5bfa883e9a7f65711f1a86c0f2cdc87
}











