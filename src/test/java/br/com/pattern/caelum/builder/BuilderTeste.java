package br.com.pattern.caelum.builder;

import br.com.pattern.caelum.builder.Candle;
import br.com.pattern.caelum.builder.CandleBuilder;

public class BuilderTeste {

	public static void main(String[] args) {

		// normal
		CandleBuilder cb = new CandleBuilder();
		cb.setAbertura(40);
		cb.setFechamento(156);
		Candle c1 = cb.geraClandle();
		
		// padrão - FLUENT INTERFACE
		Candle c2 = new CandleBuilder()
				.setAbertura(65)
				.setFechamento(200)
				.geraClandle();

		System.out.println(c1);
		System.out.println(c2);
	}
}
