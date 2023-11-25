package Algoritmo_Ordenacao;

//Vídeo aula:									https://www.youtube.com/watch?v=BW2qE_7HNG8
//Documentação explicativa: 			https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/tutorial/

public class Quick_Sort {
	
	int partition(int A[], int start, int end) {
	    int i = start + 1;
	    int piv = A[start]; // Torna o primeiro elemento como o elemento pivô.
	    for (int j = start + 1; j <= end; j++) {
	        // Rearranja o array colocando elementos menores que o pivô de um lado e maiores do outro.
	        if (A[j] < piv) {
	            // Troca os elementos.
	            int temp = A[i];
	            A[i] = A[j];
	            A[j] = temp;
	            i += 1;
	        }
	    }
	    // Coloca o elemento pivô em sua posição apropriada.
	    int temp = A[start];
	    A[start] = A[i - 1];
	    A[i - 1] = temp;
	    return i - 1; // Retorna a posição do pivô.
	}

	void quick_sort(int A[], int start, int end) {
	    if (start < end) {
	        // Armazena a posição do elemento pivô.
	        int piv_pos = partition(A, start, end);
	        // Ordena o lado esquerdo do pivô.
	        quick_sort(A, start, piv_pos - 1);
	        // Ordena o lado direito do pivô.
	        quick_sort(A, piv_pos + 1, end);
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


