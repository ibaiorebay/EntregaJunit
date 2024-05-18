package org.cuatrovientos.dam.entornos.EjemploJunit.Ejer12;
import java.util.Random;

public class GeneradorIp {
	/**
	 * @param numero minimo
	 * @param numero maximo
	 */
	public int generarNumero(int minimo, int maximo) {
		Random random = new Random();
		return random.nextInt (minimo + (maximo - minimo + 1));
	}

	/**
	 * @return
	 */
	public String generarIp() {
		return generarNumero(1, 254) + "." + generarNumero(0, 254) + "." + generarNumero(0, 254) + "." + generarNumero(1, 254);
	}
}
