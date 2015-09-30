package ClassesPrincipais;

import java.util.Date;

public class Jogador {
	public String nome;
	public String posicao;
	public double registro;
	public String cidade;
	public String estado;
	public String CPF;
	public double RG;
	public Date DataNascimento;
	public double telefone;
	public String email;
	public double passe;
	public float altura;
	public float peso;
	public String timeAtual;


	public Jogador(String nome, String posicao, double registro, String cidade, String estado, String cPF, double rG,
			Date dataNascimento, double telefone, String email, double passe, float altura, float peso,
			String timeAtual) {
		
		this.nome = nome;
		this.posicao = posicao;
		this.registro = registro;
		this.cidade = cidade;
		this.estado = estado;
		CPF = cPF;
		RG = rG;
		DataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.passe = passe;
		this.altura = altura;
		this.peso = peso;
		this.timeAtual = timeAtual;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getPosicao() {
		return posicao;
	}


	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}


	public double getRegistro() {
		return registro;
	}


	public void setRegistro(double registro) {
		this.registro = registro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public double getRG() {
		return RG;
	}


	public void setRG(double rG) {
		RG = rG;
	}


	public Date getDataNascimento() {
		return DataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}


	public double getTelefone() {
		return telefone;
	}


	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getPasse() {
		return passe;
	}


	public void setPasse(double passe) {
		this.passe = passe;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public String getTimeAtual() {
		return timeAtual;
	}


	public void setTimeAtual(String timeAtual) {
		this.timeAtual = timeAtual;
	}
	
}

