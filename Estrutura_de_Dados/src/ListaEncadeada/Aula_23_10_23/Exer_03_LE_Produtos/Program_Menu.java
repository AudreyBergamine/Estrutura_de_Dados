package ListaEncadeada.Aula_23_10_23.Exer_03_LE_Produtos;

// Recursividade


import javax.swing.JOptionPane;

public class Program_Menu {   
    
    public static void main(String[] args) {
    	Lista list = new Lista();
    	
    	Produtos p1 = new Produtos("P1", 10.00);
    	Produtos p2 = new Produtos("P2", 20.00);
    	Produtos p3 = new Produtos("P3", 30.00);
    	Produtos p4 = new Produtos("P4", 40.00);
    	
    	list.adiciona(p1);
    	list.adiciona(p2);
    	list.adiciona(p3);
    	list.adiciona(p4);
    	//list.print();     
    	
    	
//    	list.remover(p2);
//    	list.print();  
    
    	
    	

        showMenu(list);

    }
        
    // Mostrar menu para o usuário
    public static void showMenu(Lista list ) {
    int menu = -1;    
    while (menu != 6) { 
      menu = Integer.parseInt(JOptionPane.showInputDialog("\n*| DIGITE A OPÇÃO DESEJADA |*  \n\n"
                                                            + "1 - Cadastrar Produtos ( Descrição e Valor) \n"
                                                            + "2 - Verificar se tem Produtos \n"
                                                            + "3 - Exibir os produtos da lista \n"
                                                            + "4 - Limpar a Lista \n"
                                                            + "5 - Pesquisar Produto(s) \n"
                                                            + "6 - Sair \n"
                                                            + "\n"));                                             
              
        switch (menu) {
        case 1:  //1 -  Cadastrar Produtos ( Descrição e Valor) 
            String desc = JOptionPane.showInputDialog("Insira a descrição do produto: \n");
            Double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor: \nExemplo: 10.00 \n\n"));

            Produtos produto = new Produtos(desc, valor);
            list.adiciona(produto);
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!!");
            break;

        case 2:  // 2 -  Verificar se tem Produtos
            if (list.vazia()) {
                JOptionPane.showMessageDialog(null, "A lista está vazia.");
            } else {
                JOptionPane.showMessageDialog(null, "A lista contém produtos ");
            }
            break;

        case 3:  // 3 -   Exibir os produtos da lista 
            list.print();            
            break;

        case 4:  //  4 -   Limpar a Lista 
            list.limpar();
            JOptionPane.showMessageDialog(null, "Lista limpa.");
            break;
            
        case 5:  // 5 - Pesquisar Produtos
        	String descricao = JOptionPane.showInputDialog("Digite o que deseja pesquisar: \n\n");
        	Produtos[] produtos = list.pesquisar(descricao);
        	String s = "";
        	for (Produtos p : produtos) {
        		s += p.toString();
    		}
        	JOptionPane.showMessageDialog(null,"PESQUISA POR: " + descricao + "\n\nPRODUTOS  ENCONTRADOS: \n" +  s);
        	break;
        	
        case 6:  // 0 - Sair do Programa
        	JOptionPane.showMessageDialog(null, "Saindo do programa...");
        	break;

        default:
            JOptionPane.showMessageDialog(null, "Opção inválida! Digite um número válido!");
        }
    }
    }  
    
    
        
}
