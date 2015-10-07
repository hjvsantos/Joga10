package ClassesPrincipais;

import java.util.Date;


public class Olheiro {

	public String nome;
	public String empregador;
	public double registro; //registro de olheiro, todos tem ao se cadastrar
	public String cidade;
	public String estado;
	public String CPF;
	public double RG;
	public Date DataNascimento;
	public double telefone;
	public String email;
	public double preçoServiço;
	public String usuario;
	public String senha;
	
	public Olheiro(String nome, String empregador, double registro,
			String cidade, String estado, String cPF, double rG,
			Date dataNascimento, double telefone, String email, double preçoServiço, String usuario, String senha) {
	
		this.nome = nome;
		this.empregador = empregador;
		this.registro = registro;
		this.cidade = cidade;
		this.estado = estado;
		CPF = cPF;
		RG = rG;
		DataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.preçoServiço = preçoServiço;
		this.usuario = usuario;
		this.senha = senha;
		
	}

	
	
	public double getPreçoServiço() {
		return preçoServiço;
	}



	public void setPreçoServiço(double preçoServiço) {
		this.preçoServiço = preçoServiço;
	}



	public String getUsuario() {
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

	public String getEmpregador() {
		return empregador;
	}

	public void setEmpregador(String empregador) {
		this.empregador = empregador;
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
	
	
	
}
