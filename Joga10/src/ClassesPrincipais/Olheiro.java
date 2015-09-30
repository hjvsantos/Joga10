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
	
	public Olheiro(String nome, String empregador, double registro,
			String cidade, String estado, String cPF, double rG,
			Date dataNascimento, double telefone, String email) {
	
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
	}
	
	
}
