package Matriz;


import javax.swing.JOptionPane;

public class Matrix4x3Mode2 {

	public static void main(String[] args) {

		double notas [][] = new double [4][3];
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
		StringBuilder sb = new StringBuilder();
		for (i = 0; i < 4; i++) {
			
			sb.append("Aluno " + (i+1) + ": " + notas[i][0] + "/ " + notas[i][1] + "/ " + media[i][2] + "\n\n");
		}

		// Mostrando a string com as notas e a média de cada aluno usando JOptionPane
		JOptionPane.showMessageDialog(null, sb.toString(), "Notas dos alunos", JOptionPane.PLAIN_MESSAGE);

		//for(i=0; i<4;i++) {
			//for (j = 0; j<3; j++) {
							
				//JOptionPane.showMessageDialog(null, "A "+(i+1)+"° nota do "+(i+1)+" ° aluno:  "+notas[i][j]+ "\n"+"Media do "+(i+1) +"° aluno: "+ media[i][j], null, j);
								
				//}
			
		}

}
