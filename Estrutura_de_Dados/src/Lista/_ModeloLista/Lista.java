package Lista._ModeloLista;

public class Lista <T> extends EstruturaEstatica<T> {
	public Lista() {
		super();
	}

	public Lista(int capacidade) {
		super(capacidade);
	}

	// Add um novo elemento no final
	public boolean adicionaFinal(T elemento) {
		return super.adicionaFinal(elemento);
	}

	// Validação se o usuário deu uma posição válida
	public boolean adicionaPosicao(int posicao, T elemento) {
		return super.adicionaPosicao(posicao, elemento);
	}
}
