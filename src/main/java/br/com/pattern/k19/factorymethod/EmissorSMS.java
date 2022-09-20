package br.com.pattern.k19.factorymethod;

public class EmissorSMS implements InterfaceEmissor {

	public void envia(String mensagem) {
		System.out.println("enviando por SMS a mensagem");
		System.out.println(mensagem);
	}

}
