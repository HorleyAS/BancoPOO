package Exceptions;

public class CIException extends Exception {
	private String numero;
	
	public CIException (String numero) {
		super ("Conta Inexistente!");
		this.numero = numero;
	}
	
	public String numeroConta(){
	return numero;
}
}
