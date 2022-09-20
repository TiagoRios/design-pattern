package br.com.pattern.k19.abstractfactory;

import br.com.pattern.k19.factorymethod.InterfaceEmissor;

public class ComunicadorFactoryVisa implements InterfaceComunicador {
	private FactoryEmissor factoryEmissor = new FactoryEmissor();
	private FactoryReceptor factoryReceptor = new FactoryReceptor();
	
	public InterfaceEmissor fabricaEmissor() {
		return factoryEmissor.criar(FactoryEmissor.VISA);
	}

	public InterfaceReceptor fabricaReceptor() {
		return factoryReceptor.criar(FactoryReceptor.VISA);
	}

}
