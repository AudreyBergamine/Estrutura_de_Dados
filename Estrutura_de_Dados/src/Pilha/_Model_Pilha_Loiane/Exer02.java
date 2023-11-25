package Pilha._Model_Pilha_Loiane;

import javax.swing.JOptionPane;

public class Exer02 {

    public static void main(String[] args) {

        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();

        for (int i = 1; i <= 10; i++) {
            String input = JOptionPane.showInputDialog("Entre com um número: ");
            
            int num = Integer.parseInt(input);

            if (num == 0) {

                // Pilha par

                Integer desempilhado = par.desempilha();

                if (desempilhado == null) {
                    JOptionPane.showMessageDialog(null, "Pilha par vazia");
                } else {
                    JOptionPane.showMessageDialog(null, "Desempilhando da pilha par: " + desempilhado);
                }

                // Pilha ímpar

                desempilhado = impar.desempilha();

                if (desempilhado == null) {
                    JOptionPane.showMessageDialog(null, "Pilha impar vazia");
                } else {
                    JOptionPane.showMessageDialog(null, "Desempilhando da pilha impar: " + desempilhado);
                }

            } else if (num % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Número par, empilhando na pilha par: " + num);
                par.empilha(num);
            } else {
                JOptionPane.showMessageDialog(null, "Número ímpar, empilhando na pilha ímpar: " + num);
                impar.empilha(num);
            }
        }

        JOptionPane.showMessageDialog(null, "Desempilhando todos os números da pilha par");

        while (!par.estaVazia()) {
            JOptionPane.showMessageDialog(null, "Desempilhando da pilha par: " + par.desempilha());
        }

        JOptionPane.showMessageDialog(null, "Desempilhando todos os números da pilha ímpar");

        while (!impar.estaVazia()) {
            JOptionPane.showMessageDialog(null, "Desempilhando da pilha ímpar: " + impar.desempilha());
        }

    }
}