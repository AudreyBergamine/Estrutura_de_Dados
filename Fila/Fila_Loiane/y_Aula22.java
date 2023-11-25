package Fila.Fila_Loiane;

public class y_Aula22 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<>();

		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		System.out.println("Fila Atual: " + fila+ "\n ===========================\n\n");

		
		System.out.println("Desenfileirando: " + fila.desenfileira() + "\n");
		System.out.println("Fila Atual: " + fila+ "\n ===========================\n\n");

		
		System.out.println("Desenfileirando: " +fila.desenfileira() + "\n");
		System.out.println("Fila Atual: " + fila+ "\n ===========================\n\n");

		
		System.out.println("Desenfileirando: " +fila.desenfileira() + "\n");
		System.out.println("Fila Atual: " + fila+ "\n ===========================\n\n");
	}

}