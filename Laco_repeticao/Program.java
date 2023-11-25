package Laco_repeticao;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		
		JOptionPane.showMessageDialog(null, "Bem vindo!!!");
		
				
		int n1, n2, n3;
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("Digite a 1a  idade (n1): "));
		
		n2=Integer.parseInt(JOptionPane.showInputDialog("Digite a 2a  idade (n2): "));
		
		n3=Integer.parseInt(JOptionPane.showInputDialog("Digite a 3a  idade (n3): "));
		
		if (n1 > n2 && n1 > n3) {
			JOptionPane.showMessageDialog(null, " Idade maior: n1  " + n1 );
			
		} else if (n2 > n1 && n2 > n3) {
			JOptionPane.showMessageDialog(null, " Idade maior: n2  " + n2 );
			
		} else if (n3 > n1 && n3 > n2) {
			JOptionPane.showMessageDialog(null, " Idade maior: n3  " + n3 );

		}else {
			JOptionPane.showMessageDialog(null, " Possivelmente idades iguais, não feito a validado " );
						
		}		
	}		
}


