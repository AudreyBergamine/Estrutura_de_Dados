package Matriz;

import javax.swing.JOptionPane;

/*
=====================
Agenda de um mês
=====================
 */
public class Matriz_Tri_Dim_Agenda {
    public static void main(String[] args) {
        System.out.println("\n\n");
        String[][][] compromissos = new String[31][24][10]; // Matriz:  Linha = 31 dias 
                                                            //          Coluna = 24 horas
                                                            //          Profundidade = até 10 compromissos por hora
        boolean sair = false;

        while (!sair) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU \n"
                    + "1 - Adicionar Compromisso\n"
                    + "2 - Verificar Compromissos\n"
                    + "0 - Sair\n"));

            if (opcao == 1) {
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o DIA:"));
                int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite o horário:"));

                int indiceCompromisso = 0;
                while (compromissos[dia - 1][hora][indiceCompromisso] != null) {
                    indiceCompromisso++;
                    if (indiceCompromisso >= compromissos[dia - 1][hora].length) {
                        JOptionPane.showMessageDialog(null, "Limite de compromissos atingido para esta hora.");
                        break;
                    }
                }

                if (compromissos[dia - 1][hora][indiceCompromisso] == null) {
                    compromissos[dia - 1][hora][indiceCompromisso] = JOptionPane.showInputDialog("Digite o nome do COMPROMISSO:");
                }

            } else if (opcao == 2) {
                StringBuilder message = new StringBuilder("Compromissos:\n\n");

                for (int dia = 0; dia < compromissos.length; dia++) {
                    for (int hora = 0; hora < compromissos[dia].length; hora++) {
                        for (String compromisso : compromissos[dia][hora]) {
                            if (compromisso != null) {
                                message.append("Dia:          ").append(dia + 1).append("\nHorario:   ").append(hora).append("\n").append(compromisso).append("\n===================\n");
                            }
                        }
                    }
                }

                if (message.toString().equals("Compromissos:\n")) {
                    JOptionPane.showMessageDialog(null, "Nenhum compromisso agendado.");
                } else {
                    JOptionPane.showMessageDialog(null, message.toString());
                }
            } else if (opcao == 0) {
                sair = true;
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida, digite novamente");
            }
        }
    }
}