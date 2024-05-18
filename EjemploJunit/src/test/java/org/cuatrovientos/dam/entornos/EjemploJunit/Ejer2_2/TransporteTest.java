/**
 * 
 */
package org.cuatrovientos.dam.entornos.EjemploJunit.Ejer2_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class TransporteTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * añade un paquete al transporte y testea que el peso total de la camioneta sea el del paquete
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22.Transporte#pesoTotal()}.
	 */
	@Test
	void testPesoTotal() {
		Transporte camioneta = new Camioneta();
		Paquete paquete = new Paquete("Pamplona", 100.0f);
		camioneta.incluirPaquete(paquete);
		float expectedPeso = camioneta.pesoTotal();
		assertEquals(100.0f, expectedPeso);
	}

	/**
	 * comprueba que la distancia recorrida sea mayor que 70 y menor que 100. 
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22.Transporte#recorrerDistancia()}.
	 */
	@Test
	void testRecorrerDistancia() {
		Transporte camioneta = new Camioneta();
		int distancia = camioneta.recorrerDistancia();
		assertTrue(distancia >= 70 && distancia <= 100);
	}

}
