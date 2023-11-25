package Ex_Atividade_01;

//2) Desenvolva um programa em java que receba 5 números e apresente o dobro dos valores digitados

import javax.swing.JOptionPane;

public class At_01_Ex_02 {

	public static void main(String[] args) {
		int[] numeros = new int[5];

		// Recebendo valores dos usuários
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os 5 números: \n"
					+ "Número " + (i + 1) + ":"));

		}
		// Concatenação dos valores em Strings para imprimir
		String num_digitado_concatenado = "Valor digitado: \n";
		String dobro_String_Concatenado = "Dobro: \n";

		for (int i = 0; i < numeros.length; i++) {
			num_digitado_concatenado += numeros[i] + "\n";
			dobro_String_Concatenado += (numeros[i] * 2) + "\n";
		}

		JOptionPane.showMessageDialog(null, num_digitado_concatenado + "\n"
				+ dobro_String_Concatenado);
	}
}
