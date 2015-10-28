package negocios;

public class SenhaLongaException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public SenhaLongaException(){
		super("Senha muito longa!");
	}
	
}
