package Lista;


public class Main_Lista_Inteiros {
    public static void main(String[] args) {
        // Criando uma lista de inteiros
        Lista_Estatica<Integer> lista = new Lista_Estatica<>();

        // Adicionando elementos à lista
        for (int i = 1; i <= 10; i++) {
            lista.adicionaFinal(i);
        }

        System.out.println("Lista inicial: " + lista);

        // Testando os métodos
        System.out.println("Tamanho da lista: " + lista.obtemTamanho());

        lista.adicionaInicio(0);
        System.out.println("Lista após adicionar 0 no início: " + lista);

        lista.adicionaPosicao(5, 99);
        System.out.println("Lista após adicionar 99 na posição 5: " + lista);

        System.out.println(lista.procurarInteiro(9)); 

        lista.removeInicio();
        System.out.println("Lista após remover o primeiro elemento: " + lista);

        lista.removeFinal();
        System.out.println("Lista após remover o último elemento: " + lista);

        lista.removePosicao(3);
        System.out.println("Lista após remover o elemento na posição 3: " + lista);

        System.out.println("Primeiro elemento da lista: " + lista.obtemPrimeiro());
        System.out.println("Último elemento da lista: " + lista.obtemUltimo());

        // Verificando se a lista está vazia
        System.out.println("A lista está vazia? " + lista.estaVazia());

        // Verificando se a lista está cheia
        System.out.println("A lista está cheia? " + lista.estaCheia());
    }
}
