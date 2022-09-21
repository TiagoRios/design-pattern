package br.com.pattern.criacao.factorymethodk19;

public class EmissorJMS implements IEmissor {
	
	@Override
	public String enviar(String mensagem) {
		StringBuilder buffer = new StringBuilder();
		buffer.append("enviando por JMS a mensagem:");
		buffer.append("\n");
		buffer.append(mensagem);
		return buffer.toString();
	}
}