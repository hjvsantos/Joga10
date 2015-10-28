package classesPrincipais;

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
	public static String usuario;
	public String senha;
	public String inscricao;
	
	public Time(String nome, String estado, String cidade, String pais,
			String email, double telefone, String codigo,
			ArrayList<Olheiro> olheiros, ArrayList<Jogador> jogadoresObservados, String senha, String usuario, String inscricao) {
	
		this.nome = nome;
		Estado = estado;
		Cidade = cidade;
		Pais = pais;
		this.email = email;
		this.telefone = telefone;
		this.codigo = codigo;
		this.olheiros = olheiros;
		this.jogadoresObservados = jogadoresObservados;
		this.senha = senha;
		this.usuario = usuario;
		this.inscricao = inscricao;
	}

	
	
	public ArrayList<Olheiro> getOlheiros() {
		return olheiros;
	}



	public void setOlheiros(ArrayList<Olheiro> olheiros) {
		this.olheiros = olheiros;
	}


	
	
	public String getInscricao() {
		return inscricao;
	}



	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}



	public static String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
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
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Time))
			return false;
		Time other = (Time) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}



	public void remove(Time time) {
				
	}
	
}
