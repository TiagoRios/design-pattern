package br.com.pattern.caelum.builder;

import java.util.Calendar;

/**
 * Classe builder respons�vel por criar objetos complexos pode-se criar objetos
 * com v�rios passos, independente da ordem.
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

	/**
	 * M�todo que retorna um objeto do mesmo tipo da classe atual
	 * 
	 * @param abertura
	 * @return CandleBuilder atual j� definido com o parametro passado no m�todo
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
	 * M�todo respons�vel por criar o tipo de objeto que esta classe prop�e criar.
	 * 
	 * @return objeto do tipo {@link Candle}
	 */
	public Candle geraClandle() {
		return new Candle(abertura, fechamento, minimo, maximo, volume, data);
	}

}
