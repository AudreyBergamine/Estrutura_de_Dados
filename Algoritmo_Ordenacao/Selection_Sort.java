package Algoritmo_Ordenacao;

//Vídeo aula:								https://www.youtube.com/watch?v=5SccjA4afcM
//Documentação explicativa: 		https://www.hackerearth.com/practice/algorithms/sorting/selection-sort/tutorial/	

public class Selection_Sort {
	void selection_sort(int A[], int n) {
	    // Variável temporária para armazenar a posição do elemento mínimo
	    int minimo;

	    // Reduz o tamanho efetivo do array em uma unidade a cada iteração
	    for (int i = 0; i < n - 1; i++) {
	        // Supomos que o primeiro elemento seja o mínimo do array não ordenado
	        minimo = i;

	        // Determina o tamanho efetivo do array não ordenado
	        for (int j = i + 1; j < n; j++) {
	            if (A[j] < A[minimo]) {
	                // Encontra o elemento mínimo
	                minimo = j;
	            }
	        }

	        // Coloca o elemento mínimo em sua posição correta
	        int temp = A[minimo];
	        A[minimo] = A[i];
	        A[i] = temp;
	    }
	}



	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
