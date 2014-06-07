package br.com.imobiliaria.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Imovel implements Serializable {

	private static final long serialVersionUID = 1L;

	public Imovel() {
	
	}
	
	public Imovel(int id, String estado, String cidade, String bairro,
			String rua, String tipoImovel, String descricao, double valor,
			String tipoNegocio) {
		super();
		this.id = id;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.tipoImovel = tipoImovel;
		this.descricao = descricao;
		this.valor = valor;
		this.tipoNegocio = tipoNegocio;
	}



	@Id
	@Column
	private int id;
	
	@Column
	private String estado;
	
	@Column
	private String cidade;
	
	@Column
	private String bairro;
	
	@Column
	private String rua;
	
	@Column
	private String tipoImovel;
	
	@Column
	private String descricao;
	
	@Column
	private double valor;
	
	// Compra ou venda
	@Column
	private String tipoNegocio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public String getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(String tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipoNegocio() {
		return tipoNegocio;
	}

	public void setTipoNegocio(String tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

}
