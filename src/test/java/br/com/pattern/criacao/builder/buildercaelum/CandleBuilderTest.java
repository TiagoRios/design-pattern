package br.com.pattern.criacao.builder.buildercaelum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

/**
 * Separar o processo de construção de um objeto de sua representação e
 * permitir a sua criação passo-a-passo.
 * 
 * Diferentes tipos de objetos podem ser criados com implementações
 * distintas de cada passo.
 */
public class CandleBuilderTest {

	Candle candle;
	int minimo = 30;
	int maximo = 900;
	int volume = 10000;
	int abertura = 100;
	int fechamento = 400;
	Calendar data = Calendar.getInstance();

	@Test
	public void deveCriarComPadraoBuilder() {
		candle = new CandleBuilder()
				.setData(data)
				.setMinimo(minimo)
				.setMaximo(maximo)
				.setVolume(volume)
				.setAbertura(abertura)
				.setFechamento(fechamento)
				.build();
		assertEquals(data, candle.getData());
		assertEquals(minimo, candle.getMinimo());
		assertEquals(maximo, candle.getMaximo());
		assertEquals(volume, candle.getVolume());
		assertEquals(abertura, candle.getAbertura());
		assertEquals(fechamento, candle.getFechamento());
	}
}