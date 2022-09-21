package br.com.pattern.criacao.abstractfactoryk19.emissor;

import br.com.pattern.criacao.factorymethodk19.IEmissor;

/**
 * Padrao factory method
 */
public class FactoryMethodEmissor {	
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	
	public IEmissor criar(int tipoEmissor){
		if (tipoEmissor == FactoryMethodEmissor.VISA) {
			return new EmissorVisa();
		} else if (tipoEmissor == FactoryMethodEmissor.MASTERCARD) {
			return new EmissorMastercard();
		} else {
			throw new IllegalArgumentException("Tipo de emissor n�o suportado");
		}
	}
}