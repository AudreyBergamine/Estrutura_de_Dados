package Algoritmo_Ordenacao;

// Complexidade é:    O(n2)  (n ao quadrado)
// ORDENAÇÃO  - HEAP SORT
public class HS_Guarinos {

	public static void main(String[] args) {
		int [] vetor = new int[10];
		
		// Teste de tempo
		long inicio = System.currentTimeMillis();

		
		System.out.println("VETOR ORIGINAL: \n");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]= (int) (Math.random() * vetor.length);
			System.out.print(vetor[i] + "    ");
		}
		System.out.println("\n");

		
		
		
		// ORDENAÇÃO  - HEAP SORT
		int n = vetor.length;
		
		for (int i = n / 2 -1; i >= 0; i--) {
			aplicarHeap(vetor, n, i);
			
		}
		
		// Contar o tempo que demorou:
		long fim = System.currentTimeMillis();
		System.out.println("Tempo: " + (fim - inicio) + " mili segundos \n");
		
		
		System.out.println("VETOR QUASE ORNADO: \n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "    ");
		}
		System.out.println("\n");
		
		
		// 2a parte da ordenação:
		for (int j = n-1; j > 0; j--) {
			int aux = vetor[0];
			vetor[0] = vetor[j];
			vetor[j] = aux;
			
			aplicarHeap(vetor, j, 0);
		}
		
		
		
		
		System.out.println("VETOR ORNADO: \n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "    ");
		}
		System.out.println("\n");
		
		

	}
	
	
	
	private static void aplicarHeap(int[] vetor, int n, int i) {
		int raiz = i;
		int esquerda = 2 * i + 1;
		int direita = 2 * i + 2;
		
		if (esquerda < n && vetor[esquerda] > vetor[raiz]) {
			raiz = esquerda;
		} 
		if (direita < n && vetor[direita] > vetor[raiz]) {
			raiz = direita;
		}
		if (raiz != i) {
			int aux = vetor[i];
			vetor[i] = vetor[raiz];
			vetor[raiz] = aux;
			
			aplicarHeap(vetor, n, raiz);
		}
		
		
	}
}
