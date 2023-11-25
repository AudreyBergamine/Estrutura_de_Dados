package Laco_repeticao;

import javax.swing.JOptionPane;

public class Do_While_Ex_01 {
    public static void main(String[] args) {

        boolean notaValida = false;
        do {
            int nota = Integer.parseInt(JOptionPane.showInputDialog("\nDigite uma NOTA: "));

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                JOptionPane.showMessageDialog(null, "Você digitou: " + nota);
            } else {
                JOptionPane.showMessageDialog(null, "Nota inválida, digite novamente: ");
            }
        } while (!notaValida);
    }
}

