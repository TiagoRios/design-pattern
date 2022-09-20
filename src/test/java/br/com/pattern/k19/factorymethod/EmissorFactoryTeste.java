package br.com.pattern.k19.factorymethod;

import br.com.pattern.k19.factorymethod.EmissorMsgFactory;
import br.com.pattern.k19.factorymethod.InterfaceEmissor;

/**
 * Classe intermediaria que encapsula a classe concreta a ser utilizada na
 * construção de um objeto de um determinado tipo.
 * 
 * Aqui esta usando o padrao factory method.
 * 
 * @author Tiago
 * 
 */
public class EmissorFactoryTeste {

	public static void main(String[] args) {

		/*  
		//chamando uma por uma 
		  Emissor emissor1 = new EmissorEmail();
		  emissor1.envia("treinameto");
		  
		  Emissor emissor2 = new EmissorSMS(); 
		  emissor2.envia("treinamento 2");
		  
		  Emissor emissor3 = new EmissorJMS(); 
		  emissor3.envia("treinameto 3");
		 */
		
		//testando o padrão singleton
		EmissorMsgFactory emissorFactory = EmissorMsgFactory.getEmissorFactory();
		
		InterfaceEmissor a = emissorFactory.create(EmissorMsgFactory.JMS);
		a.envia("mensagem 1");
		
		InterfaceEmissor b = emissorFactory.create(EmissorMsgFactory.EMAIL);
		b.envia("mensagem 2");
		
		InterfaceEmissor c = emissorFactory.create(EmissorMsgFactory.SMS);
		c.envia("mensagem 3");
	}
}
