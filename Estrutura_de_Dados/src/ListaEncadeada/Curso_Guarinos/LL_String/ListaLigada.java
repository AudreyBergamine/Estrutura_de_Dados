package ListaEncadeada.Curso_Guarinos.LL_String;

public class ListaLigada {
	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;
	
	
	public ListaLigada() {
//		super();
//		this.primeiro = primeiro;
//		this.ultimo = ultimo;
		this.tamanho = 0;
	}
	
	
	public Elemento getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}
	public Elemento getUltimo() {
		return ultimo;
	}
	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionar(String novoValor) {
		Elemento novoElemento = new Elemento(novoValor);
		
		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		} else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;			
		}
		tamanho++;
		
	}
	
	public void remover(String valorProcurado) {
		Elemento anterior = null;
		Elemento atual = this.primeiro;
		for (int i = 0; i < this.getTamanho(); i++) { 
			if (atual.getValor().equalsIgnoreCase(valorProcurado)) { // Se o atual tiver próximo
				
				// Remover o PRIMEIRO elemento se ele também for o ultimo
				if (this.getTamanho() == 1) { //      ou    (atual == primeiro && atual == ultimo)
					this.primeiro = null;
					this.ultimo = null;
					
				// Remover o PRIMEIRO elemento se houver outros elementos
				} else if (atual == primeiro) { 
					this.primeiro = atual.getProximo();
					atual.setProximo(null); // Remove a seta atual
													
				// Remover ULTIMO elemento
				} else if (atual == ultimo) { 
					this.ultimo = anterior; // O Anterior vira o ultimo
					anterior.setProximo(null); // E o ultimo vira null
					
				// Remover elemento do MEIO
				} else { 
					anterior.setProximo(atual.getProximo());
					atual = null;
				}
					this.tamanho--;
					break;		
			}
			anterior = atual;
			atual = atual.getProximo(); // Pega o valor do próximo
		}
		
	}
	
	
	
	public Elemento get(int posicao) {
		Elemento atual = this.primeiro;
		for (int i = 0; i < posicao; i++) {
			if (atual.getProximo() != null) { // Se o atual tiver próximo
				atual = atual.getProximo();
			} 	
		}
		return atual;
	}

	
	
	
}
