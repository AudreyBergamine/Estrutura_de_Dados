package Matriz;

import javax.swing.JOptionPane;

/*
===========================================================================================
Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal.
Cada dia do mês deve conter 24h, onde para cada uma destas 24h podemos associar um compromisso
O programa deve conter um MENU onde o usuário indica o dia do mês e o horário do compromisso
E de forma que o usuário possa consultar a agenda, fornecendo dia e horário para obter
o compromisso armazenado.
===========================================================================================
 */

public class Matriz_Ex04_Agenda1 {
    public static void main(String[] args) {
        System.out.println("\n\n");
        String[][] compromissos = new String[31][24]; // Matriz: linha = 31 dias  coluna = 24 horas

        boolean sair = false;
        int dia = 0;
        int hora = 0;

        while (!sair) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU \n"
                                                                    + "1 - Adicionar Compromisso\n"
                                                                    + "2 - Verificar Compromisso\n"
                                                                    + "0 - Sair"));

            boolean diaValido = false;
            boolean horaValida = false;

            if (opcao == 1) { // Adicionar compromisso
                while (!diaValido) { // Escolher 1 dia valido
                    dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o DIA:"));
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "DIA inválido, digite novamente");
                    }
                }
                while (!horaValida) { // Escolher uma hora valida
                    hora = Integer.parseInt(JOptionPane.showInputDialog("Digite o horário:"));
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "HORA inválida, digite novamente");
                    }
                }

                if (compromissos[dia - 1][hora] != null) { // Verifica se o horário está ocupado
                    JOptionPane.showMessageDialog(null, "Horário indisponível, escolha outro horário.");
                } else {
                    compromissos[dia - 1][hora] = JOptionPane.showInputDialog("NOME do compromisso:");
                    JOptionPane.showMessageDialog(null, "Compromisso agendado com sucesso!");
                }

            } else if (opcao == 2) {
                while (!diaValido) {
                    dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o DIA:"));
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "DIA inválido, digite novamente");
                    }
                }
                while (!horaValida) {
                    hora = Integer.parseInt(JOptionPane.showInputDialog("Digite o horário:"));
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "HORA inválida, digite novamente");
                    }
                }
                
                if (compromissos[dia - 1][hora] != null) {
                    System.out.println("\n\n" + "O compromisso agendado é: ");
                    System.out.println(compromissos[dia - 1][hora]);
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum compromisso agendado para este horário.");
                }
            } else if (opcao == 0) {
                sair = true;
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida, digite novamente");
            }
        }
    }
}
