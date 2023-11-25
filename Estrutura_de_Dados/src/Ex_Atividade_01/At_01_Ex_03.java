package Ex_Atividade_01;

//3) Faca um programa que receba um vetor com 10 numeros e apresente quantos numeros pares foram digitados.

import javax.swing.JOptionPane;

public class At_01_Ex_03 {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		String pares = "";
		
		for (int i = 0; i< vetor.length; i++){
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número (" + (i + 1) + "/10): "));
			vetor[i] = num;
			
			if (num %2 == 0) {
				pares += num + "\n";
			} 
		}
		JOptionPane.showMessageDialog(null, "Números pares: \n" + pares);
	}
}
