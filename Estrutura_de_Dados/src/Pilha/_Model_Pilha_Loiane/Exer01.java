package Pilha._Model_Pilha_Loiane;

import javax.swing.JOptionPane;

public class Exer01 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        for (int i = 1; i <= 10; i++) {

            String input = JOptionPane.showInputDialog("Entre com um número:");

            int num = Integer.parseInt(input);

            if (num % 2 == 0) {

                JOptionPane.showMessageDialog(null, "Empilhando o número " + num);

                pilha.empilha(num);
            } else {

                Integer desempilhado = pilha.desempilha();

                if (desempilhado == null) {
                    JOptionPane.showMessageDialog(null, "Pilha está vazia!");
                } else {
                    JOptionPane.showMessageDialog(null, "Número ímpar, desempilhando..." + desempilhado);
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Todos os números foram lidos, desempilhando números da pilha");

        while (!pilha.estaVazia()) {

            JOptionPane.showMessageDialog(null, "Desempilhando um elemento da pilha: " + pilha.desempilha());
        }

        JOptionPane.showMessageDialog(null, "Todos os elementos foram desempilhados");
    }
}
