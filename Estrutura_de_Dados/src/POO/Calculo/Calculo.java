package POO.Calculo;

import javax.swing.JOptionPane;

public class Calculo {
    int parMaior;
    int imparMaior;

    void Maior_Valor() {
    	
        // Solicita ao usuário que insira dois números pares
        int numPar1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número par: "));
        int numPar2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número par: "));

        // Verifica se ambos os números são pares
        if (numPar1 % 2 == 0 && numPar2 % 2 == 0) {
            // Calcula o maior número par
            parMaior = (numPar1 > numPar2) ? numPar1 : numPar2;

            // Solicita ao usuário que insira dois números ímpares
            int numImpar1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número ímpar: "));
            int numImpar2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número ímpar: "));

            // Verifica se ambos os números são ímpares
            if (numImpar1 % 2 != 0 && numImpar2 % 2 != 0) {
                // Calcula o maior número ímpar
                imparMaior = (numImpar1 > numImpar2) ? numImpar1 : numImpar2;

                // Exibe a soma dos maiores números
                JOptionPane.showMessageDialog(null, "O maior número par é: " + parMaior +
                        "\nO maior número ímpar é: " + imparMaior +
                        "\n\nA soma dos maiores números é: " + (parMaior + imparMaior));
            } else {
                JOptionPane.showMessageDialog(null, "Pelo menos um dos números ímpares inseridos não é ímpar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pelo menos um dos números pares inseridos não é par.");
        }
    }
}

