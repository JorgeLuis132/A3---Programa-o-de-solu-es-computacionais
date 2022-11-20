package classes;

public class Enderecos {
	private String cidade;
	private String bairro;
	private String rua;
	private String pais;
	private String cep;

	public Enderecos(String cidade, String bairro, String rua, String pais, String cep) {
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.pais = pais;
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
