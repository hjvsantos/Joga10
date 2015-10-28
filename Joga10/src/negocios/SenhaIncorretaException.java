package negocios;



public class SenhaIncorretaException extends Exception {
	
	private static final long serialVersionUID = 1L; 
	
	public SenhaIncorretaException(){
		super("A senha digitada está incorreta!");
	}
}
