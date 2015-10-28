package negocios;

public class SenhaCurtaException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public SenhaCurtaException(){
		super("Senha muito curta!");
	}
	
}
