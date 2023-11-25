package Pilha.Ativ_Pilha_Ex_01;

import javax.swing.JOptionPane;

public class Program_Main {

	public static void main(String[] args) {
		
		Pilha_Peca pilha = new Pilha_Peca(10);
		
		// Preenchendo a pilha
		int i = 1;
        while (i <= pilha.getTamanho()) {
			String peca = JOptionPane.showInputDialog("Insira a peça nº " + (i) + "/10: ");
            if (pilha.push(peca) == true) {
            	i++;
            }
        }        
        JOptionPane.showMessageDialog(null, "Tamanho da Pilha: " + pilha.getTamanho() + "\n" + pilha.toString());
        
        //	if (pilha.getPilha()[i] == null ) { // "\0"       
	}
}
