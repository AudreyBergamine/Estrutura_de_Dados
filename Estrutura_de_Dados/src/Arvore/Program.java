package Arvore;

public class Program {

	public static void main(String[] args) {
		Arvore arvore = new Arvore(new Elemento(85)); // Já crio a árvore determinando a Raiz
		
		arvore.adicionar(new Elemento(5));
		arvore.adicionar(new Elemento(41));
		arvore.adicionar(new Elemento(16));
		arvore.adicionar(new Elemento(47));
		arvore.adicionar(new Elemento(90));
		arvore.adicionar(new Elemento(61));
		arvore.adicionar(new Elemento(39));
		arvore.adicionar(new Elemento(65));
		arvore.adicionar(new Elemento(0));
		arvore.adicionar(new Elemento(65));
		arvore.adicionar(new Elemento(96));
		arvore.adicionar(new Elemento(24));
		System.out.println("======================================\n\n");

		
		System.out.println("Imprimindo Pré Ordem: ");
		arvore.imprimirPreOrdem();
		System.out.println("======================================\n\n");
		
		
		
		
		System.out.println("Imprimindo In Ordem: ");
		arvore.imprimirInOrdem();
		System.out.println("======================================\n\n");
		
		
		
		System.out.println("Imprimindo Pós Ordem: ");
		arvore.imprimirPosOrdem();
		System.out.println("======================================\n\n");
		
		


		
		
		
		
		
		
	}
}
