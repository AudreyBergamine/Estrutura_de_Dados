package Laco_repeticao;

import javax.swing.JOptionPane;

public class Do_While_Ex_02 {
    public static void main(String[] args) {

        boolean infoValidas = false;
        String nomeUser, senha;

        do {
            nomeUser = JOptionPane.showInputDialog("\nDigite o nome do usuário: ");

            senha = JOptionPane.showInputDialog("\nDigite a senha: ");

            if (nomeUser.equals(senha)) {

                infoValidas = false;
                JOptionPane.showMessageDialog(null, "Senha igual a usuário, digite novamente: ");

            } else {
                infoValidas = true;
                JOptionPane.showMessageDialog(null, "Senha e usuário válidos: ");
            }
        } while (!infoValidas);
    }
}

