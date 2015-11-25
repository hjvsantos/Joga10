package negocios;

public class TimeNaoEncontradoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public TimeNaoEncontradoException(){
		super("Time não encontrado");
	}
}
