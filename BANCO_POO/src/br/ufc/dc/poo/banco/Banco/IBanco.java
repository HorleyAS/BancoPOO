package br.ufc.dc.poo.banco.Banco;

import Exceptions.CIException;
import br.ufc.dc.poo.banco.Conta.ContaAbstrata;

public interface IBanco {
	
public double saldoTotal();
public int numeroContas();
public void cadastrar(ContaAbstrata conta);
public ContaAbstrata procurar(String numero);
public void creditar(String numero, double valor) throws CIException;
public void debitar(String numero, double valor) throws CIException;
public double saldo(String numero)throws CIException;
public void transferir(String origem, String destino, double valor);

}
