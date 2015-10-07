package Repositorios;

import java.util.List;

import ClassesPrincipais.Time;

public interface IRepositorioTime {

	public abstract boolean verificarInscricaoJaExistente(String inscricao);
	
	public abstract boolean verificarNomeUsuarioJaExiste(String usuario);
	
	public abstract void cadastrarTime(Time time);
	
	public abstract void removerTime(Time time);
	
	public abstract Time verificarLogin(String usuario, String senha);
	
	public abstract boolean verificarCodigo(String codigo);
}
