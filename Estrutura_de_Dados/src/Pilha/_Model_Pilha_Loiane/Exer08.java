package Pilha._Model_Pilha_Loiane;

//import java.util.Stack;

// DESAFIO TORRE DE HANOI
// Desenvolva um algoritmo que resolva o quebra cabeça Torre de Hanoi ( Problema Matemático) 
// ALGORITMO RECURSIVO COMO ÁRVORES

public class Exer08 {

public static void main(String[] args) {
        
        PilhaHanoi<Integer> original = new PilhaHanoi<>();		// Torre 1 - Torre da Esquerda
        PilhaHanoi<Integer> dest = new PilhaHanoi<>(); 			// Torre 2 - Torre do Meio
        PilhaHanoi<Integer> aux = new PilhaHanoi<>(); 			// Torre 3 - Torre da Direita

        //original.empilha(8);
        //original.empilha(7);
        //original.empilha(6);
        //original.empilha(5);
        //original.empilha(4);
        original.empilha(3);
        original.empilha(2);
        original.empilha(1);
        
        torreDeHanoi(original.tamanho(), original, dest, aux);
    }

    public static void torreDeHanoi(int n, PilhaHanoi<Integer> original, 
            PilhaHanoi<Integer> dest, PilhaHanoi<Integer> aux){
        
        if (n > 0){
            torreDeHanoi(n-1, original, aux, dest);
            dest.empilha(original.desempilha());
            System.out.println("------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + dest);
            System.out.println("Aux: " + aux);
            torreDeHanoi(n-1, aux, dest, original);
        }
    }
}


//public static void main(String[] args) {
//	
//	Stack<Integer> original = new Stack<>();
//	Stack<Integer> dest = new Stack<>();
//	Stack<Integer> aux = new Stack<>();
//
//	original.push(3);
//	original.push(2);
//	original.push(1);
//	
//	torreDeHanoi(original.size(), original, dest, aux);
//}
//
//public static void torreDeHanoi(int n, Stack<Integer> original, 
//		Stack<Integer> dest, Stack<Integer> aux){
//	
//	if (n > 0){
//		torreDeHanoi(n-1, original, aux, dest);
//		dest.push(original.pop());
//		System.out.println("------");
//		System.out.println("Original: " + original);
//		System.out.println("Destino: " + dest);
//		System.out.println("Aux: " + aux);
//		torreDeHanoi(n-1, aux, dest, original);
//	}
//	
//}