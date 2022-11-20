package classes;

public class Administrador extends Funcionario {

	public Administrador(String cidade, String bairro, String rua, String pais, String cep, String nome, String email,
			Double salario) {
		super(cidade, bairro, rua, pais, cep, nome, email, salario);

	}

	Funcionario funcionario1 = new Funcionario(getCidade(), getBairro(), getRua(), getPais(), getCep(), getNome(),
			getEmail(), getSalario());

}
