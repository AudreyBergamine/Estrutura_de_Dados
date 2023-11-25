package Lista._ModeloLista;

import javax.swing.JOptionPane;

public class EstruturaEstatica <T>{
	// ATRIBUTOS:
	protected T[] elementos;
	protected int tamanho;

	// CONSTRUTORES:
	public EstruturaEstatica() {
		this(10);
	}

	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade]; // Solução do livro
		this.tamanho = 0;
	}
	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade, Class<T> tipoClasse) { 
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	// GETTERS AND SETTERS
	public T[] getElementos() {
		return elementos;
	}

	public void setElementos(T[] elementos) {
		this.elementos = elementos;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	// MÉTODOS / FUNÇÕES:
	public boolean estaVazia() {
		return this.tamanho == 0;
	}

	public boolean estaCheia() {
		return this.tamanho == this.elementos.length;
	}


	// Função para mostrar o tamanho real do Vetor
	public int tamanho() {
		System.out.print("Tamanho real do vetor: ");
		return this.tamanho;
	}


	// Função para aumentar a capacidade do Vetor (tamanho)
	protected void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			@SuppressWarnings("unchecked")
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}



	// Add no início da lista
	public void adicionaInicio(T elemento) {
		// Verifica se a lista está cheia, se estiver, aumenta a capacidade
		if (this.tamanho == this.elementos.length) {
			this.aumentaCapacidade();
		}
		// Move todos os elementos para a direita para liberar espaço para o novo elemento
		for (int i = this.tamanho - 1; i >= 0; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		// Insere o novo elemento no início
		this.elementos[0] = elemento;
		this.tamanho++;
	}


	// Validação se o usuário deu uma posição válida
	protected boolean adicionaPosicao(int posicao, T elemento) { // Protected: Só as classes que pertencem ao pacote BASE e filhas poderão ver os métodos
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		this.aumentaCapacidade();
		// Função para mover todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}



	// Add um novo elemento no final > A classe Pilha está herdando essa Função
	protected boolean adicionaFinal(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}



	public void removeInicio() {
		if (estaVazia()) {
			throw new IllegalStateException("A lista está vazia, não é possível remover.");
		}
		// Move todos os elementos para a esquerda para preencher o espaço deixado pelo elemento removido
		for (int i = 0; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		// Define o último elemento como nulo e decrementa o tamanho
		this.elementos[this.tamanho - 1] = null;
		this.tamanho--;
	}



	public void removePosicao(int posicao) {
		if (posicao < 0 || posicao >= tamanho) {
			throw new IllegalArgumentException("Posição inválida");
		}
		// Move os elementos após a posição para a esquerda para preencher o espaço deixado pelo elemento removido
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		// Define o último elemento como nulo e decrementa o tamanho
		this.elementos[this.tamanho - 1] = null;
		this.tamanho--;
	}



	public void removeFinal() {
		if (estaVazia()) {
			throw new IllegalStateException("A lista está vazia, não é possível remover.");
		}
		// Define o último elemento como nulo e decrementa o tamanho
		this.elementos[this.tamanho - 1] = null;
		this.tamanho--;
	}
	
	
	  public T obtemPrimeiro() {
	        if (estaVazia()) {
	            throw new IllegalStateException("A lista está vazia, não há primeiro elemento.");
	        }
	        return this.elementos[0];
	    }


	    public T obtemUltimo() {
	        if (estaVazia()) {
	            throw new IllegalStateException("A lista está vazia, não há último elemento.");
	        }
	        return this.elementos[this.tamanho - 1];
	    }
	    
	    
	    public String procurarString(String valor) {
	        for (int i = 0; i < this.tamanho; i++) {
	            if (elementos[i] != null && elementos[i].toString().equals(valor)) {
	                return "Elemento '" + valor + "' encontrado na posição " + i;
	            }
	        }
	        return "Elemento '" + valor + "' não encontrado na lista";
	    }

	    public int procurarInteiro(int valor) {
	        for (int i = 0; i < this.tamanho; i++) {
	            if (elementos[i] != null && elementos[i].equals(valor)) {
	                return i;
	            }
	        }
	        return -1; // Retorna -1 se não encnotrar 
	    }


















	public String toString() {
		String s = "";
		s += "[";

		for (int i = 0; i < this.tamanho - 1; i++) {
			s += this.elementos[i];
			s += " , ";
		}
		if (this.tamanho > 0) {
			s += this.elementos[this.tamanho - 1];
		}
		s += " ] ";
		//System.out.println(s);
		JOptionPane.showMessageDialog(null, s);
		return s;
	}
}


//	// Função ToString concatenado, usando StringBuilder
//	@Override
//	public String toString() {
//
//		StringBuilder s = new StringBuilder();
//		s.append("[");
//
//		for (int i = 0; i < this.tamanho - 1; i++) {
//			s.append(this.elementos[i]);
//			s.append(" , ");
//		}
//		if (this.tamanho > 0) {
//			s.append(this.elementos[this.tamanho - 1]);
//		}
//		s.append(" ] ");
//
//		return s.toString();
//	}
