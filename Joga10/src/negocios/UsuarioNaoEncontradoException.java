package negocios;

public class UsuarioNaoEncontradoException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public UsuarioNaoEncontradoException(){
		super("Usuario n�o encontrado");
	}
}
