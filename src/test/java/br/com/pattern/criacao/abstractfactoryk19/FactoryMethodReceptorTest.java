package br.com.pattern.criacao.abstractfactoryk19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.pattern.criacao.abstractfactoryk19.receptor.FactoryMethodReceptor;
import br.com.pattern.criacao.abstractfactoryk19.receptor.IReceptor;

public class FactoryMethodReceptorTest {

	IReceptor iReceptor;

	final String STRING_MSG_VISA = "Recebendo mensagem da VISA";
	final String STRING_MSG_MASTERCARD = "Recebendo mensagem da MASTERCARD";

	@Test
	public void deveCriarReceptorVisa() {
		iReceptor = new FactoryMethodReceptor().criar(FactoryMethodReceptor.VISA);
		assertEquals((STRING_MSG_VISA), iReceptor.receber());
	}

	@Test
	public void deveCriarReceptorMastercard() {
		iReceptor = new FactoryMethodReceptor().criar(FactoryMethodReceptor.MASTERCARD);
		assertEquals((STRING_MSG_MASTERCARD), iReceptor.receber());
	}
}