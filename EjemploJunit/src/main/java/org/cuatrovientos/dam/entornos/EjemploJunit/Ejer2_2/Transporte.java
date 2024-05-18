/**
 * 
 */
package org.cuatrovientos.dam.entornos.EjemploJunit.Ejer2_2;

public interface Transporte {
	/**
	 * @param paquete añadido
	 */
	public void incluirPaquete(Paquete paquete);

	/**
	 * @return peso Total
	 */
	public float pesoTotal();

	/**
	 * @return distanciaRecorrida
	 */
	public int recorrerDistancia();
}
