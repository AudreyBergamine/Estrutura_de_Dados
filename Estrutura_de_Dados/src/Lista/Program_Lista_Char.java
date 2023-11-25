package Lista;

public class Program_Lista_Char {

	public static void main(String[] args) {
		// Criando uma lista de caracteres (char)
        Lista_Estatica<Character> lista = new Lista_Estatica<>();

        // Adicionando elementos à lista
        lista.adicionaFinal('A');
        lista.adicionaFinal('B');
        lista.adicionaFinal('C');
        lista.adicionaFinal('D');
        lista.adicionaFinal('E');

        System.out.println("Lista inicial: " + lista);

        // Testando os métodos
        System.out.println("Tamanho da lista: " + lista.obtemTamanho());

        lista.adicionaInicio('Z');
        System.out.println("Lista após adicionar 'Z' no início: " + lista);

        lista.adicionaPosicao(3, 'X');
        System.out.println("Lista após adicionar 'X' na posição 3: " + lista);

        lista.removeInicio();
        System.out.println("Lista após remover o primeiro elemento: " + lista);

        lista.removeFinal();
        System.out.println("Lista após remover o último elemento: " + lista);

        lista.removePosicao(2);
        System.out.println("Lista após remover o elemento na posição 2: " + lista);

        System.out.println("Primeiro elemento da lista: " + lista.obtemPrimeiro());
        System.out.println("Último elemento da lista: " + lista.obtemUltimo());

        // Verificando se a lista está vazia
        System.out.println("A lista está vazia? " + lista.estaVazia());

        // Verificando se a lista está cheia
        System.out.println("A lista está cheia? " + lista.estaCheia());

	}

}
