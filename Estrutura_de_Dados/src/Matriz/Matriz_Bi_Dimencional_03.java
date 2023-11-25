package Matriz;

import javax.swing.JOptionPane;

public class Matriz_Bi_Dimencional_03 {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		
		System.out.print("\n==== MATRIZ ===== \n");
		for(int linha=0; linha<matriz.length;linha++) {
			for(int coluna=0; coluna<matriz[linha].length-1;coluna++) {
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição [ " + linha + " ][ " + coluna + " ]: \n"));	
			}
			matriz[linha][2] = matriz[linha][0]*matriz[linha][1]; // coluna 3 = coluna 1 * coluana 2			
		}
		for(int linha=0; linha<matriz[0].length;linha++) {
			for(int coluna=0; coluna<matriz[linha].length;coluna++) {		
				System.out.print("|   " + matriz[linha][coluna]+"   |");
			}
			System.out.println("\n");
		}
	}
}