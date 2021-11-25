package com.app.App;

import com.acing.Producto;

public class Almacen {
	private Producto producto;
	private int id;
	private int Cantidad;
	private int numeroProductos;

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public int getid() {
		return id;
	}

//	public int void catalogoDeProductos(int nProductos) {
//		int productos=;
//		
//		return productos;
//	}
//	
	public Almacen(int id, int cantidad) {
		super();
		this.id = id;
		setCantidad(cantidad);

	}

//	public static void printArray(Almacen[] a) {
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);	
//			System.lineSeparator();
//		}
//	}
	
	@Override
	public String toString() {
		return "Elemento con ID " + id + " hay " + Cantidad + System.lineSeparator();
	}

}
