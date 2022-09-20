package br.com.pattern.k19.prototype;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import br.com.pattern.k19.prototype.Campanha;

public class PrototypeTeste {

	public static void main(String[] args) {
		String nome = "campanha original";
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);//+30 dias
		
		//atribuições do curso básico java.
		Set<String> meuConjunto = new HashSet<>();
		meuConjunto.add("java EE");
		
		//Atribuições do curso framework Spring.
		Set<String> meuConjunto2 = new HashSet<>();
		meuConjunto2.add("Springframework");
		
		//cria campanha original
		Campanha campanha = new Campanha(nome, vencimento, meuConjunto);
		System.out.println("primeira"+ campanha);
		
		Campanha clone = campanha.clonar();
		//add outro objeto ao conjunto que já esta na próxima chamada
		meuConjunto.add("porra");

		//add novo conjunto ao clone
		clone.setPalavraChave(meuConjunto2);
		clone.setNome("primeiro clone");
		System.out.println("segunda" + clone);
		
		/*campanha com conjuntos original e clonado*/
		Set<String> clonado = campanha.getPalavraChave();
		clonado.addAll(meuConjunto2);
		
		//copia da copia
		Campanha outroClone = clone.clonar();
		outroClone.setPalavraChave(clonado);
		outroClone.setNome("clone do clone");
		System.out.println("terceira" + outroClone);
		
	}
}
