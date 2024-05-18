package org.cuatrovientos.dam.entornos.EjemploJunit.Ejer2_2;

import java.util.Random;
import java.util.Vector;

/**
 * Implementa la interfaz transporte
 */
public class Trailer implements Transporte {
	private Random random = new Random();
	private Vector<Paquete> paquetes = new Vector<>();

	/**
	 * @param paquete añadido
	 */

	public void incluirPaquete(Paquete paquete) {
		paquetes.add(paquete);
	}
	
	/**
	 * @return El peso total que lleva el trailer
	 */

	public float pesoTotal() {
		float total = 0;
		for (Paquete paquete : paquetes) {
			total += paquete.getPeso();
		}
		return total;
	}
	/**
	 * @return distancia aleatoria entre 270 y 300
	 */
	public int recorrerDistancia() {
		return random.nextInt(31) + 270;
	}

}
