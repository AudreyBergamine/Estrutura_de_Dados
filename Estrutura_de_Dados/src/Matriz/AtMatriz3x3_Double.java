package Matriz;

import javax.swing.JOptionPane;

public class AtMatriz3x3_Double {

	public static void main(String[] args) {

		double num[][] = new double[4][3]; 
		double mt [][] = new double [4][3];

		int i =0, j =0;


		for(i=0; i<4;i++) {
			for (j = 0; j<2; j++) {
				num[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o "+(j+1)+"° numero \n"));
				System.out.println("O "+(j+1)+"° numero " +num[i][j]+"\n");

			}
		}

		for(i=0; i<4;i++) {
			for (j = 2; j<3; j++) {
				mt[i][2] = (num[i][0]* num[i][1]) ;
				System.out.println("A multiplicação dos numeros : "+ mt[i][j]);
			}
		
		}
	}
}

