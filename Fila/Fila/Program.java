package Fila.Fila;

/*
 A escola Paulo Freire está organizando uma escursão do 3º ano para o parque aquatico...
 Desenvolva um sitema que crie uma fila com  com as seguintes operações.
 
 1 - Inserir na Fila
 2 - Exibir a Fila em Ordem Crescente
 3 - Pesquisar um aluno na Fila
 */

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {

		Fila<String> fila = new Fila<String>();
		
// 	fila.adicionar("Carla");		
//		fila.adicionar("Audrey");
//		fila.adicionar("Victor");
//		fila.adicionar("Beatriz");
//		fila.adicionar("Talles");
//		fila.adicionar("Carolina");
		
		showMenu(fila);

	}
	public static void showMenu(Fila<String> fila) {
		// Mostrar menu para o usuário
		int menu = -1;    
		while (menu !=0) { 
			menu = Integer.parseInt(JOptionPane.showInputDialog("\n*| DIGITE A OPÇÃO DESEJADA |*  \n\n"
																											+ "1 -  Inserir Aluno na Fila \n"
																											+ "2 -  Exibir a Fila em Ordem Alfabética \n"
																											+ "3 -  Pesquisar um aluno na Fila \n"
																											+ "0 - Sair do Programa\n"
																											+ "\n"));                                                

			switch (menu) {
			case 1: // 1 -  Inserir Aluno na Fila				
				String nome = JOptionPane.showInputDialog("Insira o NOME do aluno: \n");
				fila.adicionar(nome);
				break;

			case 2: // 2 -  Exibir a Fila em Ordem Alfabética
				fila.mostrar();
				break;

			case 3: // 3 -  Pesquisar um aluno na Fila   > equals 
				String buscaNome = JOptionPane.showInputDialog("Insira o NOME do aluno a ser pesquisado: \n"); 
				fila.buscaString(buscaNome);
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