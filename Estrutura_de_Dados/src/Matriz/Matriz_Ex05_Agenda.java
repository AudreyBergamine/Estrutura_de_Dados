package Matriz;

import javax.swing.JOptionPane;

/*
===========================================================================================
Modifique o programa anterio Matriz_Ex04_Agenda, de maneira a guardar os compromissos de
todo o ano, organizados por mês, dia e hora (só 8h por dia).
===========================================================================================
 */

public class Matriz_Ex05_Agenda {
    public static void main(String[] args) {
        System.out.println("\n\n");

        // Matriz: linha = 12 meses / coluna = 31 dias / profundidade = 8 horas por dia
        String[][][] compromissos = new String[12][31][8]; 

        boolean sair = false;
        int dia = 0;
        int hora = 0;
        int mes = 0;

        while (!sair) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU \n"
                                                                    + "1 - Adicionar Compromisso\n"
                                                                    + "2 - Verificar Compromisso\n"
                                                                    + "0 - Sair"));

            boolean diaValido = false;
            boolean horaValida = false;
            boolean mesValido = false;

            if (opcao == 1) { // ADICIONANDO COMPROMISSOS USANDO MÊS, DIA E HORA PARA ARMAZENAR

                while (!mesValido) { // Escolher 1 mes valido
                    mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o MÊS:"));
                    if (mes > 0 && mes <= 12) {
                        mes--;
                        mesValido = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "MÊS inválido, digite novamente");
                    }
                }
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
                    if (hora >= 0 && hora <= 8) {
                        horaValida = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "HORA inválida, digite novamente");
                    }
                }

                if (compromissos[mes-1][dia - 1][hora] != null) { // Verifica se o horário está ocupado
                    JOptionPane.showMessageDialog(null, "Horário indisponível, escolha outro horário.");
                } else {
                    compromissos[mes - 1][dia - 1][hora] = JOptionPane.showInputDialog("NOME do compromisso:");
                    JOptionPane.showMessageDialog(null, "Compromisso agendado com sucesso!");
                }

            } else if (opcao == 2) { // OPÇÃO PARA MOSTRAR OS COMPROMISSOS USANDO MêS DIA E HORA PARA CONSULTAR

                while (!mesValido) { // Escolher 1 mes valido
                    mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o MÊS:"));
                    
                    if (mes > 0 && mes <= 12) {
                        mes--;
                        mesValido = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "MÊS inválido, digite novamente");
                    }
                }
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
                    if (hora >= 0 && hora <= 8) {
                        horaValida = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "HORA inválida, digite novamente");
                    }
                }
                if (compromissos[mes - 1][dia - 1][hora] != null) { // Se não estiver vazio, ele printa o compromisso
                    System.out.println("\n\n" + "O compromisso agendado é: ");
                    System.out.println(compromissos[mes - 1][dia - 1][hora]);
                    mes++;
                    System.out.println("Mês:  " + mes);
                    System.out.println("Dia:  " + dia);
                    System.out.println("Hora: " + hora);
                    System.out.println("\n\n");

                } else {        // Se o mês, dia e hora estiver vazio, aviso
                    JOptionPane.showMessageDialog(null, "Nenhum compromisso agendado para este horário.");
                }
            } else if (opcao == 0) {
                sair = true; // True se o usuário quer sair > Sai do Loop
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida, digite novamente");
            }
        }
    }
}