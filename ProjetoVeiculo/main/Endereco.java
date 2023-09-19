package main;

public class Endereco {
	private String logradouro;
	private String cep;
	private int numeroDaCasa;
	private String cidade;
	private String uf;
	private String bairro;

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumeroDaCasa() {
		return this.numeroDaCasa;
	}

	public void setNumeroDoCasa(int numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getUf() {
		return this.uf;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getBairro() {
		return this.bairro;
	}
}
