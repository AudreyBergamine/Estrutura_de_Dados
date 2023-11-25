package Lista;

public class Lista_Char_New {
	private char[] vetor;
	private int quantidade;


	public Lista_Char_New(int capacidade) {
		vetor = new char[capacidade];
		quantidade = 0;
	}


	public void adicionar(char caractere) {
		if (quantidade < vetor.length) {
			vetor[quantidade] = caractere;
			quantidade++;
		} else {
			System.out.println("A lista está cheia. Não é possível adicionar mais elementos.");
		}
	}


	public void remover() {
		if (quantidade > 0) {
			quantidade--;
			vetor[quantidade] = '\0'; // Define o último caractere como nulo
		} else {
			System.out.println("A lista está vazia. Não é possível remover elementos.");
		}
	}


	// Método para verificar se os caracteres formam um palíndromo
	public boolean ehPalindromo() {
		int esquerda = 0;
		int direita = quantidade - 1;

		while (esquerda < direita) {
			if (vetor[esquerda] != vetor[direita]) {
				return false; // Se os caracteres não forem iguais, não é palíndromo
			}
			esquerda++;
			direita--;
		}
		return true; // Se passou pelo loop sem retornar false, é um palíndromo
	}


	// Método para concatenar os caracteres em uma String e retorná-la
	public String concatenar() {
		String resultado = "";
		for (int i = 0; i < quantidade; i++) {
			resultado += vetor[i];
		}
		return resultado;
	}
	
	
	
	// Main teste 
	public static void main(String[] args) {
		Lista_Char_New lista = new Lista_Char_New(10);

		// Adicionando caracteres
		lista.adicionar('a');
		lista.adicionar('b');
		lista.adicionar('c');

		// Verificando se é palíndromo
		boolean ehPalindromo = lista.ehPalindromo();
		System.out.println("É palíndromo? " + ehPalindromo); // Deve imprimir "false"

		// Removendo um caractere
		lista.remover();

		// Concatenando e imprimindo a lista
		String concatenada = lista.concatenar();
		System.out.println("Lista concatenada: " + concatenada); // Deve imprimir "ab"

		// Adicionando mais caracteres
		lista.adicionar('b');
		lista.adicionar('a');

		// Verificando se é palíndromo novamente
		ehPalindromo = lista.ehPalindromo();
		System.out.println("É palíndromo? " + ehPalindromo); // Deve imprimir "true"
	}




	
}
