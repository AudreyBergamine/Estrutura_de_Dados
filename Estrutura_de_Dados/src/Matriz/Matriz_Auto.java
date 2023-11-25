package Matriz;

import javax.swing.JOptionPane;

public class Matriz_Auto {
    public static void main(String[] args) {
        int qtd_Alunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos a ser registrada: "));
        int qtd_Notas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas a ser registrada: "));
        
        int[][] notas_Alunos = new int[qtd_Alunos][qtd_Notas];
        
        for (int i = 0; i < notas_Alunos.length; i++) {
            for (int j = 0; j < notas_Alunos[i].length; j++) {
                notas_Alunos[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno:  " + (i + 1) +"\n"
                                            + "Nota da disciplina:  " + (j + 1) + ": "));
            }
        }
        
        System.out.println("Matriz de Notas:");
        for (int i = 0; i < notas_Alunos.length; i++) {
            for (int j = 0; j < notas_Alunos[i].length; j++) {
                System.out.print(notas_Alunos[i][j] + "\t\t");
            }
            System.out.println(); 
        }
        System.out.println(); 
    }
}

