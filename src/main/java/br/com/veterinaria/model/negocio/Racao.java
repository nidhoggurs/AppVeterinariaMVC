package br.com.veterinaria.model.negocio;

public class Racao extends Produto {

	private String fabricante;
	private String raca;

	public Racao() {
		this.setTipoProduto("Racao");
	}
	
	public Racao(String fabricante, String raca) {
		this();
		this.fabricante = fabricante;
		this.raca = raca;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s", 
				this.getFabricante(),
				this.getRaca()
			);
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}