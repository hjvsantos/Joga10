package negocios;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import repositorios.IRepositorioJogador;
import repositorios.IRepositorioOlheiro;
import repositorios.IRepositorioTime;
import repositorios.RepositorioJogador;
import repositorios.RepositorioOlheiro;
import repositorios.RepositorioTime;
import classesPrincipais.Jogador;
import classesPrincipais.Olheiro;
import classesPrincipais.Time;
import classesPrincipais.Goleiro;

public class ControladorJogador {

	private IRepositorioTime repositorioTime;
	private RepositorioOlheiro repositorioOlheiro;
	private IRepositorioJogador repositorioJogador;
	private LocalDate dia;
	
	public LocalDate getDia() {
		return dia;
	}
	
	public ControladorJogador(){
		this.repositorioTime = (IRepositorioTime) RepositorioTime.getInstancia();
		this.repositorioOlheiro = RepositorioOlheiro.getInstancia();
		this.repositorioJogador = (IRepositorioJogador) RepositorioJogador.getInstancia();
		
		public void cadastrarJogador(Jogador jogador) throws UsuarioCurtoException, UsuarioLongoException, UsuarioExistenteException, SenhaCurtaException, SenhaLongaException{
			boolean usuarioExistente=(Boolean) null;
			boolean nomeUsuarioJaExiste=(Boolean) null;
			
			if (jogador == null){
				throw new IllegalArgumentException(); // o que fazer quando null?
			} else {
				if (Utilidades.nomeUsuarioNosConformes(jogador.getUsuario())){

				} else {
					throw new UsuarioCurtoException();
				}
				
				Utilidades.nomeNosConformes(jogador.getNome());
	
				nomeUsuarioJaExiste = repositorioJogador.verificarNomeUsuarioJaExiste(jogador.getUsuario());
				if (usuarioExistente == false && nomeUsuarioJaExiste == false){
					repositorioJogador.cadastrarJogador(jogador);
				} else if (usuarioExistente){
					throw new UsuarioExistenteException();
				} if (nomeUsuarioJaExiste){
					throw new UsuarioExistenteException();
				}
			} 
		}
	}
	
	public void removerJogador(Jogador jogador) throws UsuarioNaoEncontradoException { 
			if (jogador != null){
			int index = repositorioJogador.procurarIndice(jogador);
			if (index != -1){
				Jogador jogadorParaRemover = repositorioJogador.removerJogador(jogador);
				if (jogadorParaRemover != null){
					for (Jogador j: jogadorParaRemover){
						repositorioJogador.removerJogador(j);
					}
				}
				repositorioJogador.removerJogador(jogador);
			}
			else throw new JogadorNEncontradoException();
		} else{ 
			throw new IllegalArgumentException();
		}
	}
}
