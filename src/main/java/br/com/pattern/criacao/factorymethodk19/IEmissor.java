package br.com.pattern.criacao.factorymethodk19;

public interface IEmissor {
	//java 8
	default void envia(String mensagem){}
	String enviar(String mensagem);
}