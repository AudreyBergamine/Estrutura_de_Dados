package Matriz;

import java.util.Random;

/*
===========================================================================================
 Gere e imprima uma Matriz 4x4 com valores aleatórios entre 0 e 9. Após isso determine
 o maior número da matriz e sua posição linha x coluna.
===========================================================================================
 */

public class Matriz_Ex01_NumAleatorios {
    public static void main(String[] args) {
        int[][] numerosAleatorios = new int[4][4];
        Random numRandom = new Random();


        System.out.println("\n\n");
        
        // Loop para exibir a Matriz
        System.out.println("=========================================================");
        System.out.println("                Matriz Aleatória Inicial: ");
        System.out.println("=========================================================");
        
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numRandom.nextInt(100);
                System.out.print(numerosAleatorios[i][j] + " \t\t");
            }
            System.out.println(); // Quebra de linha após cada linha de notas
        }        
        System.out.println("=========================================================");


        int numero_Maior = Integer.MIN_VALUE; // Função para pegar o MAIOR valor
        int linha = 0;
        int coluna = 0;

        // Buscando o maior número
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (numerosAleatorios[i][j] > numero_Maior) { // Se o número for maior que a armazenada na variárel...
                    numero_Maior = numerosAleatorios[i][j];   // Ela pega o número atual e substitui na variável
                    linha = i;
                    coluna = j;                    
                }             
            }               
        }
        System.out.println("");

        System.out.println("Maior valor:    " + numero_Maior);
        System.out.println("Linha:          " + linha);
        System.out.println("Coluna:         " + coluna);
        System.out.println("\n\n");

    }
}

