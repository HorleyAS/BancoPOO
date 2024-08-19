package br.ufc.dc.poo.banco.Conta;

public class CriaContaPoupanca {

	public static void main(String args[]) {
		
		ContaPoupanca c = new ContaPoupanca("123");
		c.creditar(100);
		c.renderJuros(0.1);
		System.out.println("O valor do saldo =" + c.saldo());
		
	}
}
