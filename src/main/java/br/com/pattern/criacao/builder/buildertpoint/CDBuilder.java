package br.com.pattern.criacao.builder.buildertpoint;

public class CDBuilder {

	CDType cds;

	public CDType buildSonyCD() {
		cds = new CDType();
		cds.addItem(new Sony());
		return cds;
	}

	public CDType buildSamsungCD() {
		cds = new CDType();
		cds.addItem(new Samsung());
		return cds;
	}
}