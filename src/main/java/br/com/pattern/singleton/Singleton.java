package br.com.pattern.singleton;

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

	//s� pra teste
	private String soTeste = "inicial = frase so para teste";

	// construtor deve ser privado para somente ser criado pela propria classe
	private Singleton() {
	}

	/**
	 * met�do utilizado para recuperar uma instancia do objeto
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
	 * met�do utilizado para modificar o valor da String soTeste
	 * 
	 * @param a
	 */
	public void setSoTeste(String a) {
		this.soTeste = a;
	}

	/**
	 * Met�do utilizado para pegar valor inicial da String soTeste
	 * 
	 * @return a String definida na classe
	 */
	public String getSoTeste() {
		return soTeste;
	}
}
