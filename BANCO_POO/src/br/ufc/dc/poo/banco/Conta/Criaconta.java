package br.ufc.dc.poo.banco.Conta;
public class Criaconta {

		public static void main(String args[]) {
			
			ContaEspecial c = new ContaEspecial("123");
			c.creditar(50);
			c.renderBonus();
			System.out.println("O valor do saldo =" + c.saldo());
			
		}
}