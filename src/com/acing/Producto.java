package com.acing;

public class Producto {
	private int id;
	public String marca;
	private float precio;
	private String descripcion;

	
	public String getMarca() {
		return marca;
	}

	public float getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
	public Producto(String marca, float precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}
	
	public Producto(int id, String marca, float precio) {
		super();
		this.id = id;
		this.marca = marca;
		this.precio = precio;
	}
	
	public Producto(int id) {
		super();
		this.id = id;
		
	}


	@Override
	public String toString() {
		return descripcion + " - " + marca ;
	}
}
