package br.com.financeiro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "tb_categoria_lancamento_caixa")
public class CategoriaLancamentoCaixa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Categoria_Lancamento_Caixa_Id")
	private int id;

	@Column(name = "Categoria_Lancamento_Caixa_Descricao")
	private String descricao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@JsonProperty("descricao")
	public String getDescricao() {
		return descricao;
	}

	@JsonProperty("descricao")
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
