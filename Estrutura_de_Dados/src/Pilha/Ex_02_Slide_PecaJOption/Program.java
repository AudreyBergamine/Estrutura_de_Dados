package Pilha.Ex_02_Slide_PecaJOption;

import javax.swing.JOptionPane;

public class Program {
	public static void main(String[] args) {
        PìlhaString pilha = new PìlhaString(7);
        
        
        pilha.push("Peça 1");
        pilha.push("Peça 2");
        pilha.push("Peça 3");
        pilha.push("Peça 4");
        pilha.push("Peça 5");
        pilha.push("Peça 6");
        pilha.push("Peça 7");
        
        pilha.pecaDefeituosa("Peça 5");

        //JOptionPane.showMessageDialog(null, "Peça defeituosa removida: " + pilha.pecaDefeituosa("Peça 5"));
        JOptionPane.showMessageDialog(null, pilha);
    }
}