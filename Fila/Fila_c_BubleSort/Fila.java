package Fila.Fila_c_BubleSort;

import java.util.Random;

public class Fila<T> {
	
	int inicio;
	int fim;
	int tamanho;
	int qtdeElementos;
	T[] dados;
	
	@SuppressWarnings("unchecked")
	public Fila() {
		inicio = fim = -1;
		tamanho = 100;
		dados = (T[]) new Object[tamanho];
		qtdeElementos = 0;
	}
	
	public boolean estaVazia() {
		if(qtdeElementos == 0){
			return true;
		}
		return false;
	}
	
	public boolean estaCheia() {
		if(qtdeElementos == tamanho -1) {
			return true;
		}
		return false;
	}
	
	public void adicionar(T elemento) {
		if(!estaCheia()) {
			if(inicio == -1) {
				inicio = 0;
			}
			fim++;
			dados[fim]=elemento;
			qtdeElementos++;
		}
	}
	
	public void remover() {
		if(!estaVazia() ) {
			inicio++;
			qtdeElementos--;
		}
	}
	
	// Preencher a lista com números aleatórios
	@SuppressWarnings("unchecked")
	public void preencher_num_aleatorios() {
        Random rand = new Random();  // Crie uma instância da classe Random

        for (int i = 0; i <= 9; i++) {
            // Gere um número aleatório entre 1 e 100 (inclusive)
            int numeroAleatorio = rand.nextInt(100) + 1;
            dados[i] = (T) Integer.valueOf(numeroAleatorio); // Converta para o tipo T

            // Agora você tem um número aleatório entre 1 e 100 na sua lista.
        }

        // Mostrar o conteúdo do vetor
        for (int i = 0; i <= 9; i++) {
            System.out.print(this.dados[i] + "   ");
        }
    }
	
	private void bubble_SortString() {
        if (qtdeElementos <= 1) {
            // Não é necessário ordenar se houver 0 ou 1 elemento
            return;
        }

        for (int k = 0; k < qtdeElementos - 1; k++) {
            for (int i = 0; i < qtdeElementos - k - 1; i++) {
                T elemento1 = dados[i];
                T elemento2 = dados[i + 1];

                if (elemento1 instanceof Comparable && elemento2 instanceof Comparable) {
                    @SuppressWarnings("unchecked")
					Comparable<T> comparavel1 = (Comparable<T>) elemento1;
                    @SuppressWarnings({ "unchecked", "unused" })
					Comparable<T> comparavel2 = (Comparable<T>) elemento2;

                    if (comparavel1.compareTo(elemento2) > 0) {
                        // Troca os elementos
                        dados[i] = elemento2;
                        dados[i + 1] = elemento1;
                    }
                }
            }
        }
    }

    // Função mostrar para exibir os elementos na fila
    public void mostrar() {
        if (!estaVazia()) {
            bubble_SortString();
            String elementos = "";

            for (int i = inicio; i <= fim; i++) {
                elementos += dados[i] + " - ";
            }

            System.out.println(elementos);
        }
    }
    
    // Restante do código...
}