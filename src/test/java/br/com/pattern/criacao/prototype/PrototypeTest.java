package br.com.pattern.criacao.prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.pattern.criacao.prototypek19.Campanha;

/**
 * Possibilitar a criação de novos objetos a partir 
 * da cópia de objetos existentes.
 */
public class PrototypeTest {

	Campanha campanha;
	Campanha campanhaCopiada;
	Set<String> meuSet; 

	@BeforeEach
	public void init() {
		meuSet = new HashSet<>(5);
		meuSet.add("vendas varejo");
		meuSet.add("vendas atacado");
		campanha = new Campanha("nomeCampanha", Calendar.getInstance(), meuSet);
	}

	@Test
	public void deveClonarObjetoUsandoPadraoPrototype() {
		campanhaCopiada = campanha.clonarObjeto();
		assertEquals(campanha.getNomeCampanha(), campanhaCopiada.getNomeCampanha());
		assertEquals(campanha.getVencimentoCampanha(), campanhaCopiada.getVencimentoCampanha());
		assertEquals(campanha.getPalavraChavesCampanha(), campanhaCopiada.getPalavraChavesCampanha());
	}
}