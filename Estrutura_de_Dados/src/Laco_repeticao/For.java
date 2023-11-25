package Laco_repeticao;

import javax.swing.JOptionPane;

public class For {

	public static void main(String[] args) {
		
		int n=Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			} 			
		}
	}
}
