package org.cuatrovientos.dam.entornos.EjemploJunit.Ejer13;

public class Producto {
	private String nombre;
	private float precio;
	private int cantidad;

	/**
	 * Parametros para crear el producto
	 * @param nombre
	 * @param precio
	 * @param cantidad
	 */
	public Producto(String nombre, float precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	/**
	 * @return precio total de un producto
	 */
	public float precioTotal() {
		return this.precio * cantidad;
	}

	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


}
