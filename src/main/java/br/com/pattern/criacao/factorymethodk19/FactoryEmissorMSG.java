package br.com.pattern.criacao.factorymethodk19;

/**
 * Classe respons�vel por criar emissores.
 * 
 * @author Tiago Rios
 * @since 05/10/2018
 *
 */
public class FactoryEmissorMSG {
	//posso colocar em um enum
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;

	private static FactoryEmissorMSG emissorMsgFactory;

	/**
	 * singleton pattern
	 */
	private FactoryEmissorMSG(){
	}
	
	public static synchronized FactoryEmissorMSG getEmissorFactory(){
		if (emissorMsgFactory == null) {
			emissorMsgFactory = new FactoryEmissorMSG();
		}
		return emissorMsgFactory;
	}
	
	public IEmissor create(int tipoEmissor){
		if (tipoEmissor == FactoryEmissorMSG.SMS) {
			return new EmissoraSMS();
		}else if (tipoEmissor == FactoryEmissorMSG.EMAIL) {
			return new EmissorEmail();
		}else if (tipoEmissor == FactoryEmissorMSG.JMS) {
			return new EmissorJMS();
		}else {
		throw new IllegalArgumentException("tipo de emissor nao suportado !!!");
		}	
	}
}
