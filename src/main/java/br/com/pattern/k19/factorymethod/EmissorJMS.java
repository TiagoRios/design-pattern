package br.com.pattern.k19.factorymethod;

public class EmissorJMS implements InterfaceEmissor {

	public void envia(String mensagem) {
		System.out.println("enviando por JMS a mensagem");
		System.out.println(mensagem);
	}

}
