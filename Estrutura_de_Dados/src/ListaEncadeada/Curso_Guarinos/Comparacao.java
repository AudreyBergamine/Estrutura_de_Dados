package ListaEncadeada.Curso_Guarinos;

import java.util.ArrayList;

public class Comparacao {

	public static void main(String[] args) {
		LL_Generics<Integer> listaLigadaGenerics = new LL_Generics<Integer>();
		ArrayList<Integer> vetorArrayList = new ArrayList<Integer>();

		IteratorListaLigada<Integer> iterator = listaLigadaGenerics.getIterator();

		int limite = 100;
		long tempoInicialArray = System.currentTimeMillis();

		// ADICIONAR ELEMENTOS AO ARRAYLIST
		System.out.println("======= TESTANDO ArrayList ================= ");
		for (int i = 0; i < limite; i++) {
			vetorArrayList.add(i);
		}
		long tempoFinalArray = System.currentTimeMillis();
		System.out.println("Adicionou " + limite + " elementos no vetor ArrayList");
		System.out.println("Tempo ArrayList: " + (tempoFinalArray - tempoInicialArray) + " mili segundos \n");

		// ADICIONAR ELEMENTOS À LISTA LIGADA
		long tempoInicialLista = System.currentTimeMillis();
		System.out.println("======= TESTANDO ListaLigada/Encadeada ==== ");
		for (int i = 0; i < limite; i++) {
			listaLigadaGenerics.adicionar(i);
		}
		long tempoFinalLista = System.currentTimeMillis();
		System.out.println("Adicionou " + limite + " elementos na Lista Ligada");
		System.out.println("Tempo Lista Ligada: " + (tempoFinalLista - tempoInicialLista) + " mili segundos \n");

		// LER ELEMENTOS DO ARRAYLIST
		System.out.println("======= TESTANDO ArrayList ================= ");
		for (int i = 0; i < vetorArrayList.size(); i++) {
			vetorArrayList.get(i);
		}
		long tempoFinalLeituraArray = System.currentTimeMillis();
		System.out.println("Lendo " + limite + " elementos no vetor ArrayList");
		System.out.println("Tempo ArrayList: " + (tempoFinalLeituraArray - tempoInicialArray) + " mili segundos \n");

		// LER ELEMENTOS DA LISTA LIGADA USANDO WHILE
		System.out.println("======= TESTANDO ListaLigada/Encadeada ==== ");		
		while (iterator.temProximo()) {
		    Elemento_Generics<Integer> proximoElemento = iterator.getProximo();
		    // Faça algo com proximoElemento, como imprimir seu valor
		    System.out.println(proximoElemento.getValor());
		}		
		long tempoFinalLeituraLista = System.currentTimeMillis();
		System.out.println("Lendo " + limite + " elementos na Lista Ligada");
		System.out.println("Tempo Lista Ligada: " + (tempoFinalLeituraLista - tempoInicialLista) + " mili segundos \n");





		// LER ELEMENTOS DA LISTA LIGADA USANDO FOR (Mais lento)
//		System.out.println("======= TESTANDO ListaLigada/Encadeada ==== ");
//		for (int i = 0; i < listaLigadaGenerics.getTamanho(); i++) {
//			listaLigadaGenerics.get(i);	// Não quero imprimir, apenas executar e ver o tempo de execução	
//		}
//		long tempoFinalLeituraLista = System.currentTimeMillis();
//		System.out.println("Lendo " + limite + " elementos na Lista Ligada");
//		System.out.println("Tempo Lista Ligada: " + (tempoFinalLeituraLista - tempoInicialLista) + " segundos \n");

	}
}
