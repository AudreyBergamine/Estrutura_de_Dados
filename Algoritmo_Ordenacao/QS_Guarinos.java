package Algoritmo_Ordenacao;

// Quick Sort é um tipo de Árvore 
// Complexidade é:    n(log n)    > vai dividindo por 2 até não dar mais
// QUICK CORT
public class QS_Guarinos {

	public static void main(String[] args) {
		int [] vetor = new int[10];
		
		// Teste de tempo
//		long inicio = System.currentTimeMillis();

		
		System.out.println("VETOR ORIGINAL: \n");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.floor(Math.random() * vetor.length)) ;
			System.out.print(vetor[i] + "    ");
		}
		System.out.println("\n");
		
		
		
		// ORDENAÇÃO  - QUICK SORT
		quicksort(vetor, 0, vetor.length - 1);

		
		
		
		// Contar o tempo que demorou:
//		long fim = System.currentTimeMillis();
//		System.out.println("Tempo: " + (fim - inicio) + " mili segundos \n");
	
		
		System.out.println("VETOR ORNADO: \n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "    ");
		}
		System.out.println("\n");
		
		

	}
	public static void quicksort(int[] vetor, int esquerda, int direita) {
		if (esquerda < direita) {
			int p = particao(vetor, esquerda, direita);
			quicksort(vetor, esquerda, p);
			quicksort(vetor, p + 1, direita);
		}
	}
	
	public static int particao(int[] vetor, int esquerda, int direita) {
		int meio = (int) (esquerda + direita) / 2;
		int pivot = vetor[meio];
		int i = esquerda -1;
		int j = direita + 1;
		
		while(true){			
			// Faça isso 
			do { 
				i++;
			} while(vetor[i] < pivot ) ; // Enquanto isso
			
			// Faça isso 
			do {
				j--;
			} while (vetor[j]> pivot ); // Enquanto isso
			
			// Se passou por todos os números... 
			if (i >= j) {
				return j;
			} 			
			// Realiza a Troca
			int aux = vetor[i];
			vetor[i] = vetor[j]; 
			vetor[j] = aux;			
			}
				
				
		
	
	}
}
