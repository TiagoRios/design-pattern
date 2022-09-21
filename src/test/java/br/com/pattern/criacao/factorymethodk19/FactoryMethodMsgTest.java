package br.com.pattern.criacao.factorymethodk19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Encapsular a escolha da classe concreta a ser utilizada na 
 * criação de objetos de um determinado tipo.
 */
public class FactoryMethodMsgTest {

	IEmissor iEmissor;

	final String MINHA_MSG = "Minha msg";
	final String STRING_SMS = "enviando por SMS a mensagem:";
	final String STRING_JMS = "enviando por JMS a mensagem:";
	final String STRING_EMAIL = "enviando por EMAIL a mensagem:";

	@Test
	public void deveSelecionarTipoEmissorSMS() {
		iEmissor = FactoryEmissorMSG.getEmissorFactory().create(FactoryEmissorMSG.SMS);
		assertEquals((STRING_SMS + "\n" +  MINHA_MSG), iEmissor.enviar(MINHA_MSG));
	}

	@Test
	public void deveSelecionarTipoEmissorJMS() {
		iEmissor = FactoryEmissorMSG.getEmissorFactory().create(FactoryEmissorMSG.JMS);
		assertEquals((STRING_JMS + "\n" +  MINHA_MSG), iEmissor.enviar(MINHA_MSG));
	}

	@Test
	public void deveSelecionarTipoEmissorEMAIL() {
		iEmissor = FactoryEmissorMSG.getEmissorFactory().create(FactoryEmissorMSG.EMAIL);
		assertEquals((STRING_EMAIL + "\n" +  MINHA_MSG), iEmissor.enviar(MINHA_MSG));
	}
}