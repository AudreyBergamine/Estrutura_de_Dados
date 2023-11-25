package Pilha.Ativ_Pilha_Ex_03;

import javax.swing.JOptionPane;

public class Program_Main {

	public static void main(String[] args) {
		
		Pilha_Int pilhaPar = new Pilha_Int(10);
		Pilha_Int pilhaImpar = new Pilha_Int(10);
			
		// Preenchendo a pilha
		int i = 1;
        while (i <= 10) {
        	int elemento = Integer.parseInt(JOptionPane.showInputDialog("Insira o número " + (i) + " de 10: ")); 
        	        	
        	if (elemento % 2 == 0) { // Se o número for PAR empilhe na pilha PAR
        		pilhaPar.empilhar(elemento);
        		JOptionPane.showMessageDialog(null, "Elemento empilhado na pilha PAR!");
        							
			} else { // Se for ÍMPAR, empilha na pilha ÍMPAR
				pilhaImpar.empilhar(elemento);
				JOptionPane.showMessageDialog(null, "Elemento empilhado na pilha ÍMPAR!");
			}
        	i++;        	 
        }
        JOptionPane.showMessageDialog(null, "Pilha PAR: \n" + pilhaPar.toString()
        							+"\n\nPilha ÍMPAR: \n" + pilhaImpar.toString());        
	}
}