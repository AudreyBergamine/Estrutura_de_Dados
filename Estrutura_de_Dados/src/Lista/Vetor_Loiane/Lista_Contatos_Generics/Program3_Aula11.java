package Lista.Vetor_Loiane.Lista_Contatos_Generics;

public class Program3_Aula11 {

	public static void main(String[] args) {
		Lista<Contato> lista = new Lista<Contato>(5);

		Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");

		lista.adiciona(c1);
		
		lista.toString();
	}

}