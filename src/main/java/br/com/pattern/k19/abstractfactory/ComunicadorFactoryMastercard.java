package br.com.pattern.k19.abstractfactory;

import br.com.pattern.k19.factorymethod.InterfaceEmissor;

public class ComunicadorFactoryMastercard implements InterfaceComunicador{
	private FactoryEmissor factoryEmissor = new FactoryEmissor();
	private FactoryReceptor factoryReceptor = new FactoryReceptor();
	
	public InterfaceEmissor fabricaEmissor() {
		return factoryEmissor.criar(FactoryEmissor.MASTERCARD);
	}

	public InterfaceReceptor fabricaReceptor() {
		return factoryReceptor.criar(FactoryReceptor.MASTERCARD);
	}

}
