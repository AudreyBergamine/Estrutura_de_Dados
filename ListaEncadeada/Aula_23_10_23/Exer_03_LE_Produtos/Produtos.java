
package ListaEncadeada.Aula_23_10_23.Exer_03_LE_Produtos;

public class Produtos {
	private String descricao;
	private Double valor;
	
	
	public Produtos() {
	}

	public Produtos(String descricao, Double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String toString() {
		return "" 
				+  "\nDescricao: " + getDescricao() 
				+ "\nValor: " + getValor() 
				+ "\n\n";
	}	

}
