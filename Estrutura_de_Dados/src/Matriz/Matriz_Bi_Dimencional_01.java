package Matriz;

import javax.swing.JOptionPane;

public class Matriz_Bi_Dimencional_01 {

	public static void main(String[] args) {
		int matriz[][] = new int[2][2];
		
		
		for(int linha=0; linha<matriz.length;linha++) {
			for(int coluna=0; coluna<matriz[linha].length;coluna++) {
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição [ " + linha + " ][ " + coluna + " ]: \n"));
			}			
		}
		for(int linha=0; linha<matriz[0].length;linha++) {
			for(int coluna=0; coluna<matriz[linha].length;coluna++) {
				System.out.print("| " + matriz[linha][coluna]+" |"); 
			}
			System.out.println("");
		}
	}
}