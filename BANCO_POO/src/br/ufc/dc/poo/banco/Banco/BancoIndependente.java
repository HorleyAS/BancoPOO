package br.ufc.dc.poo.banco.Banco;
import java.util.Vector;

import Exceptions.CIException;
import br.ufc.dc.poo.banco.Conta.Conta;
import br.ufc.dc.poo.banco.Conta.ContaAbstrata;
import br.ufc.dc.poo.banco.Conta.ContaPoupanca;
import br.ufc.dc.poo.banco.Conta.IRepositorioConta;


public class BancoIndependente implements IBanco {

	public IRepositorioConta contas;
	
	public BancoIndependente(IRepositorioConta contas){
		this.contas = contas;
	}

	public void debitar(String numero, double valor) throws CIException {
		ContaAbstrata conta = contas.procurar(numero);
		if (conta != null) {
			conta.debitar(valor);
		}
		else{ 
			throw new CIException(numero); 
		}
}

	public double saldoTotal(String numero) throws CIException {
		ContaAbstrata conta = contas.procurar(numero);
		if (conta != null) {
			return conta.saldo();
		}
		else{ 
			throw new CIException(numero); 
		}
		
	}

	@Override
	public int numeroContas() {
		
		return 0;
	}

	@Override
	public void cadastrar(ContaAbstrata conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ContaAbstrata procurar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creditar(String numero, double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double saldo(String numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void transferir(String origem, String destino, double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double saldoTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
