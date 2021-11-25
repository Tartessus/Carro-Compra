package com.acing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Carrito {
	private List<Producto> productos = new ArrayList<Producto>();

	public boolean addProducto(Producto producto) {
		boolean solucion = false;
		int tamaño = productos.size();
		productos.add(producto);
		if (tamaño < productos.size()) {
			solucion = true;
		}
		return solucion;
	}

	public float getValorCarrito() {
		float valor = 0f;
		for (Producto producto : productos) {
			valor += producto.getPrecio();
		}

		return valor;
	}

	public String getInformeCarrito() {
		String listado = "";
		float sumatorio = 0;
		Collections.sort(productos, new ComparaProductos());
		for (Producto producto : productos) {
			sumatorio += producto.getPrecio();
			listado += producto.getMarca() + " " + producto.getPrecio()+ "€" + System.lineSeparator();
		}
		return listado + System.lineSeparator() + "\t" + "Total " + sumatorio + System.lineSeparator();
	}

}
