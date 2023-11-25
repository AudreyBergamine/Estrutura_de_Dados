package Pilha.Pilha_Stack;


import javax.swing.JOptionPane;

public class Program_Main {

    public static void main(String[] args) {

        String tamanhoStr = JOptionPane.showInputDialog("Digite o tamanho da pilha");
        int tamanho = Integer.parseInt(tamanhoStr);

        Pilha pilha_pecas = new Pilha(tamanho); // Certifique-se de ter a classe Pilha definida

        JOptionPane.showMessageDialog(null, "Preencha a pilha com as peças");
        for (int i = 0; i < tamanho; i++) {
            String pecaStr = JOptionPane.showInputDialog("Digite o valor da peça " + (i + 1));
            int peca = Integer.parseInt(pecaStr);
            pilha_pecas.push(peca);
        }

        int opcao;
        do {
            String opcaoStr = JOptionPane.showInputDialog(
                    "Escolha uma opção:\n" +
                            "1 - Retirar e empilhar peça por peça do produto até chegar na peça defeituosa.\n" +
                            "2 - Retirar a peça defeituosa.\n" +
                            "3 - Colocar uma peça sem defeitos.\n" +
                            "4 - Desempilhar e montar peça por peça do topo da pilha até a pilha ficar vazia.\n" +
                            "0 - Sair");
            opcao = Integer.parseInt(opcaoStr);

            switch (opcao) {
                case 1:
                    String pecaDefeituosaStr = JOptionPane.showInputDialog("Digite o número da peça defeituosa: ");
                    int pecaDefeituosa = Integer.parseInt(pecaDefeituosaStr);

                    // Variável para armazenar temporariamente as peças retiradas
                    Pilha pilhaTemp1 = new Pilha(tamanho);

                    // Retirar e empilhar peças até encontrar a peça defeituosa
                    while (pilhaTemp1.getTopo() >= 0) { // Verifica se o topo é maior ou igual a 0 (pilha não está vazia)
                        int pecaAtual = pilha_pecas.pop();
                        pilhaTemp1.push(pecaAtual);

                        if (pecaAtual == pecaDefeituosa) {
                            break; // Parar quando encontrar a peça defeituosa
                        }
                    }

                    // Empilhar as peças novamente na pilha original
                    while (pilhaTemp1.getTopo() >= 0) {
                        int pecaTemp = pilhaTemp1.pop();
                        pilha_pecas.push(pecaTemp);
                    }

                    if (pilha_pecas.getTopo() == -1) {
                        JOptionPane.showMessageDialog(null, "A pilha está vazia.");
                    }

                    break;
                case 2:
                    // Retirar a peça defeituosa
                    String pecaDefeituosaStr2 = JOptionPane
                            .showInputDialog("Digite o número da peça defeituosa a ser retirada: ");
                    int pecaDefeituosa2 = Integer.parseInt(pecaDefeituosaStr2);

                    Pilha pilhaTemp2 = new Pilha(tamanho);

                    while (!pilha_pecas.isEmpty()) {
                        int pecaAtual = pilha_pecas.pop();

                        if (pecaAtual != pecaDefeituosa2) {
                            pilhaTemp2.push(pecaAtual);
                        }
                    }

                    // Reempilhar as peças não defeituosas na pilha original
                    while (!pilhaTemp2.isEmpty()) {
                        int pecaTemp = pilhaTemp2.pop();
                        pilha_pecas.push(pecaTemp);
                    }

                    break;
                case 3:
                    // Colocar uma peça sem defeitos
                    String pecaSemDefeitosStr = JOptionPane
                            .showInputDialog("Digite o número da peça sem defeitos a ser colocada: ");
                    int pecaSemDefeitos = Integer.parseInt(pecaSemDefeitosStr);

                    pilha_pecas.push(pecaSemDefeitos);
                    break;
                case 4:
                    // Desempilhar e montar peça por peça do topo da pilha até a pilha ficar vazia
                    while (!pilha_pecas.isEmpty()) {
                        int pecaAtual = pilha_pecas.pop();
                        System.out.println("Peça desempilhada: " + pecaAtual);
                    }
                    break;
                case 0:
                    // Adicione a lógica para sair do programa aqui
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}

