package repositorios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import negocios.ControladorJogador;
import negocios.ControladorTime;
import classesPrincipais.Jogador;
import classesPrincipais.Olheiro;
import classesPrincipais.Time;


public class RepositorioJogador {

	private static final long serialVersionUID = 1L;
	List<Jogador> jogador = new ArrayList<Jogador>();
	public static ControladorJogador cadastroTime = new ControladorJogador();
	private static RepositorioJogador instancia;
	
	public static RepositorioJogador getInstancia() {
		if (instancia == null) {
			instancia = lerDoArquivo();
		}
		return instancia;
	}
	
	private static RepositorioJogador lerDoArquivo() {
		RepositorioJogador instanciaLocal = null;

		File in = new File("repositorioJogador.dat");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			instanciaLocal = (RepositorioJogador) o;
		} catch (Exception e) {
			instanciaLocal = new RepositorioJogador();
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
		File out = new File("repositorioJogador.dat");
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
	
	public List<Jogador> getJogador() {
		if(this.jogador!=null)
			Collections.sort(jogador);
		return jogador;
	}
	
	public void cadastrarJogador(Jogador jogador){
		this.jogador.add((classesPrincipais.Jogador) jogador);
	}
	
	public void atualizarJogador(Jogador jogador, int posicao){
		jogador.set(posicao, jogador);
	}
	
	public void removerJogador(Jogador jogador) {
		jogador.remove(jogador);
	}
	
	public Jogador retornarJogador(String usuario){
		Jogador jogador = null;
		for (int i = 0; i < jogador.size(); i++){
			if (jogador.get(i).getUsuario().equals(usuario)) {		
				jogador = jogador.getUsuario(i);
				break;
			}
		}
		return jogador;
	} 
	
	public boolean verificarNomeUsuarioJaExiste(String usuario){
		boolean nomeUsuarioJaExiste = false;
		if (usuario != null){
			if(jogador.size() > 0) {
				for (int i = 0; i < jogador.size(); i++){
					if (jogador.get(i).getUsuario().equals(usuario)) {
						nomeUsuarioJaExiste = true;
						break;
					}
				}
			}
		} else nomeUsuarioJaExiste = true;
		return nomeUsuarioJaExiste;
	}
	
	public int procurarIndice(Jogador jogador){
		int retAux = -1;
		for (int i = 0; i < jogador.size(); i++){
			if (jogador.get(i).getUsuario().equals(jogador.getUsuario())){
				retAux = i;
				break;
			}
		}
		return retAux;
	}
}
