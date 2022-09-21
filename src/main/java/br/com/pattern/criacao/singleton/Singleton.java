package br.com.pattern.criacao.singleton;

/**
 * classe que define o padr�o singleton... garante que tenha apenas uma unica
 * instancia do objeto
 * 
 * @author Tiago Rios
 * @since 06/07/2016
 *
 */
public class Singleton {

	private static Singleton UNICO;

	private String propriedadeUnica = "propriedade unica inicial";

	// construtor deve ser privado para somente ser criado pela propria classe
	private Singleton() {
	}

	/**
	 * metedo utilizado para recuperar uma instancia do objeto
	 * 
	 * @return uma instancia do objeto unico
	 */
	public static synchronized Singleton getInstance() {
		if (UNICO == null) {
			UNICO = new Singleton();
		}
		return UNICO;
	}

	/**
	 * metedo utilizado para modificar o valor da String
	 * 
	 * @param novoValor
	 */
	public void setPropriedadeUnica(String novoValor) {
		this.propriedadeUnica = novoValor;
	}

	/**
	 * Met�do utilizado para pegar valor inicial da String soTeste
	 * 
	 * @return a String definida na classe
	 */
	public String getPropriedadeUnica() {
		return propriedadeUnica;
	}
}
