module app.financeiro {
	
	requires java.base; //por padrão esse modulo já vem importado
	//requires app.calculo; requerindo o nome do modulo do app-calculo
	
	requires app.api;
	uses br.com.cod3r.app.Calculadora; //falando q vai usar a interface especifica
}