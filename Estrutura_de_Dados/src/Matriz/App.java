package Matriz;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		int vetorR[] = new int[10];
		int posRep = 0;
		boolean add = false;
		String repetidos = "";

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero natural (" + (i + 1) + "/10):"));
			vetorR[i] = -1;
		}

		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (vetor[i] == vetor[j]) {
					for (int k = 0; k <= posRep; k++) {
						if (!(vetor[i] == vetor[k])) {
							add = true;
						}

					}
				}
			}
			if (add) {
				vetorR[posRep] = vetor[i];
				posRep++;
				add = false;
			}
		}
		
		for (int i : vetorR) {
			if(i!=-1) {
				repetidos+=i+"\n";
			}
		}
		
		System.out.println("Números repetidos -> " + repetidos);

	}

}
