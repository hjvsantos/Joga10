package Repositorios;

import java.util.List;

import ClassesPrincipais.Jogador;
import ClassesPrincipais.Olheiro;

public interface IRepositorioOlheiro {

public abstract boolean verificarCpfJaExistente(String CPF);
	
	public abstract boolean verificarRgJaExistente(String RG);
	
	public abstract boolean verificarNomeUsuarioJaExiste(String usuario);
	
	public abstract void cadastrarOlheiro(Olheiro olheiro);
	
	public abstract void removerOlheiro(Olheiro olheiro);
	
	public abstract Olheiro verificarLogin(String usuario, String senha);
	
	public abstract Olheiro retornarOlheiro(String usuario);
	
	public abstract boolean verificarRegistro(double registro);
}
