package classesPrincipais;
import classesPrincipais.Time;

public class ComparatorTime <Time>{
	 public int compare(Time time, Time timeOutro) {
	        int numero = ((classesPrincipais.Time) time).getNome().compareTo(((classesPrincipais.Time) timeOutro).getNome());
	        return numero;
	 
	 }
}
