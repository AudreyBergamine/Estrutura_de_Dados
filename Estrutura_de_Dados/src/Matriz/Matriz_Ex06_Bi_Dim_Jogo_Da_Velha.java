package Matriz;

import javax.swing.JOptionPane;

/*
===========================================================================================
 Faça um programa de Jogo da Velha, onde deve permitir que os dois jogadores façam uma
 partida do jogo, usando o computador para ver o tabuleiro.
 Cada jogador vai alternadamente indormando a posição onde deseja colocar a sua peça
 ("O" ou "X")
 O programa deve impedir jogadas inválidas e determinar automaticamente quando o jogo 
 terminou e quem foi o vencedor (Jogador 1 ou 2 ). 
 A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela.
===========================================================================================
 */

public class Matriz_Ex06_Bi_Dim_Jogo_Da_Velha {
    public static void main(String[] args) {
        char[][] jogo_Da_Velha = new char[3][3];
        JOptionPane.showMessageDialog(null, "Jogador 1 = X \nJogador 2 = O");

        Boolean ganhou = false;
        int jogada = 1; // Toda vez que for numero ímpar, será a vez do jogador 1, se for número par, é a vez do jogador 2
        char sinal;
        
        while (!ganhou) {
            int linha = 0;
            int coluna = 0;

            boolean linhaValida = false;
            boolean colunaValida = false;

            if (jogada % 2 == 1 ) { // Jogador 1 = X
                JOptionPane.showMessageDialog(null,"Vez do Jogador 1 !!!\nEscolha linha e coluna: ");
                sinal = 'X';

            } else {
                JOptionPane.showMessageDialog(null,"Vez do Jogador 2 !!!\nEscolha linha e coluna: ");
                sinal = 'O';
            }            
            while (!linhaValida) { // Enquanto não entrar com uma linha válida, vai pedir outro número
                linha = Integer.parseInt(JOptionPane.showInputDialog("Entre com a LINHA 1, 2 ou 3 !!!"));
                if ( linha >= 1 && linha <= 3) {
                    linha = linha -1;
                    linhaValida = true;
                } else {
                    JOptionPane.showMessageDialog(null,"Linha Inválida!!! Tente Novamente !!! ");
                }
            }
            while (!colunaValida) { // Enquanto não entrar com uma coluna válida, vai pedir outro número
                coluna = Integer.parseInt(JOptionPane.showInputDialog("Entre com a COLUNA 1, 2 ou 3 !!!"));
                if ( coluna >= 1 && coluna <= 3) {
                    coluna = coluna -1;
                    colunaValida = true;
                } else {
                    JOptionPane.showMessageDialog(null,"Coluna Inválida!!! Tente Novamente !!! ");
                }
            }
        
            // // VERIFICANDO SE A POSIÇÃO ESCOLHIDA ESTÁ DISPONÍVEL
            // if ( jogo_Da_Velha[linha-1][coluna-1] == 'X' || jogo_Da_Velha[linha-1][coluna-1] == 'O' ){
            //     JOptionPane.showMessageDialog(null,"Posição já preenchida!!! Tente Novamente !!! ");
            // } else { // SE ESTIVER DISPONÍVEL > Jogada Válida > Muda para outro jogador
            //     jogo_Da_Velha[linha-1][coluna-1] = sinal;
            //     jogada++; // Incremento para trocar de jogador
            // }


            // VERIFICANDO SE A POSIÇÃO ESCOLHIDA ESTÁ DISPONÍVEL
            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
                if (jogo_Da_Velha[linha][coluna] == 'X' || jogo_Da_Velha[linha][coluna] == 'O') {
                    JOptionPane.showMessageDialog(null, "Posição já preenchida!!! Tente Novamente !!! ");
                } else { // SE ESTIVER DISPONÍVEL > Jogada Válida > Muda para outro jogador
                    jogo_Da_Velha[linha][coluna] = sinal;
                    jogada++; // Incremento para trocar de jogador
                }
            } else {
                JOptionPane.showMessageDialog(null, "Posição inválida!!! Tente Novamente !!! ");
            }

            // LOOP PARA EXIBIR O TABULEIRO ATUALIZADO
            System.out.println("\n\n\n");
            System.out.println("==========================================");
            System.out.println("                TABULEIRO: ");
            System.out.println("==========================================");
            for ( int i = 0; i < jogo_Da_Velha.length; i++) {
                for ( int j = 0; j < jogo_Da_Velha[i].length; j++){
                    System.out.print(jogo_Da_Velha[i][j] + "\t|\t");                    
                } // cada vez que sair do for coluna > ele troca de linha
                System.out.println();
            }

            // VERIFICA ALGUM JOGADOR GANHAU
            if (                                // SE Jogador 1 ganhou
                (jogo_Da_Velha[0][0] == 'X' && jogo_Da_Velha[0][1] == 'X' && jogo_Da_Velha[0][2] == 'X')  // Linha 1  Horizontal
            || (jogo_Da_Velha[1][0] == 'X' && jogo_Da_Velha[1][1] == 'X' && jogo_Da_Velha[1][2] == 'X')   // Linha 2
            || (jogo_Da_Velha[2][0] == 'X' && jogo_Da_Velha[2][1] == 'X' && jogo_Da_Velha[2][2] == 'X')   // Linha 3

            || (jogo_Da_Velha[0][0] == 'X' && jogo_Da_Velha[1][0] == 'X' && jogo_Da_Velha[2][0] == 'X')   // Coluna 1 Vertical
            || (jogo_Da_Velha[0][1] == 'X' && jogo_Da_Velha[1][1] == 'X' && jogo_Da_Velha[2][1] == 'X')   // Coluna 2
            || (jogo_Da_Velha[0][2] == 'X' && jogo_Da_Velha[1][2] == 'X' && jogo_Da_Velha[2][2] == 'X')   // Coluna 3

            || (jogo_Da_Velha[0][0] == 'X' && jogo_Da_Velha[1][1] == 'X' && jogo_Da_Velha[2][2] == 'X')   // Diagonal Esq p/ Dir
            || (jogo_Da_Velha[0][2] == 'X' && jogo_Da_Velha[1][1] == 'X' && jogo_Da_Velha[2][0] == 'X')   // Diagonal Dir p/ Esq
            ){                                      
                ganhou = true;
                JOptionPane.showMessageDialog(null,"!!! PARABÉNSNS !!! \n\n!!! JOGADOR 1 GANHOU !!! ");

            } else if (                         // SE Jogador 2 ganhou
                (jogo_Da_Velha[0][0] == 'O' && jogo_Da_Velha[0][1] == 'O' && jogo_Da_Velha[0][2] == 'O')  // Linha 1  Horizontal
            || (jogo_Da_Velha[1][0] == 'O' && jogo_Da_Velha[1][1] == 'O' && jogo_Da_Velha[1][2] == 'O')   // Linha 2
            || (jogo_Da_Velha[2][0] == 'O' && jogo_Da_Velha[2][1] == 'O' && jogo_Da_Velha[2][2] == 'O')   // Linha 3

            || (jogo_Da_Velha[0][0] == 'O' && jogo_Da_Velha[1][0] == 'O' && jogo_Da_Velha[2][0] == 'O')   // Coluna 1 Vertical
            || (jogo_Da_Velha[0][1] == 'O' && jogo_Da_Velha[1][1] == 'O' && jogo_Da_Velha[2][1] == 'O')   // Coluna 2
            || (jogo_Da_Velha[0][2] == 'O' && jogo_Da_Velha[1][2] == 'O' && jogo_Da_Velha[2][2] == 'O')   // Coluna 3

            || (jogo_Da_Velha[0][0] == 'O' && jogo_Da_Velha[1][1] == 'O' && jogo_Da_Velha[2][2] == 'O')   // Diagonal Esq p/ Dir
            || (jogo_Da_Velha[0][2] == 'O' && jogo_Da_Velha[1][1] == 'O' && jogo_Da_Velha[2][0] == 'O')   // Diagonal Dir p/ Esq
            ){
                ganhou = true;
                JOptionPane.showMessageDialog(null,"!!! PARABÉNS !!! \n\n!!! JOGADOR 2 GANHOU !!! "); 

            } else if (jogada > 9) {           // SE Ninguém ganhou
                ganhou = true;
                JOptionPane.showMessageDialog(null,"Que pena...\nNinguém ganhou essa partida!\n" 
                                                                                + "Tente Novamente!! ");
            }
        }   
    }
}