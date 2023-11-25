package Algoritmo_Ordenacao;

// Complexidade é:     
public class IS_Guarinos {

	public static void main(String[] args) {
		int [] vetor = new int[10];
		
		// Teste de tempo
		long inicio = System.currentTimeMillis();

		// Preenchendo o vetor
		System.out.println("VETOR ORIGINAL: \n");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]= (int) (Math.random() * vetor.length);
			System.out.println(vetor[i]);
		}
		System.out.println("\n");
		
		
		
		// ORDENAÇÃO  - INSERTION SORT
		int aux, j;
		for (int i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i -1;
			
			while (j >= 0 && vetor[j] > aux) {
				vetor[j + 1] = vetor[j]; 
				j--;
			}
			vetor[j + 1] = aux;
		} 	
		// Contar o tempo que demorou:
		long fim = System.currentTimeMillis();
		System.out.println("Tempo: " + (fim - inicio) + " mili segundos \n");
		
		
		System.out.println("VETOR ORNADO: \n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		

	}
}
