package Matriz;

import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class tabela_ord_by_col {

	public static void main(String[] args) {
		float produtos[][] = new float[3][3];
		
		/*
		 Indice			Preços			Qtd
		 	1				5.2				 5
		 	2				6.2				 1
		 	3				2.3				 3
		 
		 */

		System.out.print("\n====== MATRIZ DIGITADA ====== \n");
		for(int linha=0; linha<produtos.length;linha++) {
			for(int coluna=0; coluna<produtos[linha].length;coluna++) {
				produtos[0][0] = 0;
				produtos[0][1] = (float) 5.2;
				produtos[0][2] = 5;
				
				produtos[1][0] = 1;
				produtos[1][1] = (float) 6.2;
				produtos[1][2] = 1;
				
				produtos[2][0] = 2;
				produtos[2][1] = (float) 2.3;
				produtos[2][2] = 3;
				
				//produtos[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição [ " + linha + " ][ " + coluna + " ]: \n"));
				
				System.out.print("|   " + produtos[linha][coluna]+ "   |");
			}
			System.out.print(" \n");
		}
		
		
		
		System.out.print("\n==== TABELA ORGANIZADA POR INDICE ==== \n");
		for(int linha = 0; linha < 3; linha++) {				
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.printf(" |     " + produtos[linha][coluna] + "     | ");
			}
			System.out.println("");
		}
		
		
		System.out.print("\n==== TABELA ORGANIZADA POR PREÇOS ==== \n");
		for(int linha = 0; linha < 3; linha++) {	
			int indice_menor = linha;
			
			for(int i = linha; i < 3; i++) {
				if(produtos[1][i] <  produtos[1][indice_menor]) {
					indice_menor = i;
				} // end if
			} // end for
			for (int j = 0; j < 3; j++) {
				float troca = produtos[j][linha];
				
				// Invertendo as posições
				produtos[j][linha] = produtos[j][indice_menor];
				produtos[j][indice_menor] = troca;
				
			System.out.printf(" |     " + produtos[linha][j] + "     | ");
			}
			System.out.println("");
		}
	}
}
