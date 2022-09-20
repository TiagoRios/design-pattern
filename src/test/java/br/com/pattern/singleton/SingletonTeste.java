package br.com.pattern.singleton;

import br.com.pattern.singleton.Singleton;

public class SingletonTeste {

	public static void main(String[] args) {
		
		//cria um objeto unico
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		Singleton c = Singleton.getInstance();
		
		//pega e imprime o valor inicial = gravo em uma string
		//para poder recuperá-la depois
		System.out.println(a.getSoTeste());
		a.setSoTeste("= modificou 1 vez");
		System.out.println("b " + b.getSoTeste());
		b.setSoTeste("= modificou 2 vez");
		System.out.println("c " + c.getSoTeste());
		c.setSoTeste("= modificou 3 vez");
		
		System.out.println("valor final \n" + a.getSoTeste());
		System.out.println(b.getSoTeste());
		System.out.println(c.getSoTeste());
	}
}
