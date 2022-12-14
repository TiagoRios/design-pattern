package br.com.pattern.criacao.builder.buildercaelum;

import java.util.Calendar;

public final class Candle {
	  private final double abertura;
	  private final double fechamento;
	  private final double minimo;
	  private final double maximo;
	  private final double volume;
	  private final Calendar data;
	  
	  public Candle(double abertura, double fechamento, double minimo, double maximo, double volume, Calendar data) {
		super();
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}
	public double getAbertura() {
		return abertura;
	}
	public double getFechamento() {
		return fechamento;
	}
	public double getMinimo() {
		return minimo;
	}
	public double getMaximo() {
		return maximo;
	}
	public double getVolume() {
		return volume;
	}
	public Calendar getData() {
		return data;
	}
	@Override
	public String toString() {
		return "Candle [abertura=" + abertura + ", fechamento=" + fechamento + ", minimo=" + minimo + ", maximo="
				+ maximo + ", volume=" + volume + ", data=" + data + "]";
	}
}
