package br.com.pattern.k19.abstractfactory;

public class ConcreteReceptorVisa implements InterfaceReceptor {

	public String recebe() {
		System.out.println("***Recebendo mensagem da VISA***");
		return "Mensagem da Visa";
	}

}
