package Matriz;


import javax.swing.JOptionPane;

public class Matrix4x4 {

	public static void main(String[] args) {

		double notas[][] = new double[4][3];
		double media [][] = new double [4][3];

		int i =0, j =0;


		for(i=0; i<4;i++) {
			for (j = 0; j<2; j++) {
				notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a "+(j+1)+"° nota do "+(i+1)+" ° aluno:  "));
				System.out.println("A "+(j+1)+"° nota do "+(i+1)+" ° aluno:  "+notas[i][j]);



			}
		}

		for(i=0; i<4;i++) {
			for (j = 2; j<3; j++) {
				media[i][2] = (notas[i][0]+ notas[i][1]) /2;
				System.out.println("Media do "+(i+1) +"° aluno: "+ media[i][j]);
			}
		}

		// Caso media aprovado ou reprovado
		for(i=0; i<4;i++) {
			for (j = 2; j<3; j++) {

				if (media[i][2] >= 7.0) {
					System.out.println((i+1)+"° aluno* APROVADO com média: "+media[i][j] );
				} else {
					System.out.println((i+1)+ "° aluno* REPROVADO com média: "+media[i][j]);
				}
			}
		}
	}
}
