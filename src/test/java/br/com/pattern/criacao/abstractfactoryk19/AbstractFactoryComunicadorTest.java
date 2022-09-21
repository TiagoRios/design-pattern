package br.com.pattern.criacao.abstractfactoryk19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.pattern.criacao.abstractfactoryk19.comunicador.FactoryComunicadorMastercard;
import br.com.pattern.criacao.abstractfactoryk19.comunicador.FactoryComunicadorVisa;
import br.com.pattern.criacao.abstractfactoryk19.comunicador.IComunicador;
import br.com.pattern.criacao.abstractfactoryk19.receptor.IReceptor;
import br.com.pattern.criacao.factorymethodk19.IEmissor;

/**
 * Encapsular a escolha das classes concretas a serem utilizadas na criação
 * dos objetos de diversas famílias
 */
public class AbstractFactoryComunicadorTest {
	
	final String MINHA_MSG = "Minha msg";
	final String STRING_MSG_ENVIAR_VISA = "***Enviando a seguinte mensagem para o VISA***";
	final String STRING_MSG_ENVIAR_MASTERCARD = "***Enviando a seguinte mensagem para o MASTERCARD***";

	final String STRING_MSG_RECEBENDO_VISA = "Recebendo mensagem da VISA";
	final String STRING_MSG_RECEBENDO_MASTERCARD = "Recebendo mensagem da MASTERCARD";

	IEmissor iEmissor;
	IReceptor iReceptor;
	IComunicador iComunicadorVisa;
	IComunicador iComunicadorMastercard;

	@BeforeEach
	public void init() {
		iComunicadorVisa = new FactoryComunicadorVisa();
		iComunicadorMastercard = new FactoryComunicadorMastercard();
	}

	@Test
	public void deveCriarComunicadorVisaEmissor() {
		iEmissor = iComunicadorVisa.fabricaEmissor();
		assertEquals((STRING_MSG_ENVIAR_VISA + "\n" + MINHA_MSG), iEmissor.enviar(MINHA_MSG));
	}
	
	@Test
	public void deveCriarComunicadorVisaReceptor() {
		iReceptor = iComunicadorVisa.fabricaReceptor();
		assertEquals((STRING_MSG_RECEBENDO_VISA), iReceptor.receber());
	}

	@Test
	public void deveCriarComunicadorMastercardEmissor() {
		iEmissor = iComunicadorMastercard.fabricaEmissor();
		assertEquals((STRING_MSG_ENVIAR_MASTERCARD + "\n" + MINHA_MSG), iEmissor.enviar(MINHA_MSG));
	}
	
	@Test
	public void deveCriarComunicadorMastercardReceptor() {
		iReceptor = iComunicadorMastercard.fabricaReceptor();
		assertEquals((STRING_MSG_RECEBENDO_MASTERCARD), iReceptor.receber());
	}
}