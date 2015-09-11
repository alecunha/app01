
package br.com.casadocodigo.model;

public class UsuarioVO {

	private String nome;
	
	private String senha;
	
	public UsuarioVO(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
