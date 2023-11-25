package Algoritmo_Ordenacao;

//Vídeo aula:									https://www.youtube.com/watch?v=hkBOn-665a8
//Documentação explicativa: 			https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/tutorial/
/*
 A ordenação por inserção coloca um valor no vetor na posição
correta. Podemos imaginar quando pegamos cartas de um monte
de baralho, vamos pegando e já colocando na ordem correta.
Divide o vetor em duas partes , a ordenada e não ordenada
 */

public class Insertion_Sort {
	
	void insertion_sort(int A[], int n) {
	    for (int i = 0; i < n; i++) {
	        // Armazenando o elemento atual, cujo lado esquerdo é verificado para encontrar a posição correta.
	        int temp = A[i];
	        int j = i;

	        // Verifica se o elemento adjacente no lado esquerdo é maior ou menor que o elemento atual.
	        while (j > 0 && temp < A[j - 1]) {
	            // Movendo o elemento do lado esquerdo uma posição adiante.
	            A[j] = A[j - 1];
	            j = j - 1;
	        }

	        // Movendo o elemento atual para a sua posição correta.
	        A[j] = temp;
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
