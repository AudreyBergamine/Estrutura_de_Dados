package Lista.Ex_Jos.Livros;

public class TesteLivro {
	public static void main(String[] args) {
		ListaLivros lista1 = new ListaLivros(5);
		ListaLivros lista2 = new ListaLivros(5);
		
		lista1.adicionarLivro("IT a coisa");
		lista1.adicionarLivro("1984");
		lista1.adicionarLivro("Use a cabeça Java");
		lista1.adicionarLivro("O pequeno principe");
		lista1.adicionarLivro("Python é ruim");
		
		lista2.adicionarLivro("C#");
		lista2.adicionarLivro("C++");
		lista2.adicionarLivro("Java na veia");
		lista2.adicionarLivro("PHP");
		lista2.adicionarLivro("Python");
		
		System.out.println(lista1);
		System.out.println(lista1.pesquisarLivroJava()+"\n"); //Pesquisa se há o livro "Use a cabeça Java", se sim retorna a mensagem bom gosto.
		
		System.out.println(lista2);
		System.out.println(lista2.pesquisarLivroJava()); //Pesquisa se há o livro "Use a cabeça Java", se sim retorna a mensagem bom gosto.
		
	}
}

