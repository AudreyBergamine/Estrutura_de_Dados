package Laco_repeticao;

import javax.swing.JOptionPane;

public class Do_while {

	public static void main(String[] args) {
		int n = 1;
		
		do {
			n=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 ou 0: "));
			
		} while(n != 0 && n != 1); 
		
	}
}

