package org.cuatrovientos.dam.entornos.EjemploJunit.Ejer13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

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
	 * Crea una instancia de producto y comprueba que cada uno de sus atributos se ha iniciado
	 * correctamente, es decir, si hago Producto p = new Producto(“pan”,0.50f, 1);
	 * entonces p.getName() debe ser igual a “pan”. 
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13.Producto#Producto(java.lang.String, float, int)}.
	 */
	@Test
	void testProducto() {
		Producto p = new Producto("pan", 0.50f, 1);
		
		String expectedNombre = p.getNombre();
		float expectedPrecio = p.getPrecio();
		int expectedCantidad = p.getCantidad();
		assertEquals("pan", expectedNombre, "El nombre del producto no es correcto");
		assertEquals(0.50f, expectedPrecio, "El precio del producto no es correcto");
		assertEquals(1, expectedCantidad, "La cantidad del producto no es correcto");
	}

	/**
	 * testea que el precio del producto * la cantidad es correcto
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13.Producto#precioTotal()}.
	 */
	@Test
	void testPrecioTotal() {
		Producto p = new Producto("pan", 0.50f, 3);
		float expectedTotal = p.precioTotal();
		assertEquals(1.50f, expectedTotal, "El precio total no es el correcto");
	}

}
