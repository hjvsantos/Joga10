package negocios;

public class CPFIncorretoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public CPFIncorretoException(){
		super("O CPF digitado está incorreto!");
	}
	
}
