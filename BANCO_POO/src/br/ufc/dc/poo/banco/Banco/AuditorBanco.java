package br.ufc.dc.poo.banco.Banco;

public class AuditorBanco{

	public void auditar(IBanco banco) {
		if ((banco.saldoTotal() / banco.numeroContas()) > 500){
			System.out.println("Aprovado!");
		}
		else {
			System.out.println("Não aprovado!");
		}
	}
}
