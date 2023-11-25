package Pilha.Curso_Guarinos;

public class Program {

	public static void main(String[] args) {
		Pilha_Com_ListaLigada pilha = new Pilha_Com_ListaLigada();
		
		pilha.adicionar("E");
		pilha.adicionar("B");
		pilha.adicionar("Z");
		pilha.adicionar("D");
		pilha.adicionar("C");
		System.out.println("Topo: " + pilha.get());
		
		
		
		pilha.remover();
		System.out.println("Novo Topo: " + pilha.get());
		
		
		pilha.remover();
		System.out.println("Novo Topo: " + pilha.get());

	}

}
