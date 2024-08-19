package br.ufc.dc.poo.banco.Conta;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String numero){
		super(numero);
	}
	
	void renderJuros(double taxa) {
		creditar(saldo() * taxa);
	}
	
}
