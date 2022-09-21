package br.com.pattern.criacao.abstractfactoryk19.comunicador;

import br.com.pattern.criacao.abstractfactoryk19.emissor.FactoryMethodEmissor;
import br.com.pattern.criacao.abstractfactoryk19.receptor.FactoryMethodReceptor;
import br.com.pattern.criacao.abstractfactoryk19.receptor.IReceptor;
import br.com.pattern.criacao.factorymethodk19.IEmissor;

public class FactoryComunicadorVisa implements IComunicador {
	private FactoryMethodEmissor factoryEmissor = new FactoryMethodEmissor();
	private FactoryMethodReceptor factoryReceptor = new FactoryMethodReceptor();
	
	public IEmissor fabricaEmissor() {
		return factoryEmissor.criar(FactoryMethodEmissor.VISA);
	}

	public IReceptor fabricaReceptor() {
		return factoryReceptor.criar(FactoryMethodReceptor.VISA);
	}

}
