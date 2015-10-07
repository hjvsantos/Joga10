package gerarCodigo;
import java.util.Scanner;
public class GerarCodigo {
	public static void main(String[] args){
		String[] carct ={"0","1","2","3","4","5","6","7","8","9",
				"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
				"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}; 
		String[] numeros ={"0","1","2","3","4","5","6","7","8","9"};
		String senha="";
		String Comando1 = "genPassX";
		String Comando2 = "nGenPassX";
		Scanner input = new Scanner(System.in);
		String comando = "";
		System.out.println("Bem vindos ao gerador de senhas da GoldMind!");
		System.out.println("Digite um comando:\n");
		comando = input.nextLine();
		System.out.println("Digite a quantidade de algarismos desejada:\n");
		int n = input.nextInt();
		
		switch(comando){
		case "genPassX": genPassX(n,carct,senha);
						break;
		case "nGenPassX": nGenPassX(n,numeros,senha);
						break;
		}
		
	}
	public static void genPassX(int n, String[] carct, String senha){
		for (int x=0; x<n; x++){ 
			int j = (int) (Math.random()*carct.length); 
			senha += carct[j]; 
			
		}
		System.out.println("A senha gerada é:"+senha);
	}
	public static void nGenPassX(int n, String[] numeros, String senha){
		for (int x=0; x<n; x++){ 
			int j = (int) (Math.random()*numeros.length); 
			senha += numeros[j]; 
			
		}
		System.out.println("A senha gerada é:"+senha);
	}
}
