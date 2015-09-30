package ClassesPrincipais;

import java.util.ArrayList;

public class Time {

	public String nome;
	public String Estado;
	public String Cidade;
	public String Pais;
	public String email;
	public double telefone;
	public String codigo; //Algo que funcione como o registro do time
	private ArrayList<Olheiro> olheiros = new ArrayList<Olheiro>();
	private ArrayList<Jogador> jogadoresObservados = new ArrayList<Jogador>();
	
	public Time(String nome, String estado, String cidade, String pais,
			String email, double telefone, String codigo,
			ArrayList<Olheiro> olheiros, ArrayList<Jogador> jogadoresObservados) {
	
		this.nome = nome;
		Estado = estado;
		Cidade = cidade;
		Pais = pais;
		this.email = email;
		this.telefone = telefone;
		this.codigo = codigo;
		this.olheiros = olheiros;
		this.jogadoresObservados = jogadoresObservados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}
