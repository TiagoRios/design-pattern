package br.com.pattern.criacao.abstractfactoryk19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.pattern.criacao.abstractfactoryk19.emissor.FactoryMethodEmissor;
import br.com.pattern.criacao.factorymethodk19.IEmissor;

public class FactoryMethodEmissorTest {

	IEmissor iEmissor;

	final String MINHA_MSG = "Minha msg";
	final String STRING_MSG_VISA = "***Enviando a seguinte mensagem para o VISA***";
	final String STRING_MSG_MASTERCARD = "***Enviando a seguinte mensagem para o MASTERCARD***";

	@Test
	public void deveCriarEmissorVisa() {
		iEmissor = new FactoryMethodEmissor().criar(FactoryMethodEmissor.VISA);
		assertEquals((STRING_MSG_VISA + "\n" + MINHA_MSG), iEmissor.enviar(MINHA_MSG));
	}

	@Test
	public void deveCriarEmissorMastercard() {
		iEmissor = new FactoryMethodEmissor().criar(FactoryMethodEmissor.MASTERCARD);
		assertEquals((STRING_MSG_MASTERCARD + "\n" + MINHA_MSG), iEmissor.enviar(MINHA_MSG));
	}
}