package Ex_Atividade_01;

//Crie um vetor com capacidade de 10 números inteiros, e mostre os números repetidos.

import javax.swing.JOptionPane;

public class lab01_Tentativa1 {
 public static void main(String[] args) {

     int[] vetor = new int[10];

     // Usuário vai fazer input dos 10 números
     for (int i = 0; i < vetor.length; i++) {
         int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número (" + (i + 1) + "/10): "));
         vetor[i] = num;
         
     }

     // Buscando números repetidos
     String numerosRepetidos = "Números repetidos:\n";
     boolean temRepeticoes = false;

     for (int i = 0; i < vetor.length; i++) {
         for (int j = i + 1; j < vetor.length; j++) {
             if (vetor[i] == vetor[j]) {
                 if (!numerosRepetidos.contains(String.valueOf(vetor[i]))) {
                     numerosRepetidos += vetor[i] + "\n";
                     temRepeticoes = true;
                 }
                 break;
             }
         }
     }
     if (temRepeticoes) {
         JOptionPane.showMessageDialog(null, numerosRepetidos);
     } else {
         JOptionPane.showMessageDialog(null, "Não há números repetidos.");
     }
 }
}

