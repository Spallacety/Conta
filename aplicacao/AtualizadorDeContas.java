package br.edu.ifpi.banco.aplicacao;

import br.edu.ifpi.banco.modelo.Conta;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
	  this.selic = selic;
	}
	
	public void roda(Conta c) {
		
		double temp;
		System.out.printf("Saldo anterior: R$ %.2f\n", c.getSaldo());
		c.atualiza(selic);
		temp = c.getSaldo();
		System.out.printf("Saldo atual: R$ %.2f\n", temp);
		saldoTotal += temp;
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}
	
}