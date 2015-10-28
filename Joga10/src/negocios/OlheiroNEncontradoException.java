package negocios;

public class OlheiroNEncontradoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public OlheiroNEncontradoException(){
		super("O olheiro buscado não foi encontrado!");
	}
	
}
