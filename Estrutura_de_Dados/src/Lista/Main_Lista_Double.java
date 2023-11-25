package Lista;

public class Main_Lista_Double {
    public static void main(String[] args) {
        // Criando uma lista de números do tipo double
        Lista_Estatica<Double> lista = new Lista_Estatica<>();

        // Adicionando elementos à lista
        lista.adicionaFinal(3.14);
        lista.adicionaFinal(2.71);
        lista.adicionaFinal(1.61);
        lista.adicionaFinal(4.0);
        lista.adicionaFinal(2.0);

        System.out.println("Lista inicial: " + lista);

        // Testando os métodos
        System.out.println("Tamanho da lista: " + lista.obtemTamanho());

        lista.adicionaInicio(5.0);
        System.out.println("Lista após adicionar 5.0 no início: " + lista);

        lista.adicionaPosicao(3, 42.0);
        System.out.println("Lista após adicionar 42.0 na posição 3: " + lista);

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

