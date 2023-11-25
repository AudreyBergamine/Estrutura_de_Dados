package ListaEncadeada.Aula_23_10_23.Exer_03_LE_Produtos;

public class Node {
	private Node proximo; // Vai apontar para o próximo elemento
	private Produtos produto;

	// Construtor
	public Node(Produtos produto) {
		this.produto = produto;
		this.proximo = null;
	}


	// GETTERS e SETTERS	
	// GETTERS e SETTERS	
	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

	public Produtos getProduto() {
		return produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}


	public Node pesquisar(Produtos produto) {
		if (produto == null || produto.getDescricao() == null) {
			return null;
		}        
		if (produto.equals(this.produto)) {
			return this;
		} else if (proximo != null) {
			return proximo.pesquisar(produto);
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Node: \nProduto: " + produto.getDescricao() + "\nValor: " + produto.getValor() + " --> Próximo: " + proximo + "\n";
	}
	
}
