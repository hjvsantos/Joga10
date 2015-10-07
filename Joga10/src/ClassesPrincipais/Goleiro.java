package ClassesPrincipais;

import java.util.Date;

public class Goleiro extends Jogador{

	public int numeroDeGols;
	public int penaltisDefendidos;
	public double tempoSemLevarGol;
	
	public Goleiro(String nome, String posicao, double registro, String cidade,
			String estado, String cPF, String rG, Date dataNascimento,
			String telefone, String email, double passe, float altura,
			float peso, String timeAtual, int numeroDeGols, int penaltisDefendidos, double tempoSemLevarGol) {
		super(nome, posicao, registro, cidade, estado, cPF, rG, dataNascimento,
				telefone, email, passe, altura, peso, timeAtual);
	
			this.numeroDeGols = numeroDeGols;
			this.penaltisDefendidos = penaltisDefendidos;
			this.tempoSemLevarGol = tempoSemLevarGol;
		
	}

	public int getNumeroDeGols() {
		return numeroDeGols;
	}

	public void setNumeroDeGols(int numeroDeGols) {
		this.numeroDeGols = numeroDeGols;
	}

	public int getPenaltisDefendidos() {
		return penaltisDefendidos;
	}

	public void setPenaltisDefendidos(int penaltisDefendidos) {
		this.penaltisDefendidos = penaltisDefendidos;
	}

	public double getTempoSemLevarGol() {
		return tempoSemLevarGol;
	}

	public void setTempoSemLevarGol(double tempoSemLevarGol) {
		this.tempoSemLevarGol = tempoSemLevarGol;
	} 
	
	
	
	
	
	
	


}
