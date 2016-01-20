package br.edu.ifpi.banco.modelo;

public class ContaCorrente extends Conta{

	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa*2);
	}
	
	@Override
	public void deposita(double valor) {
		double temp = valor - 0.1;
		super.deposita(temp);
	}
}

