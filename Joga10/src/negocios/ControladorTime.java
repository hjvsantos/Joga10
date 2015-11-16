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


public class ControladorTime {

	private IRepositorioTime repositorioTime;
	private IRepositorioOlheiro repositorioOlheiro;
	private IRepositorioJogador repositorioJogador;
	private LocalDate dia;
	
	public LocalDate getDia() {
		return dia;
	}
	
	public ControladorTime(){
		this.repositorioTime = (IRepositorioTime) RepositorioTime.getInstancia();
		this.repositorioOlheiro = RepositorioOlheiro.getInstancia();
		this.repositorioJogador = RepositorioJogador.getInstancia();
	}
	
	public void cadastrarTime(Time time) throws UsuarioCurtoException, UsuarioLongoException, UsuarioExistenteException, SenhaCurtaException, SenhaLongaException{
		boolean usuarioExistente=(Boolean) null;
		boolean nomeUsuarioJaExiste=(Boolean) null;

		if (time == null){
			throw new IllegalArgumentException();// o que fazer quando null?
		} else {
			if (Utilidades.nomeUsuarioNosConformes(time.getUsuario())){

			} else {
				throw new UsuarioCurtoException();
			}
			
			Utilidades.nomeNosConformes(time.getNome());

			//chamar método nomeUsuarioNosConforme e senha tb.		
			nomeUsuarioJaExiste = repositorioTime.verificarNomeUsuarioJaExiste(Time.getUsuario());
			if (usuarioExistente == false && nomeUsuarioJaExiste == false){
				repositorioTime.cadastrarTime(time);
			} else if (usuarioExistente){
				throw new UsuarioExistenteException();
			} if (nomeUsuarioJaExiste){
				throw new UsuarioExistenteException();
			}
		} 
	}
	
	public void removerTime(Time time) throws UsuarioNaoEncontradoException {
		List<Olheiro> olheirosContratados = null;
		if (time != null){
			int index = repositorioTime.procurarIndice(time);
			if (index != -1){
				TimesASeremRemovidos = repositorioTime.
				if (produtosASeremRemovidos != null){
					for (Produto p: produtosASeremRemovidos){
						repositorioTime.removerProduto(p);
					}
				}
				repositorioVendedor.removerVendedor(vendedor);
			}
			else throw new NaoEncontradoVendedorException();
		} else{ 
			throw new IllegalArgumentException();
		}
	}
	
	
}
