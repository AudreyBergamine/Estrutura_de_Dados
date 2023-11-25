package Lista.Exercícios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Vetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String alunos [] = new String[5];
		
		for (int i = 0; i < alunos.length; i++) {	
			alunos[i] = JOptionPane.showInputDialog("Digite o nome do aluno: " + i);
			
		}
		System.out.println("=============================\n\n\n");
		
		JOptionPane.showMessageDialog(null, "Nomes: \n");
		
		for (String i : alunos) {
			JOptionPane.showMessageDialog(null, i);
		}
		scan.close();
	}
}
