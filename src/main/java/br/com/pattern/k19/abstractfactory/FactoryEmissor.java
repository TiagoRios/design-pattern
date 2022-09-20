package br.com.pattern.k19.abstractfactory;

import br.com.pattern.k19.factorymethod.InterfaceEmissor;

public class FactoryEmissor {	
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	
	public InterfaceEmissor criar(int tipoEmissor){
		if (tipoEmissor == FactoryEmissor.VISA) {
			return new ConcreteEmissorVisa();
		} else if (tipoEmissor == FactoryEmissor.MASTERCARD) {
			return new ConcreteEmissorMastercard();
		} else {
			throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
	}
}
