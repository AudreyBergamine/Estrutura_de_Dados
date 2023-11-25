package Pilha.Pilha_Peca_Int_new;


import javax.swing.JOptionPane;

public class Program_Main_Int {

    public static void main(String[] args) {

        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da pilha: "));

        Pilha_Peca_Int pilhaPecas = new Pilha_Peca_Int(tamanho);

        // Preenchendo a pilha
        for (int i = 0; i < tamanho; i++) {
            int peca = Integer.parseInt(JOptionPane.showInputDialog("Preencha a pilha com as peças! \n" 
            																	+ "Insira a peça: " + (i+1)));
            pilhaPecas.empilhar(peca);
        }

        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("\n*| ESCOLHA UMA OPÇÃO |*  \n\n"
                    + "1 - Retirar e empilhar peça por peça do produto até chegar na peça defeituosa\n"
                    + "2 - Retirar a peça defeituosa\n"
                    + "3 - Colocar uma peça sem defeitos\n"
                    + "4 - Desempilhar e montar peça por peça do topo da pilha até a pilha ficar vazia\n"
                    + "5 - Imprimir Pilha\n"
                    + "0 - Sair\n"
                    + " \n"));

            switch (menu) {
                case 1:
                    int pecaDefeituosa = Integer
                            .parseInt(JOptionPane.showInputDialog("Digite o número da peça defeituosa: "));

                    // Pilha temporária para armazenar temporariamente as peças retiradas
                    Pilha_Peca_Int pilhaTemp1 = new Pilha_Peca_Int(tamanho);

                    // Retirar e empilhar peças até encontrar a peça defeituosa
                    while (pilhaPecas.getTopo() >= 0) {
                        int pecaAtual = pilhaPecas.desempilhar(); // Tirando da pilha original 
                        pilhaTemp1.empilhar(pecaAtual);			 // Colocando na pilha temp

                        if (pecaAtual == pecaDefeituosa) {
                            break; // Para quando encontra a peça defeituosa
                        }
                    }

                    // Empilhando as peças novamente na pilha original
                    while (pilhaTemp1.getTopo() >= 0) {
                        int pecaTemp = pilhaTemp1.desempilhar();
                        pilhaPecas.empilhar(pecaTemp);
                    }
                    JOptionPane.showMessageDialog(null, "" + pilhaPecas.toString());
                    break;

                case 2:
                    int pecaDefeituosa2 = Integer.parseInt(
                            JOptionPane.showInputDialog("Digite o número da peça defeituosa a ser retirada: "));

                    // Pilha temporária p/ armazenar temporariamente as peças não defeituosas
                    Pilha_Peca_Int pilhaTemp2 = new Pilha_Peca_Int(tamanho);

                    // Retirar as peças defeituosas e armazenar as não defeituosas na pilha temporária
                    while (pilhaPecas.getTopo() >= 0) {
                        int pecaAtual = pilhaPecas.desempilhar();

                        if (pecaAtual != pecaDefeituosa2) {
                            pilhaTemp2.empilhar(pecaAtual);
                        }
                    }

                    // Reempilhar as peças não defeituosas na pilha original
                    while (pilhaTemp2.getTopo() >= 0) {
                        int pecaTemp = pilhaTemp2.desempilhar();
                        pilhaPecas.empilhar(pecaTemp);
                    }
                    break;

                case 3:
                    int pecaSemDefeitos = Integer.parseInt(
                            JOptionPane.showInputDialog("Digite o número da peça SEM defeito a ser empilhada: "));
                    pilhaPecas.empilhar(pecaSemDefeitos);
                    break;

                case 4:
                    // Desempilhar e montar peças do topo da pilha até ficar vazia
                    while (pilhaPecas.getTopo() >= 0) {
                        int pecaAtual = pilhaPecas.desempilhar();
                        JOptionPane.showMessageDialog(null, "Peça " + pecaAtual + " desempilhada!" );
                       
                    }
                    break; 
                case 5: // 5 - Imprimir pilha
                    JOptionPane.showMessageDialog(null, "Imprimindo Pilha: \n" + pilhaPecas);
                    
                    break;
        
                case 0: // 0-Sair do Programa
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
        
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Digite um número válido!");
            }           
            
        } while (menu != 0);
    }
}

