package br.com.pattern.caelum.builder;

import java.util.Calendar;

/**
 * Classe builder responsável por criar objetos complexos pode-se criar objetos
 * com vários passos, independente da ordem.
 * 
 * @author qop
 * @data 06/09/2018
 */
public class CandleBuilder {

	// mesmas variáveis do objeto a ser construido
	private double abertura;
	private double fechamento;
	private double minimo;
	private double maximo;
	private double volume;
	private Calendar data;

	/**
	 * Método que retorna um objeto do mesmo tipo da classe atual
	 * 
	 * @param abertura
	 * @return CandleBuilder atual já definido com o parametro passado no método
	 */
	public CandleBuilder setAbertura(double abertura) {
		this.abertura = abertura;
		return this;
	}

	public CandleBuilder setFechamento(double fechamento) {
		this.fechamento = fechamento;
		return this;
	}

	public CandleBuilder setMinimo(double minimo) {
		this.minimo = minimo;
		return this;
	}

	public CandleBuilder setMaximo(double maximo) {
		this.maximo = maximo;
		return this;
	}

	public CandleBuilder setVolume(double volume) {
		this.volume = volume;
		return this;
	}

	public CandleBuilder setData(Calendar data) {
		this.data = data;
		return this;
	}

	/**
	 * Método responsável por criar o tipo de objeto que esta classe propõe criar.
	 * 
	 * @return objeto do tipo {@link Candle}
	 */
	public Candle geraClandle() {
		return new Candle(abertura, fechamento, minimo, maximo, volume, data);
	}

}
