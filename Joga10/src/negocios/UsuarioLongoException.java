package negocios;

public class UsuarioLongoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public UsuarioLongoException(){
		super("Nome de usu�rio muito longo!");
	}
	
}
