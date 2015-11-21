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

import classesPrincipais.Jogador;
import classesPrincipais.Olheiro;
import negocios.ControladorJogador;
import negocios.ControladorOlheiro;

public class RepositorioOlheiro {
	
	private static final long serialVersionUID = 1L;
	List<Olheiro> olheiro = new ArrayList<Olheiro>();
	public static ControladorOlheiro cadastroOlheiro = new ControladorOlheiro();
	private static RepositorioOlheiro instancia;

	public static RepositorioOlheiro getInstancia() {
		if (instancia == null) {
			instancia = lerDoArquivo();
		}
		return instancia;
	}
	
	private static RepositorioOlheiro lerDoArquivo() {
		RepositorioOlheiro instanciaLocal = null;

		File in = new File("repositorioOlheiro.dat");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			instanciaLocal = (RepositorioOlheiro) o;
		} catch (Exception e) {
			instanciaLocal = new RepositorioOlheiro();
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
		File out = new File("repositorioOlheiro.dat");
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
				} catch (IOException e) {
				}
			}
		}
	}
	
	public List<Olheiro> getOlheiro() {
		if(this.olheiro!=null)
			Collections.sort(olheiro);
		return olheiro;
	}
	
	public void cadastrarOlheiro(Olheiro olheiro){
		this.olheiro.add(olheiro);
	}
	
	public void atualizarOlheiro(Olheiro olheiro, int posicao){
		this.olheiro.set(posicao, olheiro);
	}
	
	public void removerOlheiro(Olheiro olheiro) {
		this.olheiro.remove(olheiro);
	}
	
	public boolean verificarNomeUsuarioJaExiste(String usuario){
		boolean nomeUsuarioJaExiste = false;
		if (usuario != null){
			if(olheiro.size() > 0) {
				for (int i = 0; i < this.olheiro.size(); i++){
					if (olheiro.get(i).getUsuario().equals(usuario)) {
						nomeUsuarioJaExiste = true;
						break;
					}
				}
			}
		} else nomeUsuarioJaExiste = true;
		return nomeUsuarioJaExiste;
	}
	
	
}
