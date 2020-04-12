package br.com.veterinaria.model.negocio;

public class Localidade {

	private Integer id;
	private String bairro;
	
	public Localidade() {
	}
	public Localidade(Integer id, String bairro) {
		this();
		this.id = id;
		this.bairro = bairro;
	}
	
	@Override
	public String toString() {
		return String.format("d% - %s",
				this.getId(),
				this.getBairro()
			);
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
