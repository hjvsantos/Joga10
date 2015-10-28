package repositorios;

import java.util.List;

import classesPrincipais.Time;

public interface IRepositorioTime {

	public abstract boolean verificarInscricaoJaExistente(String inscricao);
	
	public abstract boolean verificarNomeUsuarioJaExiste(String usuario);
	
	public abstract void cadastrarTime(Time time);
	
	public abstract void removerTime(Time time);
		
	public abstract boolean verificarCodigo(String codigo);
}
