package br.com.pattern.k19.abstractfactory;

public class ConcreteReceptorMastercard implements InterfaceReceptor {

	public String recebe() {
		System.out.println("***Recebendo mensagem da Mastercard***");
		return "mensagem de MASTERCARD";
	}
}
