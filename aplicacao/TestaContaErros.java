package br.edu.ifpi.banco.aplicacao;

import br.edu.ifpi.banco.modelo.*;

public class TestaContaErros {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente();
		
		conta.deposita(1000);
		conta.saca(15);
		
		System.out.println(conta);
		
	}
}
