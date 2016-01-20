package br.edu.ifpi.banco.modelo;

public class Banco {
	
	Conta[] contas;
	int contador;
	
	public Banco(int numeroDeContas){
		this.contas = new Conta[numeroDeContas];
	}
	
	public void adiciona(Conta c){
	}
	
}
