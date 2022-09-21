package br.com.pattern.criacao.abstractfactoryk19.receptor;

public interface IReceptor {
	String receber();
	
	default String recebe(){
		return "Mensagem default Interface";
	}
}