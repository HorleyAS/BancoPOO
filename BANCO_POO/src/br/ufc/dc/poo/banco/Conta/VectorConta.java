package br.ufc.dc.poo.banco.Conta;

import java.util.Vector;

public class VectorConta implements IRepositorioConta {
	
	private Vector<ContaAbstrata> contas;
	
	
	public void inserir(ContaAbstrata conta) {
		contas.add(conta);
	}

	
	public void remover(String numero) {
		for( int i = 0; i <contas.size(); i++) {
			if(contas.equals(numero)) {
			contas.remove(i);
		}
	}
}

	
	public ContaAbstrata procurar(String numero) {
		boolean achou = false;
		for( int i = 0; i <contas.size(); i++) {
			if(contas.equals(numero)) {
			achou = true;
			return contas.get(i);
		}
	}
		return null;
}

	public int quantidade() {
		int count = 0;
		for( int i = 0; i <contas.size(); i++) {
			count = count + 1;
	}
		return count;
}

	
	public ContaAbstrata[] listar() {
		
		return null;
	}

	
	public int tamanho() {
		
		return 0;
	} 
	
}