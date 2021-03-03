package com.example.demo.model;

public class Persona {

	
	public Persona() {
		
	}
	
	public Persona(String nombre, int telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	private String nombre;
	private int telefono;
	
	
}
