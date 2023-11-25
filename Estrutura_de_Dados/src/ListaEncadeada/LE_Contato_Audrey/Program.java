package ListaEncadeada.LE_Contato_Audrey;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {

		//		Lista contato= new Lista();
		//		contato.adicionar(new Contato("Ana","ana@gmail.com"));
		//		contato.adicionar(new Contato("Paulo","@gmail.com"));
		//		 contato.print();
		
		
		Lista list = new Lista();

		showMenu(list);

	}

	// Mostrar menu para o usuário
	public static void showMenu(Lista list) {
		int menu = -1;
		while (menu != 5) {
			menu = Integer.parseInt(JOptionPane.showInputDialog("\n*| DIGITE A OPÇÃO DESEJADA |*  \n\n"
																										+ "1 - Cadastrar Contatos (Nome e Email) \n"
																										+ "2 - Verificar se tem Contatos \n"
																										+ "3 - Exibir os contatos da lista \n"
																										+ "4 - Limpar a Lista \n"
																										+ "5 - Sair \n"
																										+ "\n"));

			switch (menu) {
			case 1:  //1 -  Cadastrar Contatos (Nome e Email)
				String nome = JOptionPane.showInputDialog("Insira o NOME do contato: \n");
				String email = JOptionPane.showInputDialog("Insira o EMAIL do contato: \n");

				Contato contato = new Contato(nome, email);
				list.adiciona(contato);
				JOptionPane.showMessageDialog(null, "Contato adicionado com sucesso!!");
				break;

			case 2:  // 2 -  Verificar se tem Contatos
				if (list.vazia()) {
					JOptionPane.showMessageDialog(null, "A lista está vazia.");
				} else {
					JOptionPane.showMessageDialog(null, "A lista contém contatos ");
				}
				break;

			case 3:  // 3 -   Exibir os contatos da lista
				list.print();
				break;

			case 4:  //  4 -   Limpar a Lista
				list.limpar();
				JOptionPane.showMessageDialog(null, "Lista limpa.");
				break;

			case 5:  // 0 - Sair do Programa
				JOptionPane.showMessageDialog(null, "Saindo do programa...");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida! Digite um número válido!");
			}
		}
	}
}