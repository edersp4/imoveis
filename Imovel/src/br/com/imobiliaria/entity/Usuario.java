package br.com.imobiliaria.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Usuario() {
	}
	
	

	public Usuario(int id, String email, String nome, String senha,
			String sobrenome, String nickName) {
		super();
		this.id = id;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
		this.sobrenome = sobrenome;
		this.nickName = nickName;
	}

	@Id
	@Column
	private int id;
	
	@Column
	private String email;
	
	@Column
	private String nome;
	
	@Column
	private String senha;
	
	@Column
	private String sobrenome;
	
	@Column
	private String nickName;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
