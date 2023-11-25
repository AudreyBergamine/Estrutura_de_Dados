package _Audrey_Biblioteca;

import javax.swing.JOptionPane;

public class Menu {   
    
    public static void main(String[] args) {
        showMenu();

    }
        
    // Mostrar menu para o usuário
    public static void showMenu() {
    int menu = -1;    
    while (menu !=0) { 
      menu = Integer.parseInt(JOptionPane.showInputDialog("\n*| DIGITE A OPÇÃO DESEJADA |*  \n\n"
                                                            + "1 -  \n"
                                                            + "2 -  \n"
                                                            + "3 -   \n"
                                                            + "4 -   \n"
                                                            + "5 -  \n"
                                                            + "0 - Sair do Programa\n"
                                                            + "\n"));                                                
        
        switch (menu) {
        case 1: 
        	
            break;

        case 2: 
            break;

        case 3:            
            break;

        case 4: 
            break;

        case 5:            
            break;

        case 0: // 0 - Sair do Programa
            JOptionPane.showMessageDialog(null, "Saindo do programa...");
            break;

        default:
            JOptionPane.showMessageDialog(null, "Opção inválida! Digite um número válido!");
        }
    }
    }  
    
    
        
}
