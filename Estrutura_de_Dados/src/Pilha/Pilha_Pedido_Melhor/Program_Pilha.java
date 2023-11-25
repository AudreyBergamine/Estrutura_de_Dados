package Pilha.Pilha_Pedido_Melhor;

import java.util.Scanner;

public class Program_Pilha {

	public static void main(String[] args) {
		
		Pilha_Pedido pilha = new Pilha_Pedido();
		
		Scanner sc = new Scanner(System.in);
		

		int op;
		do {
			showMenu();
			op = sc.nextInt();
			
			switch (op) {
			case 1:{
				System.out.println("Digite um valor para empilhar");
				@SuppressWarnings("unused")
				int valor = sc.nextInt();
				
								
				break;

			}
			
			case 2: {
				
				
				break;
	
			}
			
			case 3:{
				System.out.println(pilha);
				
				break;
			}
			
			case 4:{
				//pilha.zerarPilha();
				
				break;
			}
			case 5:{
				System.out.println("Fim do Programa");
				
				break;
			}
			
			default:
				System.out.println("Número invalido, digite novamente !!");
				
			}
		
			
		}while(op!=5);
		
		
		
		
		sc.close();

	}
	
	public static void showMenu() {
		System.out.println("1-Empilhar elemento");
		System.out.println("2-Desempilhar elemento");
		System.out.println("3-Mostrando o topo");
		System.out.println("4-Imprimir tudo zerando a pilha");
		System.out.println("5-Sair do Programa");
		
	}

}

