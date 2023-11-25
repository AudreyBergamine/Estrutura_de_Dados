package Fila.Curso_Guarinos;

public class Program {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adicionar("Jão");
		fila.adicionar("Zé");
		fila.adicionar("Juca");
		fila.adicionar("Maria");
		fila.adicionar("Ana");
		System.out.println("Primeiro da Fila: " + fila.get());
		
		fila.remover();
		System.out.println("Novo Primeiro da Fila: " + fila.get());

		
		
		fila.remover();
		System.out.println("Novo Primeiro da Fila: " + fila.get());
	}

}
