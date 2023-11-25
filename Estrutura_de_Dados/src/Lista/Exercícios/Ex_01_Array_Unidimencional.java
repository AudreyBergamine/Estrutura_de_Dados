package Lista.Exercícios;

import java.util.Scanner;

public class Ex_01_Array_Unidimencional {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int numeros[] = new int[6];
			int i = 0, soma = 0;
			
			
			for (i = 0; i < numeros.length; i++) {
				System.out.println("Digite um numero: ");
				numeros[i]= ler.nextInt();
				soma += numeros[i];	
				System.out.println(i);
				System.out.println("=================================\n\n");
			}
			System.out.println("A soma : " + soma);
			
			ler.close();
		}
	}
}