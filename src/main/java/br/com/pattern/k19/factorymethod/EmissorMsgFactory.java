package br.com.pattern.k19.factorymethod;

/**
 * Classe responsável por criar emissores.
 * 
 * @author Tiago Rios
 * @since 05/10/2018
 *
 */
public class EmissorMsgFactory {
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;

	private static EmissorMsgFactory ef;

	/**
	 * singleton pattern
	 */
	private EmissorMsgFactory(){
	}
	
	public static synchronized EmissorMsgFactory getEmissorFactory(){
		if (ef == null) {
			ef = new EmissorMsgFactory();
		}
		return ef;
	}
	
	public InterfaceEmissor create(int tipoEmissor){
		if (tipoEmissor == EmissorMsgFactory.SMS) {
			return new EmissorSMS();
		}else if (tipoEmissor == EmissorMsgFactory.EMAIL) {
			return new EmissorEmail();
		}else if (tipoEmissor == EmissorMsgFactory.JMS) {
			return new EmissorJMS();
		}else {
		throw new IllegalArgumentException("tipo de emissor nao suportado !!!");
		}	
	}
}
