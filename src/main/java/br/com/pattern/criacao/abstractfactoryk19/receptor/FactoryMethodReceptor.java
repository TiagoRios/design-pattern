package br.com.pattern.criacao.abstractfactoryk19.receptor;

public class FactoryMethodReceptor {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	
	public IReceptor criar(int tipoReceptor){
		if(tipoReceptor == FactoryMethodReceptor.VISA){
			return new ReceptorVisa();
		}else if (tipoReceptor == FactoryMethodReceptor.MASTERCARD) {
			return new ReceptorMastercard();
		}else {
			throw new IllegalArgumentException("Tipo de Receptor nao suportado");
		}
	}
}
