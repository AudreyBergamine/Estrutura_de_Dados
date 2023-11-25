package Matriz;

/*
===========================================================================================
 Pegando um valor específico da matriz e mudando esse valor. Extraindo a média ponderada
===========================================================================================
 */

public class Matriz_Bi_Dim {
    public static void main(String[] args) {
        double[][] notas_Alunos = new double[3][4];
        // Iniciando a Matriz de uma só vez:
        // double[][] notasAlunos2 = {{10,7,8,9.5},{9,8,7,9}};

        notas_Alunos[0][0] = 10;
        notas_Alunos[0][1] = 7;
        notas_Alunos[0][2] = 9;
        notas_Alunos[0][3] = 9.5;

        notas_Alunos[1][0] = 9;
        notas_Alunos[1][1] = 8;
        notas_Alunos[1][2] = 7;
        notas_Alunos[1][3] = 9;

        notas_Alunos[2][0] = 8;
        notas_Alunos[2][1] = 9;
        notas_Alunos[2][2] = 10;
        notas_Alunos[2][3] = 7;

        // Loop para exibir as notas dos alunos
        System.out.println("=========================================================");
        System.out.println("                    Matriz Digitada: ");
        System.out.println("=========================================================");
        System.out.println("Col 0 \t\tCol 1 \t\tCol 2 \t\tCol 3");
        for (int i = 0; i < notas_Alunos.length; i++) {
            for (int j = 0; j < notas_Alunos[i].length; j++) {
                System.out.print(notas_Alunos[i][j] + " \t\t");
            }
            System.out.println(); // Quebra de linha após cada linha de notas
        }        
        System.out.println("\n\n");

        // Mudando um valor específico da matriz
        System.out.println("=========================================================");
        System.out.println("               Matriz com alterações feitas: ");
        System.out.println("=========================================================");
        System.out.println("Col 0 \t\tCol 1 \t\tCol 2 \t\tCol 3");
        for (int i = 0; i < notas_Alunos.length; i++) {
            for (int j = 0; j < notas_Alunos[i].length; j++) {
                notas_Alunos[1][3] = 8;  // POSSO USAR O INPUT PARA O USUÁRIO INSERIR

                System.out.print(notas_Alunos[i][j] + " \t\t");
            }
            System.out.println(); // Quebra de linha após cada linha de notas
            
        }
        System.out.println("\n\n");

        // Calculando a média aritmética de cada aluno
        System.out.println("=========================================================");
        System.out.println("        Calculando a Média de Cada Aluno ");
        System.out.println("=========================================================");
        double soma;
        for (int i = 0; i < notas_Alunos.length; i++) {
            soma = 0;
            for (int j = 0; j < notas_Alunos[i].length; j++) {
                soma += notas_Alunos[i][j];
            }
            System.out.println("Média do Aluno " + i + " é = \t" + (soma/4));
            
        }        
        System.out.println("\n\n");

    }
}

