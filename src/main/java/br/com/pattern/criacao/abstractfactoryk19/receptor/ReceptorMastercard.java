package br.com.pattern.criacao.abstractfactoryk19.receptor;

public class ReceptorMastercard implements IReceptor {

	public String receber() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("Recebendo mensagem da MASTERCARD");
		return buffer.toString();
	}
}
