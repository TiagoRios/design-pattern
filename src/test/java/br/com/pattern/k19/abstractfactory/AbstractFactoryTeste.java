package br.com.pattern.k19.abstractfactory;

import br.com.pattern.k19.abstractfactory.ComunicadorFactoryMastercard;
import br.com.pattern.k19.abstractfactory.ComunicadorFactoryVisa;
import br.com.pattern.k19.abstractfactory.InterfaceComunicador;

public class AbstractFactoryTeste {

	public static void main(String[] args) {
		InterfaceComunicador interfaceComunicadorV = new ComunicadorFactoryVisa();
		interfaceComunicadorV. fabricaEmissor().envia("MSG VISA");
		
		System.out.println("\n");
		
		InterfaceComunicador interfaceComunicadorM = new ComunicadorFactoryMastercard();
		interfaceComunicadorM.fabricaEmissor().envia("MSG MASTERCARD");
	
		System.out.println("\n");
		
		System.out.println(interfaceComunicadorV.fabricaReceptor().recebe());
		System.out.println(interfaceComunicadorM.fabricaReceptor().recebe());
	}
}
