package Pilha.Pilha_Notas;

import java.util.Scanner;

public class Pilha_Notas_Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int qtdNotas;
        float notas;
    

        System.out.println("Insira a quantidade de notas: ");
        qtdNotas = ler.nextInt();
        
        
        Pilha_Notas pilha = new Pilha_Notas(qtdNotas);

        for (int i=0; i < qtdNotas; i++){
            System.out.println("Insira as notas ");
            notas = ler.nextFloat();
            pilha.empilha(notas);
        }

        System.out.println(pilha);		

    ler.close();
    }

}
