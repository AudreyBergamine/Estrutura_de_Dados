package Algoritmo_Ordenacao;

// Complexidade é:    O(n2)  (n ao quadrado)
public class BS_Guarinos {

	public static void main(String[] args) {
		int [] vetor = new int[10000];
		
		// Teste de tempo
		long inicio = System.currentTimeMillis();

		
//		System.out.println("VETOR ORIGINAL: \n");
//		for (int i = 0; i < vetor.length; i++) {
//			vetor[i]= (int) (Math.random() * vetor.length);
//			System.out.println(vetor[i]);
//		}
//		System.out.println("\n");
		
		
		
		// ORDENAÇÃO  - BUBBLE SORT
		int aux;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) { // Compara todos esses valores com o mesmo i
				if (vetor[i] > vetor[j] ) {
					aux = vetor[j];
					vetor[j]= vetor[i]; 
					vetor[i]= aux;
				} 				
			}			
		}
		// Contar o tempo que demorou:
		long fim = System.currentTimeMillis();
		System.out.println("Tempo: " + (fim - inicio) + " mili segundos \n");
		
		
//		System.out.println("VETOR ORNADO: \n");
//		for (int i = 0; i < vetor.length; i++) {
//			System.out.println(vetor[i]);
//		}
		
		

	}
}
