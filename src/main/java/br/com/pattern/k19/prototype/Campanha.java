package br.com.pattern.k19.prototype;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;

public class Campanha implements Prototype<Campanha> {

	private String nome;
	private Calendar vencimento;
	private Set<String> palavraChaves;
	
	public Campanha(String nome, Calendar vencimento, Set<String> palavraChave) {
		super();
		this.nome = nome;
		this.vencimento = vencimento;
		this.palavraChaves = palavraChave;
	}
	
	@Override
	public Campanha clonar() {
		String nomex = "copia de = " + this.nome;
		//Calendar vencimento = (Calendar) this.vencimento;
		//Set<String> palavraChave = new HashSet<String>(this.palavraChave);
		return new Campanha(nomex, this.vencimento, this.palavraChaves);
	}

//	Getters Setters e toString
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getVencimento() {
		return vencimento;
	}

	public void setVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

	public Set<String> getPalavraChave() {
		return palavraChaves;
	}

	public void setPalavraChave(Set<String> palavraChave) {
		this.palavraChaves = palavraChave;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder (); 
		buffer . append (" ---------------");
		 buffer . append ("\n");
		 buffer . append (" Nome da Campanha : ");
		 buffer . append ( this . nome );
		 buffer . append ("\n");
		
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("dd/MM/yyyy ");
		 String format = simpleDateFormat . format ( this . vencimento . getTime ());
		 buffer . append (" Vencimento : " + format );
		 buffer . append ("\n");
		
		 buffer . append (" Palavras - chave : \n");
		 for ( String palavraChave : this.palavraChaves ) {
		 buffer . append (" - " + palavraChave );
		 buffer . append ("\n");
		 }
		 buffer . append (" ---------------");
		 buffer . append ("\n");
		
		 return buffer . toString ();	}	
}
	