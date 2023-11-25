package Pilha.Pilha_E_ListaEncadeada;


public class ListaLigada {
	
	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;
	
	public ListaLigada() {
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
		if(this.primeiro == null && this.ultimo ==null) {  // this pra dizer que estamos usando um atributo da clase ligada
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
			this.tamanho++;
		}else {
			novoElemento.setProximo(this.primeiro);
			this.primeiro = novoElemento;
		}
		this.tamanho++; // como uso no if e no else posso colocar fora dos dois 
	}
	
	public void remover(String valorProcurado){
		Elemento anterior = null;
		Elemento atual = this.primeiro;
		for(int i= 0; i<this.getTamanho(); i++) {
			// removento o primeiro, o ultimo e o do meio
			if(atual.getValor().equalsIgnoreCase(valorProcurado)) { //equalsignorecase é pra saber se o valor é igual ao valor procurado..mesmo que iquivale
				if(atual==primeiro && atual == ultimo) {
					this.primeiro = null;
					this.ultimo = null;
				}else if(atual == primeiro) {
					this.primeiro = atual.getProximo();
					atual.setProximo(null);  // o atual agora vai ser o proximo nulo, assim apagandp o ultimo
					
				}else if(atual ==ultimo) {
					this.ultimo = anterior;
					anterior.setProximo(null); // o anterior vai ser o proximo apagando o ultimo
				}else {
				
				anterior.setProximo(atual.getProximo()); // o anterior vai ter o proximo, assim apagando o atual
				atual = null;
				}
				this.tamanho--;
				break;
				
			}
			anterior = atual ; // anterior tem que andar junto com o atual na hora da pesquisa
			atual = atual.getProximo(); // quando pula do primeiro o atual passa a ser o proximo
		}
	}
	
	public String get() {
		
		return this.getPrimeiro().getValor();
	}

}


