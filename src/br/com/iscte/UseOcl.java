package br.com.iscte;

public class UseOcl {
	
	private String nome;
	private int idade;
	private String endereco;

	
	public UseOcl(String nome, int idade, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	public UseOcl criarPessoa() {
		return new UseOcl("Nome", 30, "Rua dez");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
