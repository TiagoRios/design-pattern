package br.com.pattern.criacao.factorymethodk19;

public class EmissoraSMS implements IEmissor {

	@Override
	public String enviar(String mensagem) {
		StringBuilder buffer = new StringBuilder();
		buffer.append("enviando por SMS a mensagem:");
		buffer.append("\n");
		buffer.append(mensagem);
		return buffer.toString();
	}
}