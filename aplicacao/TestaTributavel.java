package br.edu.ifpi.banco.aplicacao;

import br.edu.ifpi.banco.modelo.*;

public class TestaTributavel {

	public static void main(String[] args) {
	
		ContaCorrente cc = new ContaCorrente();
		
		cc.deposita(100);
		
		System.out.println(cc.calculaTributos());

		Tributavel t = cc;
		
		System.out.println(t.calculaTributos());
		
	}
}
