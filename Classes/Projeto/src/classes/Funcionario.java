package classes;

public class Funcionario extends Enderecos {
	private String nome;
	private String email;
	private Double salario;

	public double calcularSalario() {
		this.salario = 500.00;
		return this.salario;
	}

	public Funcionario(String cidade, String bairro, String rua, String pais, String cep, String nome, String email,
			Double salario) {
		super(cidade, bairro, rua, pais, cep);
		this.nome = nome;
		this.email = email;
		this.salario = salario;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
