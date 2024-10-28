module app.calculo {

	requires transitive app.logging;

	exports br.com.cod3r.app.calculo;
	exports br.com.cod3r.app.calculo.interno to app.financeiro;

	//opens br.com.cod3r.app.calculo to app.financeiro, app.logging; // abre especificamente aquele pacote para as devidas
																	// modificações, ele modifica até atributos privados.


	requires app.api;
	//no código abaixo está informando que o modulo app.calculo prove uma implementação da Calculadora para Calculadoraimpl. 
	provides br.com.cod3r.app.Calculadora with br.com.cod3r.app.calculo.Calculadoraimplementacao;
}