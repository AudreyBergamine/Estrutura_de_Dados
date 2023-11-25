package ListaEncadeada.Aula_23_10_23.Exer_02_LE_Alunos;

// Recursividade


import javax.swing.JOptionPane;

public class Program_Menu {   
    
    public static void main(String[] args) {
    	ListaEncAluno list = new ListaEncAluno();

        showMenu(list);

    }
        
    // Mostrar menu para o usuário
    public static void showMenu(ListaEncAluno list ) {
    int menu = -1;    
    while (menu !=4) { 
      menu = Integer.parseInt(JOptionPane.showInputDialog("\n*| DIGITE A OPÇÃO DESEJADA |*  \n\n"
                                                            + "1 -  Inserir um aluno na lista \n"
                                                            + "2 -  Exibir os alunos da lista \n"
                                                            + "3 -   Pesquisar se um aluno está na lista \n"
                                                            + "4 -   Sair do Programa\n"
                                                            + "\n"));                                                
        
        switch (menu) {
        case 1:  // 1 -  Inserir um aluno na lista 
        	String nome = JOptionPane.showInputDialog("Insira o NOME do aluno: ");
        	list.adiciona(nome);
        	JOptionPane.showMessageDialog(null, "Aluno adicionado com sucesso!! ");
            break;

        case 2:  // 2 -  Exibir os alunos da lista
        	list.print();
            break;

        case 3:     
        	String findAluno = JOptionPane.showInputDialog("Insira o NOME do aluno: ");
        	list.pesquisar(findAluno);        	
    		//System.out.println(list.pesquisar2(findAluno).getNome());
            break;

        case 4:  // 0 - Sair do Programa
        	 JOptionPane.showMessageDialog(null, "Saindo do programa...");
             break;

        default:
            JOptionPane.showMessageDialog(null, "Opção inválida! Digite um número válido!");
        }
    }
    }  
    
    
        
}
