package Matriz;

import javax.swing.JOptionPane;

/*
===========================================================================================
 Capture do teclado valores para preenchimento de uma Matriz 3x3.
 Após a captura, imprima a Matriz criada
 Encontre a quantidade de números PARES e ÍMPARES

 Vídeo 16:48 >  https://www.youtube.com/watch?v=Cf4sv_9vENs 
===========================================================================================
 */

public class Matriz_Ex03 {
    public static void main(String[] args) {
        System.out.println("\n\n");
        
        int[][] numeros = new int[3][3];


        // PERCORRENDO A MATRIZ PARA O USUÁRIO PREENCHER A MATRIZ
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da posição: \n" 
                                                                                + "Linha:         [ " + i + " ]\n" 
                                                                                + "Coluna:      [ " + j + " ]"));            
            }
        System.out.println("\n\n");
        }
        
        // LOOP PARA EXIBIR A MATRIZ
        System.out.println("==================");
        System.out.println(" Matriz Digitada: ");
        System.out.println("==================");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println(); // Quebra de linha após cada linha da Matriz
        }        
        System.out.println("===================");
        System.out.println("\n\n");
        

        // LOOP PARA ENCONTRAR NÚMEROS PARES e ÍMPARES
        int qtd_Pares = 0;
        int qtd_Impares = 0;

        System.out.println("=====================================");
        System.out.println(" NÚMEROS PARES E ÍMPARES ");
        System.out.println("=====================================");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++){
                if ( numeros[i][j] % 2 == 0){
                    qtd_Pares++;
                } else {
                    qtd_Impares++;
                }
            }                                      
        }
        System.out.println("");

        System.out.println("Quantidade de números PARES:    " + qtd_Pares);
        System.out.println("Quantidade de números ÍMPARES:  " + qtd_Impares );
        System.out.println("=====================================");
        System.out.println("\n\n");
    }
}
