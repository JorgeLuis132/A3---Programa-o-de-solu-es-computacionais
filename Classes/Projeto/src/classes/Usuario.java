package classes;

public class Usuario extends Enderecos {

	public String nome;
	public String idade;
	private String login;
	private String senha;
	private String codigoDeAcesso;

	public Usuario(String cidade, String bairro, String rua, String pais, String cep, String nome, String idade,
			String login, String senha, String codigoDeAcesso) {
		super(cidade, bairro, rua, pais, cep);
		this.nome = nome;
		this.idade = idade;
		this.login = login;
		this.senha = senha;
		this.codigoDeAcesso = codigoDeAcesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCodigoDeAcesso() {
		return codigoDeAcesso;
	}

	public void setCodigoDeAcesso(String codigoDeAcesso) {
		this.codigoDeAcesso = codigoDeAcesso;
	}

}
