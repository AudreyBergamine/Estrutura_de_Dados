package Lista.Vetor_Loiane.Lista_Livros;

public class Program2_Aula10 {

	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(3);

		Livros c1 = new Livros("Contato 1", "1234-4567", "contato1@email.com");
		Livros c2 = new Livros("Contato 2", "2345-6789", "contato2@email.com");
		Livros c3 = new Livros("Contato 3", "3456-7890", "contato3@email.com");
		
		Livros c4 = new Livros("Contato 1", "1234-4567", "contato1@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if (pos > -1){
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
	}

}
