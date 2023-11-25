package ListaEncadeada.Aula_23_10_23.Exer_03_LE_Produtos;

import javax.swing.JOptionPane;

public class Lista {
	private Node primeiro; // Chamamos a classe Nozinho com o nome do objeto primeiro
	private Node ultimo;
	private int tamanho = 0;

	public Lista() { // No construtor criamos a lista
		primeiro = null;
	}

	public boolean vazia() {
		if (primeiro == null) {
			//JOptionPane.showMessageDialog(null, "Lista Vazia");
			//System.out.println("Lista vazia");
			return true;
		} else {
			//JOptionPane.showMessageDialog(null, "Lista com elementos!");
			//System.out.println("Lista com elementos");
			return false;
		}
	}



	//	public void adiciona(int i) {
	//		Nozinho novo = new Nozinho(); 	// Cria um novo nó (Vazio) 
	//		novo.setValor(i);							// Insere o valor
	//		novo.setProximo(null);					// Aponta para o próximo, que vai ser o novo primeiro 
	//		primeiro = novo;							// Onde o primeiro vai er o novo "novo"
	//	}	


	public void adiciona(Produtos produto) {
	    Node novo = new Node(produto);

	    if (tamanho == 0) {
	        primeiro = novo;
	        ultimo = primeiro;
	    } else {
	        ultimo.setProximo(novo);
	        ultimo = novo;
	    }

	    tamanho++;
	}


	public Produtos[] pesquisar(String descricao) {
		descricao = descricao != null ? descricao.toLowerCase() : "";
		Produtos[] produtos = new Produtos[0];
		for (Node no = primeiro; no != null; no = no.getProximo()) {
	        if (no.getProduto().getDescricao().toLowerCase().contains(descricao)) {
	        	Produtos[] newProdutos = new Produtos[produtos.length +1];
	        	for (int i = 0; i < produtos.length; i++) {
	        		newProdutos[i] = produtos[i];					
				}
	        		produtos = newProdutos;
	        		produtos[produtos.length -1] = no.getProduto();
	        }
	    }

	    return produtos;
	}


	
	// Arrumar 
	public void remover(Produtos produto) {
	    Node anterior = null; // Referência para o elemento anterior
	    Node p = primeiro; // Para percorrer a nossa lista
	    while (p != null && !p.getProduto().equals(produto.getDescricao())) { // Procura o elemento na lista guardando anterior
	        anterior = p;
	        p = p.getProximo();
	    }
	    if (p == null) { // Verifica se o elemento foi encontrado
	        return;
	    }
	    if (anterior == null) { // Remove o elemento da lista
	        primeiro = p.getProximo();
	    } else {
	        anterior.setProximo(p.getProximo());
	    }
	}
	
	
	
	
	
	
	public void limpar() {
	    while (!vazia()) {
	        Node no = primeiro;
	        primeiro = no.getProximo();
	        tamanho--;
	    }
	    ultimo = null;
	}
	
	

	public void print() {
	    if (vazia()) {
	        JOptionPane.showMessageDialog(null, "A lista está vazia.");
	    } else {
	        Node atual = primeiro;
	        String listaProdutos = "";

	        while (atual != null) {
	            Produtos produto = atual.getProduto();
	            listaProdutos += "Descrição: " + produto.getDescricao() + "\nValor: R$ " + produto.getValor() + "\n";

	            if (atual.getProximo() != null) {
	                listaProdutos += "Próximo: --->\n\n";
	            } else {
	                listaProdutos += "Próximo: ---> \n\n null";
	            }

	            atual = atual.getProximo();
	        }

	        JOptionPane.showMessageDialog(null, listaProdutos);
	    }
	}
}
