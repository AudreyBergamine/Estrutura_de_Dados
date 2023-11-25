package Lista.Exercícios;

import javax.swing.JOptionPane;

public class Ex_02 {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		int num = 0;

		for (int i = 0; i <vetor.length; i++) {
			if (i % 2 == 0) {
				num = Integer.parseInt(JOptionPane.showInputDialog("Index: " + i + "\nDigite um número PAR: "));
				vetor[i]= num; 
				while (num % 2 != 0) {
					num = Integer.parseInt(JOptionPane.showInputDialog("Index: " + i + "\nNão é  um numero PAR, digite novamente: "));
				}
			} if (i % 2 != 0) {

				num = Integer.parseInt(JOptionPane.showInputDialog("Index: " + i + "\nDigite um número ÍMPAR: "));
				vetor[i]= num;

				while (num % 2 == 0) {
					num = Integer.parseInt(JOptionPane.showInputDialog("Index: " + i + "\nNãoo é um número �ÍMPAR, digite novamente: "));
				}
			}
		}

		String list = "";
		for (int i2 : vetor) {
			list += i2 + ", ";			
		}
		JOptionPane.showMessageDialog(null, list);
	}
}








