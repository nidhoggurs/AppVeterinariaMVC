package br.com.veterinaria.model.negocio;

import java.util.List;


public class Veterinaria {
	
	private Integer id;
	private String nome;
	private Localidade localidade;
	private List<Produto> produtos;	
	
	
	public Veterinaria() {}
	
	public Veterinaria(Integer id, String nome) {
		this();
		this.id = id;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s",
				this.getId(),
				this.getNome()
			);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Localidade getLocalidade() {
		return localidade;
	}

	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
