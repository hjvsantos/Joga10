package negocios;

public class UsuarioCurtoException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public UsuarioCurtoException(){
		super("Nome de usu�rio muito curto!");
	}
	
}
