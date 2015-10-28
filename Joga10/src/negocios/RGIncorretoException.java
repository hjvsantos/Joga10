package negocios;

public class RGIncorretoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public RGIncorretoException(){
		super("O RG digitado está incorreto!");
	}
	
}
