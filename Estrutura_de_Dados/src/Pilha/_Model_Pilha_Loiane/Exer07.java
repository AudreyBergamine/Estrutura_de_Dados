package Pilha._Model_Pilha_Loiane;

//import java.util.Stack;

// DESAFIO DA CONVERSÃO DECIMAL-BINÁRIO
// Usando a classe Pilha ou Stack, desenvolva um algoritmo que faça a conversão de números decimais para binários

public class Exer07 {

	public static void main(String[] args) {

		imprimeResultado(2); // 10

		imprimeResultado(4); // 100

		imprimeResultado(10); // 1010

		imprimeResultado(25); // 11001

		imprimeResultado(10035); // 10011100110011

		imprimeResultadoQualquerBase(25, 16); // 25 na base 16: 19

		imprimeResultadoQualquerBase(10035, 8); // 10035 na base 8 é: 23463

		imprimeResultadoQualquerBase(10035, 16); // 10035 na base 16 é: 2733

	}
	
	

	public static void imprimeResultado(int numero) {
		System.out.println(numero + " em binário é: " + decimalBinario(numero));
	}
	
	

	public static void imprimeResultadoQualquerBase(int numero, int base) {
		System.out.println(numero + " na base " + base +
				" é: " + decimalQualquerBase(numero, base));
	}
	
	

	public static String decimalBinario(int numero) {
		Pilha<Integer> pilha = new Pilha<>();
		String numBinario = "";
		int resto;

		while (numero > 0) {
			resto = numero % 2;
			pilha.empilha(resto);
			numero /= 2;
		}
		while (!pilha.estaVazia()) {
			numBinario += pilha.desempilha();
		}
		return numBinario;
	}
	
	
	

	public static String decimalQualquerBase(int numero, int base) {
		if (base > 16) {
			throw new IllegalArgumentException();
		}

		Pilha<Integer> pilha = new Pilha<>();
		String numBase = "";
		int resto;
		String bases = "0123456789ABCDEF";

		while (numero > 0) {
			resto = numero % base;
			pilha.empilha(resto);
			numero /= base;
		}

		while (!pilha.estaVazia()) {
			numBase += bases.charAt(pilha.desempilha());
		}
		return numBase;
	}
}