package ListaEncadeada.Curso_Guarinos.LL_Double;

import ListaEncadeada.Curso_Guarinos.LL_Generics;

public class ProgramaDouble {

	public static void main(String[] args) {
		LL_Generics<Double> numeros = new LL_Generics<Double>();
		
		numeros.adicionar(3.2);
		numeros.adicionar(4.4);
		numeros.adicionar(5.5);
		
		
		for (int i = 0; i < numeros.getTamanho(); i++) {
			System.out.println(numeros.get(i).getValor());
		}
		
		System.out.println("Tamanho: " + numeros.getTamanho());
		
		
		
		

	}
}
