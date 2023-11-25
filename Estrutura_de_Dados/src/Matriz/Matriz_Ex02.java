package Matriz;

import java.util.Random;

/*
===========================================================================================
 Gere e imprima uma Matriz 10x10 com valores aleatórios entre 0 e 9. Após isso indique
 - O maior  e o menor valor da linha 5
 - O maior  e o menor valor da coluna 7
 Vídeo 8:14 >  https://www.youtube.com/watch?v=Cf4sv_9vENs 
===========================================================================================
 */

public class Matriz_Ex02 {
    public static void main(String[] args) {
        int[][] numerosAleatorios = new int[10][10];
        Random numRandom = new Random();


        System.out.println("\n\n");
        
        // Loop para exibir a Matriz
        System.out.println("===========================================================================");
        System.out.println("                            Matriz Aleatória Inicial: ");
        System.out.println("===========================================================================");
        
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numRandom.nextInt(100);
                System.out.print(numerosAleatorios[i][j] + " \t");
            }
            System.out.println(); // Quebra de linha após cada linha de notas
        }        
        System.out.println("===========================================================================");
        System.out.println("\n\n");


        // Buscando o maior  e o menor número, especificamente na linha 5 (linha fixa)
        int maior_valor_linha5 = Integer.MIN_VALUE; // Função para pegar o MAIOR valor
        int menor_valor_linha5 = Integer.MAX_VALUE; // Função para pegar o MENOR valor
        int linha5 = 5;

        System.out.println("=========================================================");
        System.out.println("           Maior e Menor número da linha 5: ");
        System.out.println("=========================================================");
        for (int i = 0; i < numerosAleatorios[linha5].length; i++) {

            if (numerosAleatorios[linha5][i] > maior_valor_linha5) { // Se o número for maior que a armazenada na variárel...
                maior_valor_linha5 = numerosAleatorios[linha5][i];   // Ela pega o número atual e substitui na variável                                    
            }       
            if (numerosAleatorios[linha5][i] < menor_valor_linha5) { // Se o número for menor que a armazenada na variárel...
                menor_valor_linha5 = numerosAleatorios[linha5][i];   // Ela pega o número atual e substitui na variável                                       
            }                                   
        }
        System.out.println("");

        System.out.println("Maior valor da linha 5:    " + maior_valor_linha5);
        System.out.println("Menor valor da linha 5:    " + menor_valor_linha5);
        System.out.println("=========================================================");
        System.out.println("\n\n");


        
        // Buscando o maior  e o menor número, especificamente na coluna 7
        int maior_valor_coluna7 = Integer.MIN_VALUE; // Função para pegar o MAIOR valor
        int menor_valor_coluna7 = Integer.MAX_VALUE; // Função para pegar o MENOR valor
        int coluna7 = 7;

        System.out.println("=========================================================");
        System.out.println("          Maior e Menor número da coluna 7: ");
        System.out.println("=========================================================");
        for (int i = 0; i < numerosAleatorios.length; i++){
            if (numerosAleatorios[i][coluna7] > maior_valor_coluna7){
                maior_valor_coluna7 = numerosAleatorios[i][coluna7];
            }
            if (numerosAleatorios[i][coluna7] < menor_valor_coluna7){
                menor_valor_coluna7 = numerosAleatorios[i][coluna7];
            }

        }
        System.out.println("Maior valor da coluna 7:    " + maior_valor_coluna7);
        System.out.println("Menor valor da coluna 7:    " + menor_valor_coluna7);
        System.out.println("=========================================================");
        System.out.println("\n\n");



    }
}
