package br.ufc.dc.poo.banco.Conta;

public class ContaImposto extends ContaAbstrata{
	private double imposto;
	
	public ContaImposto(String numero) {
		super(numero);
	}
	
	public void definirImposto() {
		this.imposto = 0;
	}

	public void debitar(double valor) {
		saldo = saldo - (valor * imposto);
	}
}
