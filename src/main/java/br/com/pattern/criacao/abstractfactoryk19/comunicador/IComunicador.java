package br.com.pattern.criacao.abstractfactoryk19.comunicador;

import br.com.pattern.criacao.abstractfactoryk19.receptor.IReceptor;
import br.com.pattern.criacao.factorymethodk19.IEmissor;

public interface IComunicador {
 IEmissor fabricaEmissor();
 IReceptor fabricaReceptor();
}
