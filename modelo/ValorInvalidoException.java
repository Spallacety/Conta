package br.edu.ifpi.banco.modelo;

public class ValorInvalidoException extends RuntimeException {
	
	public ValorInvalidoException() {
	}

	public ValorInvalidoException(double valor){
		super("Valor invalido: "+valor);
	}
}
