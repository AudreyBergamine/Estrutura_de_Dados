package Arvore;
// Continuar


public class Arvore {
	private Elemento ele;
	private Arvore esquerda;
	private Arvore direita;
	
	// CONSTRUTOR
	public Arvore(Elemento elem) {
		this.ele = elem;
		this.direita = null;
		this.esquerda=null;
		System.out.println("Criei a árvore com o elemento: " + elem.getValor());
	}
	
	public boolean isEmpty() {
		return (this.ele == null);
	}

	
	// Inserir um nó na árvore
	public void adicionar(Elemento novo) {
		// Verifica se a árvore está vazia
		if (isEmpty()) {
			// Se a árvore estiver vazia, cria um novo elemento
			ele = novo;
			
		// Se a árvore já tiver elementos, vamos criar uma nova arvore
		} else {
			Arvore novaArvore = new Arvore(novo); // estará a direita ou a esquerda
			
			// Se o novo valor for menor que o elemento => vai para a esquerda
			if (novo.getValor() < this.ele.getValor()) { 
				if (this.esquerda == null) { // Se for null, é uma folha
					this.esquerda = novaArvore; // Então essa folha vai ser tornar uma arvore
					System.out.println("O elemento " + novo.getValor() 
									+ " foi adicionado á esquerda do valor " 
									+ this.ele.getValor());	
				} else {
					this.esquerda.adicionar(novo);
				}
			// Se o novo valor for maior que o elemento => vai para a direita
			} else if (novo.getValor() > this.ele.getValor()) {
				
				if (this.direita == null) { // Se for null, é uma folha
					this.direita = novaArvore; // Então essa folha vai ser tornar uma arvore
					System.out.println("O elemento " + novo.getValor() 
					+ " foi adicionado á direita do valor " 
					+ this.ele.getValor());	
					
				} else {
					this.direita.adicionar(novo);
				}
			}			
		}
	}
	
	
	
	
	// Remover um nó de uma arvore
	
	
	
	
	
	// Consultar os nós em ordem (In-ordem)
	public void imprimirInOrdem() {
		if (!isEmpty()) { // Se não estiver vazia
			if (this.esquerda != null) {
				this.esquerda.imprimirInOrdem();				
			}			
			System.out.println(this.ele.getValor() + "  "); // Chegou na Raiz
			if (this.direita != null) {
				this.direita.imprimirInOrdem();				
			}			
		}
	}
	
	
		
	
	// Consultar em pré-ordem;
	public void imprimirPreOrdem() { 
		if (!isEmpty()) { // Se não estiver vazia
			System.out.println(this.ele.getValor() + "  ");
			if (this.esquerda != null) {
				this.esquerda.imprimirPreOrdem();				
			}			
			if (this.direita != null) {
				this.direita.imprimirPreOrdem();				
			}			
		}
	}
	
	
	
	// Consultar em pós-ordem;
	public void imprimirPosOrdem() { 
		if (!isEmpty()) { // Se não estiver vazia
			if (this.direita != null) {
				this.direita.imprimirPosOrdem();				
			}				
			if (this.esquerda != null) {
				this.esquerda.imprimirPosOrdem();				
			}			
			System.out.println(this.ele.getValor() + "  ");
		}
	}
	
	
	
	
	// Consultar os nós em ordem Invertida (In-ordem Invertida)
	public void imprimirInOrdemInvertida() { 
		if (!isEmpty()) { // Se não estiver vazia
			if (this.direita != null) {
				this.direita.imprimirInOrdemInvertida();				
			}				
			if (this.esquerda != null) {
				this.esquerda.imprimirInOrdemInvertida();				
			}			
		}
		System.out.println(this.ele.getValor() + "  "); // *********** Arrumar a posição do sysout *************
	}
	

	
	
}
