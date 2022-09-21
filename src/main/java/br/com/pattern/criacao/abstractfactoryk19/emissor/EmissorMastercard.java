package br.com.pattern.criacao.abstractfactoryk19.emissor;

import br.com.pattern.criacao.factorymethodk19.IEmissor;

public class EmissorMastercard implements IEmissor {

	@Override
	public String enviar(String mensagem) {
		StringBuilder buffer = new StringBuilder();
		buffer.append("***Enviando a seguinte mensagem para o MASTERCARD***");
		buffer.append("\n");
		buffer.append(mensagem);
		return buffer.toString();
	}
}