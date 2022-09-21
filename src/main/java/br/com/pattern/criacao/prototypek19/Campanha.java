package br.com.pattern.criacao.prototypek19;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Campanha implements Prototipo<Campanha> {

	private String nomeCampanha;
	private Calendar vencimentoCampanha;
	private Set<String> palavrasChavesCampanha;

	public Campanha(String nomeCampanha, Calendar vencimentoCampanha, Set<String> palavraChaveCampanha) {
		super();
		this.nomeCampanha = nomeCampanha;
		this.vencimentoCampanha = vencimentoCampanha;
		this.palavrasChavesCampanha = palavraChaveCampanha;
	}

	public String getNomeCampanha() {
		return nomeCampanha;
	}

	public void setNomeCampanha(String nomeCampanha) {
		this.nomeCampanha = nomeCampanha;
	}

	public Calendar getVencimentoCampanha() {
		return vencimentoCampanha;
	}

	public void setVencimentoCampanha(Calendar vencimentoCampanha) {
		this.vencimentoCampanha = vencimentoCampanha;
	}

	public Set<String> getPalavraChavesCampanha() {
		return palavrasChavesCampanha;
	}

	public void setPalavraChavesCampanha(Set<String> palavraChavesCampanha) {
		this.palavrasChavesCampanha = palavraChavesCampanha;
	}

	@Override
	public Campanha clonarObjeto() {
		String nomeDaCopia = this.nomeCampanha;
		Calendar vencimentoDaCopia = (Calendar) this.vencimentoCampanha;
		Set<String> palavraChaveDaCopia = new HashSet<String>(this.palavrasChavesCampanha);
		return new Campanha(nomeDaCopia, vencimentoDaCopia, palavraChaveDaCopia);
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append(" ---------------");
		buffer.append("\n");
		buffer.append(" Nome da Campanha : ");
		buffer.append(this.nomeCampanha);
		buffer.append("\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy ");
		String format = simpleDateFormat.format(this.vencimentoCampanha.getTime());
		buffer.append(" Vencimento : " + format);
		buffer.append("\n");

		buffer.append(" Palavras - chave : \n");
		for (String palavraChave : this.palavrasChavesCampanha) {
			buffer.append(" - " + palavraChave);
			buffer.append("\n");
		}
		buffer.append(" ---------------");
		buffer.append("\n");

		return buffer.toString();
	}
}
