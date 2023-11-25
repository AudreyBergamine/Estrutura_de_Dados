package Matriz;

import javax.swing.JOptionPane;

/*
=================================================================================================================
 Faça uma matriz em Java 3x3 de números inteiros. Apresente a multiplicação da coluna A por B na coluna C
=================================================================================================================
 */

public class Matriz_Bi_Dim_Multiplicação {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        // Input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) { // Aqui eu pego o tamanho da linha -1 para que a coluna 3 fique sem nada
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da Matriz: [" + i + "][" + j + "]"));
                
                // Multiplicação da Coluna A pela column B e acrescentando na coluna C
                matrix[i][2] = matrix[i][0] * matrix[i][1]; // Aqui eu completo a coluna C com a mutiplicação de A por B
                
            }
        }
        // Mostrar a Matriz
        System.out.println("\nMatriz:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();     
        }
        System.out.println();  
    }
}
    


