package Lista.Exercícios;

//Crie um vetor com capacidade de 10 números inteiros, e mostre os números repetidos.

import javax.swing.JOptionPane;

public class Num_Repetidos {

	public static void main(String[] args) {
		int vetor[] = new int[10];

		String repetidos = "";

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número (" + (i + 1) + "/10):"));

		}
		for (int i = 0; i < vetor.length; i++) {
			if (i == (i+1)) {
				repetidos += i;
			}
		}
		System.out.println("Números repetidos -> " + repetidos);
	}
}
