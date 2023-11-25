package Lista.Exercícios;

import javax.swing.JOptionPane;

public class Ex_03 {

	public static void main(String[] args) {
		int notas[] = new int [10];
		int num = 0; 
		int soma = 0;
		int media = 0;
		int notaMaior = 0;
		int notaMenor = 11;
			
		
		for (int i = 0; i < notas.length; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nota: "));
			notas[i] = num;
			soma += num;	
		}
		// MÉDIA DA SALA
		media = soma / notas.length;
				
		// NOTA + ALTA
		for (int i = 0; i < notas.length; i++) {
			if (notas[i]>notaMaior ) {
				notaMaior = notas[i];
			}			
		}		
		// NOTA + BAIXA
		for (int i = 0; i < notas.length; i++) {
			if (notas[i]<notaMenor ) {
				notaMenor = notas[i];
			}
		}
		JOptionPane.showMessageDialog(null, "Media: " + media + "\nNota Maior: " + notaMaior+ "\nNota Menor: " + notaMenor);
	}
}
