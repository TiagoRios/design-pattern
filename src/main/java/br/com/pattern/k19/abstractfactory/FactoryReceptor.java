package br.com.pattern.k19.abstractfactory;

public class FactoryReceptor {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	
	public InterfaceReceptor criar(int tipoReceptor){
		if(tipoReceptor == FactoryReceptor.VISA){
			return new ConcreteReceptorVisa();
		}else if (tipoReceptor == FactoryReceptor.MASTERCARD) {
			return new ConcreteReceptorMastercard();
		}else {
			throw new IllegalArgumentException("Tipo de Receptor nao suportado");
		}
	}
}
