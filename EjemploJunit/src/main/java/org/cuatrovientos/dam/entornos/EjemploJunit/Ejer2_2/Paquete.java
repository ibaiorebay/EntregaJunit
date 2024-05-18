package org.cuatrovientos.dam.entornos.EjemploJunit.Ejer2_2;

public class Paquete {
	private String destino;
	private float peso;
	/**
	 * @param destino
	 * @param peso
	 */
	public Paquete(String destino, float peso) {
		this.destino = destino;
		this.peso = peso;
	}
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String toString() {
		return "Paquete [destino=" + destino + ", peso=" + peso + "]";
	}
}