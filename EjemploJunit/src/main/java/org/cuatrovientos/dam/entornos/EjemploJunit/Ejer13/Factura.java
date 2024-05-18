package org.cuatrovientos.dam.entornos.EjemploJunit.Ejer13;

import java.util.Vector;

public class Factura {
	private Vector<Producto> productos = new Vector();

	/**
	 * @param producto añadido a la lista
	 */
	public void meterProducto(Producto prod) {
		productos.add(prod);
	}

	/**
	 * @return total de la compra
	 */
	public float totalFactura() {
		float total = 0;
		for (Producto prod : productos) {
			total += prod.precioTotal();
		}
		return total;

	}
	
	/**
	 * @param iva pasado
	 * @return
	 */
	public float aplicarIva(float iva) {
		float total = totalFactura();
		return total + (total * iva / 100);

	}
}
