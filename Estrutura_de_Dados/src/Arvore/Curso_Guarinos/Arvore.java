package Arvore.Curso_Guarinos;

public class Arvore <T extends Comparable > { // Árvore Binária Ordenada
	private Elemento<T> raiz;
	
	
	public Arvore() {
		this.raiz = null;
	}
	
	
	public void adicionar(T valor) {
		Elemento<T> novoElemento = new Elemento<T>(valor);
		if (raiz == null) { // Se a árvore estiver vazia
			this.raiz = novoElemento;
		} else {
			Elemento<T> atual = this.raiz;
			
			while (true) {			
				
				// Se for menor(-1): Vamos mandar para a esquerda
				if (novoElemento.getValor().compareTo(atual.getValor()) == -1) { // compereTo retorna: 0 (Zero) quando é igual  / -1 quando é menor  /  1 quando é maior
					if (atual.getEsquerda() != null) { // Se o nó não estiver vazio, o nó vira o proximo a ser analisado
						atual = atual.getEsquerda();
					} else { // Caso não tenha nó na esquerda
						atual.setEsquerda(novoElemento);
						break;
					}
					
				// Se for maior(1) ou igual(0): Vamos mandar para a direita
				} else { 
					if (atual.getDireita() != null) { // Se o nó não estiver vazio, o nó vira o proximo a ser analisado
						atual = atual.getDireita();
					} else { // Caso não tenha nó na direita...
						atual.setDireita(novoElemento);
						break;
					}
				}
			}
		}
	}
	
	
	
	
	public Elemento<T> getRaiz() {
		return raiz;
	}


	public void setRaiz(Elemento<T> raiz) {
		this.raiz = raiz;
	}
	
	
	
	
	
	// Remover um elemento em Ordem
	// Parei aqui: https://www.youtube.com/watch?v=_f4rwbOylYo&list=PLTLAlheiUm5FRR5BNn4iBFwzYHiNq2Iv2&index=22


	// Imprimir em Ordem
	public void emOrdem(Elemento<T> atual) {
		if (atual != null) {
			emOrdem(atual.getEsquerda());
			System.out.println(atual.getValor());			
			emOrdem(atual.getDireita());
		}
	}
		
		
	// Imprimir PRÉ ORDEM (de Cima p/ esquerda baixa depois direita)
		public void preOrdem(Elemento<T> atual) {
			if (atual != null) {
				System.out.println(atual.getValor());
				preOrdem(atual.getEsquerda());				
				preOrdem(atual.getDireita());
			} 
		}
	

	
	
	// Imprimir PRÓS ORDEM (Esquerda (baixo) p/ Direita, depois p/ Cima)
		public void posOrdem(Elemento<T> atual) {
			if (atual != null) {
				posOrdem(atual.getEsquerda());				
				posOrdem(atual.getDireita());
				System.out.println(atual.getValor());
			} 
		}

}
