package Matriz;

import javax.swing.JOptionPane;

public class Matriz_Bi_Dimencional_02 {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		
		System.out.print("\n=========== MATRIZ DIGITADA =========== \n");
		for(int linha=0; linha<matriz.length;linha++) {
			for(int coluna=0; coluna<matriz[linha].length;coluna++) {
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição [ " + linha + " ][ " + coluna + " ]: \n"));
				System.out.print("| " + matriz[linha][coluna]+ " |");
			}
			System.out.print(" \n");
		}
		
		System.out.print("\n=========== MATRIZ DOBRADA =========== \n");
		for(int linha=0; linha<matriz[0].length;linha++) {
			for(int coluna=0; coluna<matriz[linha].length;coluna++) {
				System.out.print("| " + matriz[linha][coluna]*2 + " |");
			}
			System.out.println("");
		}
	}
}
