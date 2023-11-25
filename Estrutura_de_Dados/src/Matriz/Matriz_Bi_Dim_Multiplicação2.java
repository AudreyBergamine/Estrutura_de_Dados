package Matriz;

import javax.swing.JOptionPane;

/*
=================================================================================================================
 Faça uma matriz em Java 3x3 que receba números inteiros. Apresente ao dobro dessa matriz
=================================================================================================================
 */

public class Matriz_Bi_Dim_Multiplicação2 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        // Input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { 
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da Matriz: \n" 
                                                                            + "Linha: [" + i + "]   Coluna: [" + j + "]"));
            }
        }
        // Mostrar a Matriz Digitada no terminal
        System.out.println("\nMatriz Digitada:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();

        }

        // Imprimir usando o JOptionPane
        StringBuilder inputMatrixStr = new StringBuilder("Matriz Digitada:\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                inputMatrixStr.append(matrix[i][j]).append("   |   ");
            }
            inputMatrixStr.append("\n");
        }
        JOptionPane.showMessageDialog(null, inputMatrixStr.toString());
        

        // Multiplicação (dobro de cada valor 3x3)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = matrix[i][j] * 2; 
            }
        }

        // Mostrar a Matriz Dobrada no terminal
        System.out.println("\nMatriz Dobrada:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();     
        }
        System.out.println();  

        // Mostrar a Matriz Dobrada usando JOptionPAne
        StringBuilder doubledMatrixStr = new StringBuilder("Matriz Dobrada:\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                doubledMatrixStr.append(matrix[i][j]).append("   |   ");
            }
            doubledMatrixStr.append("\n");
        }
        JOptionPane.showMessageDialog(null, doubledMatrixStr.toString());
    }
}
    


