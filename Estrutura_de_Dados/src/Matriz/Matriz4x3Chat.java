package Matriz;

import javax.swing.JOptionPane;

public class Matriz4x3Chat {
	public static void main(String[] args) {
		double[][] matrizNotas1 = new double[4][3];
		double[][] matrizNotas2 = new double[4][3];
		double[][] matrizMedia = new double[4][3];

		// Pedindo notas de provas para cada aluno usando JOptionPane
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				String nota1 = JOptionPane.showInputDialog("Digite a nota da prova " + (j+1) + " do aluno " + (i+1) + " na matriz 1:");
				matrizNotas1[i][j] = Double.parseDouble(nota1);

				String nota2 = JOptionPane.showInputDialog("Digite a nota da prova " + (j+1) + " do aluno " + (i+1) + " na matriz 2:");
				matrizNotas2[i][j] = Double.parseDouble(nota2);

				matrizMedia[i][j] = (matrizNotas1[i][j] + matrizNotas2[i][j]) / 2.0; // calculando a média das notas
			}
			matrizMedia[i][2] = (matrizMedia[i][0] + matrizMedia[i][1]) / 2.0; // calculando a média final
		}

		// Criando uma string com as notas e a média de cada aluno
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			sb.append("Aluno " + (i+1) + ": " + matrizNotas1[i][0] + ", " + matrizNotas1[i][1] + ", " + matrizMedia[i][0] + "\n");
			sb.append("Aluno " + (i+1) + ": " + matrizNotas2[i][0] + ", " + matrizNotas2[i][1] + ", " + matrizMedia[i][1] + "\n");
			sb.append("Aluno " + (i+1) + ": " + matrizMedia[i][0] + ", " + matrizMedia[i][1] + ", " + matrizMedia[i][2] + "\n\n");
		}

		// Mostrando a string com as notas e a média de cada aluno usando JOptionPane
		JOptionPane.showMessageDialog(null, sb.toString(), "Notas dos alunos", JOptionPane.PLAIN_MESSAGE);
	}
}

