package br.com.pattern.criacao.builder.buildertpoint;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CDBuilderTest {

	CDType cdType;
	CDBuilder cdBuilder;

	final String PRODUTO_SONY = "CD name : Sony CD, Price : 20\n";
	final String PRODUTO_SANSUNG = "CD name : Samsung CD, Price : 15\n";

	@BeforeEach
	public void init() {
		cdBuilder = new CDBuilder();
	}

	@Test
	public void deveConstruirCDSony() {
		cdType = cdBuilder.buildSonyCD();
		assertEquals(PRODUTO_SONY, cdType.showItems());
	}

	@Test
	public void deveConstruirCDSansung() {
		cdType = cdBuilder.buildSamsungCD();
		assertEquals(PRODUTO_SANSUNG, cdType.showItems());
	}
}
