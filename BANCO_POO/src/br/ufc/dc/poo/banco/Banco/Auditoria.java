package br.ufc.dc.poo.banco.Banco;
import br.ufc.dc.poo.banco.Conta.AccountJson;
import br.ufc.dc.poo.banco.Conta.Conta;
import br.ufc.dc.poo.banco.Conta.IRepositorioConta;
import br.ufc.dc.poo.banco.Conta.VectorConta;
public class Auditoria {
	
	public static void main(String args[]){
		Conta conta = new Conta("123");
		IRepositorioConta contas = new AccountJson();
		contas.inserir(conta);
		BancoIndependente bancoIndependente = new BancoIndependente( contas);
		AuditorBanco auditor = new AuditorBanco();
		auditor.auditar(bancoIndependente);

}
}
