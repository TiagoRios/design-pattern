package br.com.pattern.k19.factorymethod;

public class EmissorEmail implements InterfaceEmissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("enviando por Email a mensagem");
		System.out.println(mensagem);
	}

}
