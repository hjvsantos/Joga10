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

public class ControladorOlheiro {
	
	private IRepositorioTime repositorioTime;
	private IRepositorioOlheiro repositorioOlheiro;
	private IRepositorioJogador repositorioJogador;
	private LocalDate dia;
	
	public LocalDate getDia() {
		return dia;
	}
	
	
	
}
