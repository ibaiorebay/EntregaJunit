/**
 * 
 */
package org.cuatrovientos.dam.entornos.EjemploJunit.Ejer2_2;

import java.util.ArrayList;
import java.util.Random;
/**
 * Implementa la interfaz transporte
 */
public class Camioneta implements Transporte {
	private ArrayList<Paquete> listaPaquetes = new ArrayList<>();
	private Random random = new Random();

	/**
	 * @param paquete que llevará
	 */
	public void incluirPaquete(Paquete paquete) {
		listaPaquetes.add(paquete);
	}

	/**
	 * @return peso total
	 */

	public float pesoTotal() {
		float total = 0;
		for (Paquete paquete : listaPaquetes) {
			total += paquete.getPeso();
		}
		return total;
	}

	/**
	 * @return distancia aleatoria entre 70 y 100
	 */
	public int recorrerDistancia() {
		return random.nextInt(31) + 70;
	}

}
