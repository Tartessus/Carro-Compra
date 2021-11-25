package com.app.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.acing.Carrito;
import com.acing.Producto;

public class App {

	public static void main(String[] args) {

		final Carrito carro1 = new Carrito();
//		Collection<Producto> productos = new ArrayList<Producto>();
		
		Almacen[] almacen = new Almacen[4];
		
		
//	productos.add(new Producto(1, "Coca Cola", 6.01f));
//	productos.add(new Producto(2, "President", 0.72f));
//	productos.add(new Producto(5, "Oral B", 1.99f)); 
//	productos.add(new Producto(8, "Font Vella", 2.99f));
		
		almacen[0]= (new Almacen(1, 8));
		almacen[1]= (new Almacen(2, 3));
		almacen[2]= (new Almacen(5, 0));
		almacen[3]= (new Almacen(8, 1));
		
//		almacen.add(new Almacen(2, 3));  de cuando hice Collection en vez de Array
//		almacen.add(new Almacen(5, 0));
//		almacen.add(new Almacen(8, 1));

		carro1.addProducto(new Producto(1, "Coca Cola", 6.01f));
		carro1.addProducto(new Producto(2, "President", 0.72f));
		carro1.addProducto(new Producto(5, "Oral B", 1.99f));
		carro1.addProducto(new Producto(8, "Font Vella", 2.99f));

		System.out.println(carro1.getInformeCarrito());
		
		System.out.println(Arrays.toString(almacen));

	}

}
