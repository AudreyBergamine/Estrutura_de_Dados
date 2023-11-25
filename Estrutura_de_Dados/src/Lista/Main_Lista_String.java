package Lista;

public class Main_Lista_String {
    public static void main(String[] args) {
        // Criando uma lista de Strings
        Lista_Estatica<String> lista = new Lista_Estatica<>();

        // Adicionando elementos à lista
        lista.adicionaFinal("Maçã");
        lista.adicionaFinal("Banana");
        lista.adicionaFinal("Pera");
        lista.adicionaFinal("Uva");
        lista.adicionaFinal("Abacaxi");

        System.out.println("Lista inicial: " + lista);

        // Testando os métodos
        System.out.println("Tamanho da lista: " + lista.obtemTamanho());

        lista.adicionaInicio("Morango");
        System.out.println("Lista após adicionar 'Morango' no início: " + lista);

        lista.adicionaPosicao(3, "Laranja");
        System.out.println("Lista após adicionar 'Laranja' na posição 3: " + lista);
        
        // Deve imprimir "Elemento 'Banana' encontrado na posição 1"
        System.out.println(lista.procurarString("Banana"));

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
