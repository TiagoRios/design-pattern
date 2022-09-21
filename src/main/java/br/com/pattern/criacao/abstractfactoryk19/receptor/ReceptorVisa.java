package br.com.pattern.criacao.abstractfactoryk19.receptor;

public class ReceptorVisa implements IReceptor {

	public String receber() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("Recebendo mensagem da VISA");
		return buffer.toString();
	}
}