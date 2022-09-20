package br.com.pattern.k19.abstractfactory;

import br.com.pattern.k19.factorymethod.InterfaceEmissor;

public interface InterfaceComunicador {
 InterfaceEmissor fabricaEmissor();
 InterfaceReceptor fabricaReceptor();
}
