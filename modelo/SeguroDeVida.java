package br.edu.ifpi.banco.modelo;

public class SeguroDeVida implements Tributavel{

	@Override
	public double calculaTributos() {
		return 42;
	}

	@Override
	public String toString() {
		return "Seguro de Vida";
	}
}
