package Fila.Fila_Loiane;

public class y_Aula21 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileira(3);
		fila.enfileira(1);
		fila.enfileira(2);

		System.out.println(fila.espiar());
		
		System.out.println(fila.toString());
	}

}