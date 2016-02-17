package br.edu.ifpi.banco.aplicacao;

import br.edu.ifpi.banco.modelo.*;

public class TestaDeposita {
	
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.deposita(-2);
		try{
			cc.deposita(-100);
		} catch(ValorInvalidoException e) {
			System.out.println("Você tentou depositar um valor inválido!");
		}
	}
}
