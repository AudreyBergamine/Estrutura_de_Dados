package Pilha.Ex_01_Slide_Peca;

import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args) {
        Pilha pilhaDePecas = new Pilha();
        
        // Inicializa a pilha com algumas peças na ordem correta
        pilhaDePecas.Empilhar("p1");
        pilhaDePecas.Empilhar("p2");
        pilhaDePecas.Empilhar("p3");
        pilhaDePecas.Empilhar("p4");
        pilhaDePecas.Empilhar("p5");
        pilhaDePecas.Empilhar("defeituosa");
        pilhaDePecas.Empilhar("p7");
        pilhaDePecas.Empilhar("p8");
        pilhaDePecas.Empilhar("p9");
        pilhaDePecas.Empilhar("p10");
        
        
        JOptionPane.showMessageDialog(null, "Pilha de peças atual: \n" + pilhaDePecas + "\n\n" );
        //System.out.println("Pilha de peças atual: \n" + pilhaDePecas + "\n\n" );

        Pilha.substituirDefeituosa(pilhaDePecas);

        JOptionPane.showMessageDialog(null, "Pilha de peças atualizadas: \n" + pilhaDePecas + "\n" );
        //System.out.println("Pilha de peças atualizadas: \n" + pilhaDePecas + "\n" );
    }    
}
