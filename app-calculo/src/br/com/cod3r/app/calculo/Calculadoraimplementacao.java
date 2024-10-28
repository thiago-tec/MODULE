package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacaoesAritmeticas;
import br.com.cod3r.app.logging.Logger;

public class Calculadoraimplementacao implements Calculadora {
	
	private String id = "abc";

	private OperacaoesAritmeticas op = new OperacaoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("somando... ");
		return op.soma(nums);
	}
	
	public Class<Logger> getLoggerClass(){
		return Logger.class;
	}

	public String getId() {
		return id;
	}


	
	
}
