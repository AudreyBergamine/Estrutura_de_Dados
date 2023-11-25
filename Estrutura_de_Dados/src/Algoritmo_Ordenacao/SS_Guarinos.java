package Algoritmo_Ordenacao;

// Complexidade é:  
// SELECTION SORT
public class SS_Guarinos {

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
		
		
		// ORDENAÇÃO  - SELECTION SORT
		int posicao_menor, aux;
		for (int i = 0; i < vetor.length; i++) {
			posicao_menor = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[posicao_menor] ) {
					posicao_menor = j;
				}
			}
			aux = vetor[posicao_menor];
			vetor[posicao_menor] = vetor[i];
			vetor[i] = aux; 		
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
