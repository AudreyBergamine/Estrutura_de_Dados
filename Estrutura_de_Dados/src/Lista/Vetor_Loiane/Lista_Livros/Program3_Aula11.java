package Lista.Vetor_Loiane.Lista_Livros;

public class Program3_Aula11 {

	public static void main(String[] args) {
		Lista<Livros> lista = new Lista<Livros>(5);

		Livros c1 = new Livros("Contato 1", "1234-4567", "contato1@email.com");

		lista.adiciona(c1);
		
		lista.toString();
	}

}