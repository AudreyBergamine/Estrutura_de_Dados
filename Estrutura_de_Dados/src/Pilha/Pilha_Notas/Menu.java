package Pilha.Pilha_Notas;

import javax.swing.JOptionPane;

public class Menu {   
    
    public static void main(String[] args) {
        showMenuPilha();
    }
    
    
        
    // Mostrar menu para o usuário
    public static void showMenuPilha() {
    Pilha_Notas pilha = new Pilha_Notas(Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da pilha")));
    int menu = -1;
    
    while (menu !=0) { 
      menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n\n"
                                                            + "1 - Empilhar elemento\n"
                                                            + "2 - Desempilhar elemento\n"
                                                            + "3 - Mostrar o topo \n"
                                                            + "4 - Imprimir tudo zerando a pilha \n"
                                                            + "5 - Imprimir Pilha\n"
                                                            + "0 - Sair do Programa\n"
                                                            + "\n"));                                                
        
        switch (menu) {
        case 1: // 1 - Empilhar elemento
            pilha.empilha(Integer.parseInt(JOptionPane.showInputDialog("Digite um número")));
            JOptionPane.showMessageDialog(null, "Empilhando..." + pilha);
            break;

        case 2: // 2 - Desempilhar elemento
            pilha.desempilha();
            JOptionPane.showMessageDialog(null, "Desempilhando..." + pilha);
            break;

        case 3: // 3 - Mostrar o topo

            // Arrumar
            JOptionPane.showMessageDialog(null, "Elemento no topo: " + pilha.topo);            
            break;

        case 4: // 4 - Imprimir tudo zerando a pilha
            pilha.zerarPilha();
            break;

        case 5: // 5 - Imprimir pilha
            JOptionPane.showMessageDialog(null, "Imprimindo Pilha: \n" + pilha.toString());
            
            break;

        case 0: // 0-Sair do Programa
            JOptionPane.showMessageDialog(null, "Saindo do programa...");
            break;

        default:
            JOptionPane.showMessageDialog(null, "Opção inválida! Digite um número válido!");
        }
    }
    }          
}

    

    
    

