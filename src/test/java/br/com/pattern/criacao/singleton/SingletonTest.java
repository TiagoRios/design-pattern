package br.com.pattern.criacao.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Permitir a criação de uma única instância de uma classe 
 * e fornecer um modo para recuperála.
 */
public class SingletonTest {

	Singleton objetoSingleton1;
	Singleton objetoSingleton2;
	Singleton objetoSingleton3;

	@BeforeEach
	public void init() {
		// cria um objeto unico
		objetoSingleton1 = Singleton.getInstance();
		objetoSingleton2 = Singleton.getInstance();
		objetoSingleton3 = Singleton.getInstance();
	}

	@Test
	public void deveCompartilhadoValorEntreInstancias() {
		assertEquals(objetoSingleton1.getPropriedadeUnica(), objetoSingleton2.getPropriedadeUnica());
		assertEquals(objetoSingleton1.getPropriedadeUnica(), objetoSingleton3.getPropriedadeUnica());
		assertEquals(objetoSingleton2.getPropriedadeUnica(), objetoSingleton3.getPropriedadeUnica());
	}

	@Test
	public void deveCompartilhadoValorAlteradoEntreInstancias() {
		objetoSingleton1.setPropriedadeUnica("novo valor");
		assertEquals(objetoSingleton1.getPropriedadeUnica(), objetoSingleton2.getPropriedadeUnica());
		assertEquals(objetoSingleton1.getPropriedadeUnica(), objetoSingleton3.getPropriedadeUnica());
		assertEquals(objetoSingleton2.getPropriedadeUnica(), objetoSingleton3.getPropriedadeUnica());
	}
}