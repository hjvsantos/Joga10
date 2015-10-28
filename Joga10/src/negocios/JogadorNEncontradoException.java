package negocios;

public class JogadorNEncontradoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public JogadorNEncontradoException(){
		super("O jogador buscado não foi encontrado!");
	}
	
}
