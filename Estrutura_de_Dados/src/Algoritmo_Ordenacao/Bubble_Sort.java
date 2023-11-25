package Algoritmo_Ordenacao;


// Vídeo aula (Bubble Sort Int):				https://www.youtube.com/watch?v=jt_Mse8HXR8
// Vídeo aula (Bubble Sort String):			https://www.youtube.com/watch?v=Zlunldtkuic        ou        https://www.youtube.com/watch?v=j1ATGus8a2I      
// Documentação explicativa: 					https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/

// Bubble Sort String ( Já fiz um código em Fila)

public class Bubble_Sort { // Pra cada posição i, ele passa o j pelo vetor inteiro, repetidamente
	
	
	// MÉTODO
	public static void bubbleSortInt(int[] vetor) { // Recebe um vetor
		int n = vetor.length;
		int aux;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {     // se o valor na posição j for maior que o valor na posição j +1
					// Realiza a troca de posições
					aux = vetor[j];						// guarda o valor j na variavel auxiliar
					vetor[j] = vetor[j + 1];			// Pega o valor de j+1 e coloca na posição j
					vetor[j + 1] = aux;					// Pega o valor da variavel auxiliar (antigo j) e coloca na posição j+1
				}
			}
		}
	}

	public static void main(String[] args) {
		// Vetor que o usuário cria: 
//		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor:"));
//        int[] vetor = new int[tamanho];
//
//        for (int i = 0; i < tamanho; i++) {
//            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para a posição " + i + ":"));
//            vetor[i] = numero;
//        }
//		
		// Vetor pré preenchido
		int[] vetor = {64, 34, 25, 12, 22, 11, 90};

		System.out.println("======================  VETOR ORIGINAL ======================");
		System.out.print("|     ");
		for (int num : vetor) {
			System.out.print(num + "     |     ");
		}

		bubbleSortInt(vetor);

		System.out.println("\n\n\n=====================   VETOR ORDENADO ======================");
		System.out.print("|     ");
		for (int num : vetor) {
			System.out.print(num + "     |     ");
		}
	}
	
	
	
	
	


//int [] vetor = new int[10];

// Criando números aleatórios
//System.out.println("========== VETOR ALEATÓRIO ==============");
//for (int i = 0; i < vetor.length; i++) {
//	vetor[i] = (int) (Math.random() * vetor.length);
//	System.out.println(vetor[i]);			
//}

	

// BUBLE SORT
//int aux ;														
//for (int i = 0; i < vetor.length; i++) {					
//		for (int j = i + 1; j < vetor.length; j++) {			
//				if ( vetor[i] > vetor[j] ) {
//					aux = vetor[j]; 				
//					vetor[j] = vetor[i];		
//					vetor[i] = aux; 				
//		}
//	}
//}
//System.out.println("\n\n========== VETOR ORDENADO ==============");
//for (int i = 0; i < vetor.length; i++) {
//	vetor[i] = (int) (Math.random() * vetor.length);
//	System.out.println(vetor[i]);			
//}
//
//}





}
