package repositorios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.Serializable;

import classesPrincipais.Time;
import negocios.ControladorTime;

/**
 * @author joaolucassantos
 *
 */
public class RepositorioTime {
	private static final long serialVersionUID = 1L;
	List<Time> time = new ArrayList<Time>();
	public static ControladorTime cadastroTime = new ControladorTime();
	private static RepositorioTime instancia;
	
	public static RepositorioTime getInstancia() {
		if (instancia == null) {
			instancia = lerDoArquivo();
		}
		return instancia;
	}
	
	private static RepositorioTime lerDoArquivo() {
		RepositorioTime instanciaLocal = null;

		File in = new File("repositorioVendedor.dat");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			instanciaLocal = (RepositorioTime) o;
		} catch (Exception e) {
			instanciaLocal = new RepositorioTime();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {/* Silent exception */
				}
			}
		}

		return instanciaLocal;
	}
	
	public static void salvarArquivo() {
		if (instancia == null) {
			return;
		}
		File out = new File("repositorioVendedor.dat");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(out);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(instancia);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {/* Silent exception*/
				}
			}
		}
	}
	

	public List<Time> getTime() {
		if(this.time!=null)
			Collections.sort(time);
		return time;
	}
	
	public void cadastrarTime(Time Time){
		this.time.add((classesPrincipais.Time) time);
	}
	
	public void atualizarTime(Time time, int posicao){
		time.set(posicao, time);
	}
	
	public void removerTime(Time time) {
		time.remove(time);
	}
	
	public Time retornarTime(String usuario){
		Time time = null;
		for (int i = 0; i < time.size(); i++){
			if (time.get(i).getUsuario().equals(usuario)) {		
				time = time.getUsuario(i);
				break;
			}
		}
		return time;
	}
	
	public boolean verificarNomeUsuarioJaExiste(String usuario){
		boolean nomeUsuarioJaExiste = false;
		if (usuario != null){
			if(time.size() > 0) {
				for (int i = 0; i < time.size(); i++){
					if (time.get(i).getUsuario().equals(usuario)) {
						nomeUsuarioJaExiste = true;
						break;
					}
				}
			}
		} else nomeUsuarioJaExiste = true;
		return nomeUsuarioJaExiste;
	}
	
	public int procurarIndice(Time time){
		int retAux = -1;
		for (int i = 0; i < time.size(); i++){
			if (time.get(i).getUsuario().equals(time.getUsuario())){
				retAux = i;
				break;
			}
		}
		return retAux;
	}
	
}
