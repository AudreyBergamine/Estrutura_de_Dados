package Pilha.Pilha_Peca_String;

import javax.swing.JOptionPane;

public class Program_Main {

    public static void main(String[] args) {

        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da pilha: "));

        Pilha_Peca pilhaPecas = new Pilha_Peca(tamanho);

        // Preenchendo a pilha com peças
        for (int i = 0; i < tamanho; i++) {
            String peca = JOptionPane.showInputDialog("Preencha a pilha com as peças! \n" 
            										+ "Insira a peça: " + (i + 1));
            pilhaPecas.empilhar(peca);
        }

        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("\n*| ESCOLHA UMA OPÇÃO |*  \n\n"
                    + "1 - Retirar a peça defeituosa\n"
                    + "2 - Colocar uma peça sem defeitos\n"
                    + "3 - Desempilhar e montar peça por peça do topo da pilha até a pilha ficar vazia\n"
                    + "4 - Exibir Pilha\n"
                    + "0 - Sair\n"
                    + " \n"));

            switch (menu) {
                case 1:
                	JOptionPane.showMessageDialog(null, "Percorrendo pilha até encontrar a peça defeituosa...\n" );
                	Pilha_Peca.remove_Peca_Dedeituosa(pilhaPecas);
                    JOptionPane.showMessageDialog(null, "Peças defeituosas retiradas!\n\n" + pilhaPecas.toString() + "\n");
                    
                    break;

                case 2:
                	String pecaSemDefeitos = JOptionPane.showInputDialog("Digite o nome da peça SEM defeito a ser empilhada: ");
                	if (!pecaSemDefeitos.equalsIgnoreCase("defeituosa")) {
                	    pilhaPecas.empilhar(pecaSemDefeitos);
                	} else {
                		JOptionPane.showMessageDialog(null, "Peça defeituosa! Não foi empilhada!");
                	}
                    
                    break;

                case 3:  // Desempilhar e montar peças do topo da pilha até ficar vazia
                    pilhaPecas.desempilharTudo();
                    
                    break;
                    
                case 4: // 5 - Exibir pilha
                	JOptionPane.showMessageDialog(null, "" + pilhaPecas.toString() + "\n");
                    
                    break;

                case 0: // 0 - Sair do Programa
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Digite um número válido!");
            }

        } while (menu != 0);
    }
}
