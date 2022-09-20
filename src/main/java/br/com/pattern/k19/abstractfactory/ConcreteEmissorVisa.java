package br.com.pattern.k19.abstractfactory;

import br.com.pattern.k19.factorymethod.InterfaceEmissor;

public class ConcreteEmissorVisa implements InterfaceEmissor {

	public void envia(String mensagem) {
		System.out.println("***Enviando a seguinte mensagem para a VISA***");
		System.out.println(mensagem);
	}

}
