package ListaEncadeada.Curso_Guarinos.LL_Inteiros;

import ListaEncadeada.Curso_Guarinos.LL_Generics;

public class ProgramaInteiros {

	public static void main(String[] args) {
		LL_Generics<Integer> numeros = new LL_Generics<Integer>();
		
		numeros.adicionar(3);
		numeros.adicionar(4);
		numeros.adicionar(5);
		
		
		for (int i = 0; i < numeros.getTamanho(); i++) {
			System.out.println(numeros.get(i).getValor());
		}
		
		System.out.println("Tamanho: " + numeros.getTamanho());
		
		
		
		

	}
}
