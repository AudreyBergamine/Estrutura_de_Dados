package Matriz;

import javax.swing.JOptionPane;

public class App2 {

	public static void main(String[] args) {
		int matriz[][] = new int[2][2];
		
		
		for(int linha=0; linha<matriz.length;linha++) {
			for(int coluna=0; coluna<matriz[linha].length;coluna++) {
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: " + linha + ", " + coluna));
			}			
		}
		for(int linha=0; linha<matriz[0].length;linha++) {
			for(int coluna=0; coluna<matriz[linha].length;coluna++) {
				System.out.print(matriz[linha][coluna]+" ");
			}
			System.out.println("");
		}
	}
}

