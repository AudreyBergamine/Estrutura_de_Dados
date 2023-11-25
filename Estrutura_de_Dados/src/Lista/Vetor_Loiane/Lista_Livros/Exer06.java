package Lista.Vetor_Loiane.Lista_Livros;

// Não consegui fazer usando o JOptionPane... =/ 

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		//criação das variáveis
		Scanner scan = new Scanner(System.in);

		//criar vetor com 20 de capacidade
		Lista<Livros> lista = new Lista<Livros>(20);

		//criar e adicionar X contatos
		criarLivrosDinamicamente(5, lista);

		//criar um menu para que o usuário escolha a opção
		int opcao = 1;

		while (opcao != 0){

			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1:
				adicionarLivroNoFinal(scan, lista);
				break;
			case 2:
				adicionarLivroPosicao(scan, lista);
				break;
			case 3: 
				obtemLivroPosicao(scan, lista);
				break;
			case 4: 
				obtemLivro(scan, lista);
				break;
			case 5: 
				pesquisarUltimoIndice(scan, lista);
				break;
			case 6: 
				pesquisarLivroExiste(scan, lista);
				break;	
			case 7: 
				excluirPorPosicao(scan, lista);
				break;	
			case 8: 
				excluirLivro(scan, lista);
				break;	
			case 9:
				imprimeTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;	
			default:
				break;
			}
		}

		System.out.println("Usuário digitou 0, programa terminado");
	}
	
	private static void imprimirVetor(Lista<Livros> lista){

		System.out.println(lista);
	}

	private static void limparVetor(Lista<Livros> lista){

		lista.limpar();
		
		System.out.println("Todos os contatos do vetor foram excluídos");
	}

	private static void imprimeTamanhoVetor(Lista<Livros> lista){

		System.out.println("Tamanho do vetor é de: " + lista.tamanho());
	}

	private static void excluirPorPosicao(Scanner scan, Lista<Livros> lista){

		int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

		try {

			lista.remove(pos);

			System.out.println("Livro excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void excluirLivro(Scanner scan, Lista<Livros> lista){

		int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

		try {

			Livros livro = lista.busca(pos);

			lista.remove(livro);

			System.out.println("Livro excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void pesquisarLivroExiste(Scanner scan, Lista<Livros> lista){

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

		try {

			Livros livro = lista.busca(pos);

			boolean existe = lista.contem(livro);

			if (existe){
				System.out.println("Livro, seguem dados:");
				System.out.println(livro);
			} else {
				System.out.println("Livro não existe");
			}

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void pesquisarUltimoIndice(Scanner scan, Lista<Livros> lista){

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

		try {

			Livros livro = lista.busca(pos);

			System.out.println("Livro existe, seguem dados:");
			System.out.println(livro);

			System.out.println("Fazendo pesquisa do último índice do livro encontrado:");
			pos = lista.ultimoIndice(livro);

			System.out.println("Livro encontrado na posição " + pos);

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemLivro(Scanner scan, Lista<Livros> lista){

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

		try {

			Livros livro = lista.busca(pos);

			System.out.println("Livro existe, seguem dados:");
			System.out.println(livro);

			System.out.println("Fazendo pesquisa do livro encontrado:");
			pos = lista.busca(livro);

			System.out.println("Livro encontrado na posição " + pos);

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemLivroPosicao(Scanner scan, Lista<Livros> lista){

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

		try {

			Livros contato = lista.busca(pos);

			System.out.println("Livro existe, seguem dados:");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void adicionarLivroNoFinal(Scanner scan, Lista<Livros> lista){

		System.out.println("Criando um livro, entre com as informações:");
		String nome = leInformacao("Entre com o nome do livro: ", scan);
		String nome_Autor = leInformacao("Entre com o nome do Autor: ", scan);
		String isbn = leInformacao("Entre com o ISBN: ", scan);

		Livros livro = new Livros(nome, nome_Autor, isbn);

		lista.adiciona(livro);

		System.out.println("Livro adicionado com sucesso!");
		System.out.println(livro);
	}

	private static void adicionarLivroPosicao(Scanner scan, Lista<Livros> lista){

		System.out.println("Criando um livro, entre com as informações:");
		String nome = leInformacao("Entre com o nome do livro: ", scan);
		String nome_Autor = leInformacao("Entre com o nome do Autor: ", scan);
		String isbn = leInformacao("Entre com o ISBN: ", scan);

		Livros livro = new Livros(nome, nome_Autor, isbn);

		int pos = leInformacaoInt("Entre com a posição a adicionar o livro: ", scan);

		try {
			lista.adiciona(pos, livro);

			System.out.println("Livro adicionado com sucesso!");
			System.out.println(livro);

		} catch (Exception e){
			System.out.println("Posição inválida, livro não adicionado");
		}
	}

	protected static String leInformacao(String msg, Scanner scan){

		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	protected static int leInformacaoInt(String msg, Scanner scan){

		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida){

			try {

				System.out.println(msg);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;

			} catch (Exception e){
				System.out.println("Entrada inválida, digite novamente");
			}
		}

		return num;
	}

	protected static int obterOpcaoMenu(Scanner scan){

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida){

			System.out.println("Digite a opção desejada:");
			System.out.println("1: Adiciona livro no final do vetor");
			System.out.println("2: Adiciona livro em uma posição específica");
			System.out.println("3: Obtém livro de uma posição específica");
			System.out.println("4: Consulta livro");
			System.out.println("5: Consulta último índide do livro");
			System.out.println("6: Verifica se livro existe");
			System.out.println("7: Excluir por posição");
			System.out.println("8: Excluir livro");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os livros do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");

			try {

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 11){
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e){

				System.out.println("Entrada inválida, digite novamente\n\n");
			}
		}

		return opcao;
	}

	protected static void criarLivrosDinamicamente(int quantidade, Lista<Livros> lista){

		Livros livro;

		for (int i=1; i<=quantidade; i++){

			livro = new Livros();
			livro.setNome_Livro("Livro " + i);
			livro.setNome_Autor("Ciclano "+i);
			livro.setISBN("1000"+i+"");

			lista.adiciona(livro);
		}
	}
}