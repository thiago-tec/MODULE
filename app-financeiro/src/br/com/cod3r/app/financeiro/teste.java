package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

public class teste {

	public static void main(String[] args) {

		//interface
		Calculadora calc = ServiceLoader // responsavel por achar a implementação correta
				.load(Calculadora.class) //passando a interface q queremos q ele procure, mas ele não retorna uma calculadora e sim um serviceloader
				.findFirst() //pega o primeira implementação que achou para usar.
				.get();//finalizando com get
		System.out.println(calc.soma(2.1,3.2,4.3));
		
		try {
			Field fieldId = calc.getClass().getDeclaredFields()[0];
			fieldId.setAccessible(true);
			fieldId.set(calc, "def");
			fieldId.setAccessible(false);
			
			System.out.println(calc.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

}
