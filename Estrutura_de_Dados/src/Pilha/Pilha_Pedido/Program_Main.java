package Pilha.Pilha_Pedido;

import javax.swing.JOptionPane;

//import Pilha.Pilha_Peca.Pilha_Peca;

public class Program_Main {

	public static void main(String[] args) {
		
		Pilha_Pedido pilha = new Pilha_Pedido(10);
		
		int menu;
	    do {
	       menu = Integer.parseInt(JOptionPane.showInputDialog("\n  |  ESCOLHA UMA OPÇÃO  |  \n\n"
	                + "1 - Empilhar elemento\n"
	                + "2 - Desempilhar elemento\n"
	                + "3 - Mostrar elemento do topo\n"
	                + "4 - Imprimir tudo zerando a pilha\n"
	                + "5 - Imprimir Pilha\n"
	                + "0 - Sair\n"
	                + " \n"));
	
	        switch (menu) {
	            case 1:
	            	int elemento = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para empilhar"));
	            	pilha.empilha(elemento);	                
	                break;
	
	            case 2:
	                pilha.desempilha();
	                break;
	
	            case 3:
	            	JOptionPane.showMessageDialog(null, "Elemento do Topo: \n" + pilha.elementoTopo());
	                
	                break;
	
	            case 4:
	            	pilha.zerarPilha();
	              	                   
	                break; 
	                
	            case 5: // 5 - Imprimir pilha
	                JOptionPane.showMessageDialog(null, "Imprimindo Pilha: \n" + pilha.toString() );
	                
	                break;
	    
	            case 0: // 0-Sair do Programa
	                JOptionPane.showMessageDialog(null, "Saindo do programa...");
	                break;
	    
	            default:
	                JOptionPane.showMessageDialog(null, "Opção inválida! Digite um número válido!");
	        }           
	        
	    } while (menu != 0);
	}
}


