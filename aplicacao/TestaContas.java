package br.edu.ifpi.banco.aplicacao;

import br.edu.ifpi.banco.modelo.*;

public class TestaContas {
	  
	public static void main(String[] args) {
		  
	    ContaCorrente cc = new ContaCorrente();
	    ContaPoupanca cp = new ContaPoupanca();
	  
	    cc.deposita(1000); 
	    cp.deposita(1000);
	  
	    AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
	    
	    adc.roda(cc);
	    adc.roda(cp);
	    
	    System.out.printf("Saldo Total: R$ %.2f", adc.getSaldoTotal());
	}
}