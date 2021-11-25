package com.acing;

import java.util.Comparator;

public class ComparaProductos implements Comparator<Producto> {

	@Override
	public int compare(Producto producto1, Producto producto2) {
		int comparacion = 0;
		comparacion = Float.floatToIntBits(producto1.getPrecio()) - Float.floatToIntBits(producto2.getPrecio());
		return comparacion;
	}

}
