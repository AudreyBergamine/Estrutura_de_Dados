package Laco_repeticao;

import javax.swing.JOptionPane;

public class While {

	public static void main(String[] args) {
		int var = -1;
		int total = 0;


		while(var != 0) {
			var=Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
			
			if (var % 2 == 0) {
				total += var;				
			}					
		}		
		JOptionPane.showMessageDialog(null, " Total das compras: R$ " + total );
	}
}
