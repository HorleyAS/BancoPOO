package br.ufc.dc.poo.banco.Conta;

public abstract class ContaAbstrata {
	String numero;
    protected double saldo;

    public ContaAbstrata(String numero){
        this.numero = numero;
        this.saldo = 0;
    }
    
    public void creditar(double valor){
        saldo = saldo + valor;
    }

    public void debitar(double valor){
        saldo = saldo - valor;
    }

    public String numero(){
        return numero;
    }

    public double saldo(){
        return saldo;
    }
}
