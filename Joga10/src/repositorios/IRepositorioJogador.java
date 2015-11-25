package repositorios;

import java.util.List;

import classesPrincipais.Jogador;


public interface IRepositorioJogador {
	
	public abstract boolean verificarCpfJaExistente(String CPF);
	
	public abstract boolean verificarRgJaExistente(String RG);
	
	public abstract boolean verificarNomeUsuarioJaExiste(String usuario); 
	
	public abstract void cadastrarJogador(Jogador jogador);
	
	public abstract Jogador removerJogador(Jogador jogador);
	
	public abstract Jogador verificarLogin(String usuario, String senha);
	
	public abstract Jogador retornarJogador(Jogador jogador);
	
	public abstract boolean verificarRegistro(double registro);

	public abstract int procurarIndice(Jogador jogador);
}
