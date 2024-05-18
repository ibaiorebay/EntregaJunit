package org.cuatrovientos.dam.entornos.EjemploJunit.Ejer12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneradorIpTest {
	/**
	 * confirmar que se genera un numero entre 0 y 254, ejecutado 100 veces
	 */
	@Test
	void testGenerarNumero() {
		GeneradorIp generador = new GeneradorIp();

		for (int i = 0; i < 1000; i++) {
			// Expected debe ser un numero entre 0 y 254
			// Actual
			int actual = generador.generarNumero(0, 254);
			// Assert
			assertTrue(actual >= 0 && actual <= 254);
		}
	}

	/**
	 * no debe empezar ni terminar en 0
	 */
	void testGeneraIp() {
		GeneradorIp generador = new GeneradorIp();
		// Actual
		String ip = generador.generarIp();
		// Assert
		assertFalse(ip.startsWith("0.") || ip.endsWith(".0"));
	}
}
