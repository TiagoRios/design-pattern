package br.com.pattern.criacao.builder.buildercaelum;

import java.util.Calendar;

/**
 * Classe builder responsavel por criar objetos complexos pode-se criar objetos
 * com varios passos, independente da ordem.
 * 
 * @author qop
 * @data 06/09/2018
 */
public class CandleBuilder {

	// mesmas vari�veis do objeto a ser construido
	private double abertura;
	private double fechamento;
	private double minimo;
	private double maximo;
	private double volume;
	private Calendar data;

	CandleBuilder(){}

	/**
	 * Define o valor de abertura das operacoes.
	 * 
	 * @param abertura
	 */
	public CandleBuilder setAbertura(double abertura) {
		this.abertura = abertura;
		return this;
	}

	/**
	 * Define valor de fechamento das operacoes.
	 * 
	 * @param fechamento
	 */
	public CandleBuilder setFechamento(double fechamento) {
		this.fechamento = fechamento;
		return this;
	}

	/**
	 * Define valor minimo negociado.
	 * 
	 * @param minimo
	 */
	public CandleBuilder setMinimo(double minimo) {
		this.minimo = minimo;
		return this;
	}

	/**
	 * Define valor maximo negociado.
	 * 
	 * @param maximo
	 */
	public CandleBuilder setMaximo(double maximo) {
		this.maximo = maximo;
		return this;
	}

	/**
	 * Define Volume de operacoes.
	 * 
	 * @param volume
	 */
	public CandleBuilder setVolume(double volume) {
		this.volume = volume;
		return this;
	}

	/**
	 * Define Data das operacoes.
	 * 
	 * @param data
	 */
	public CandleBuilder setData(Calendar data) {
		this.data = data;
		return this;
	}

	/**
	 * Instancia o objetos do tipo Candle.
	 * 
	 * Esse metodo E ultimo.
	 * 
	 * @return objeto do tipo {@link Candle}
	 */
	public Candle build() {
		return new Candle(abertura, fechamento, minimo, maximo, volume, data);
	}
}