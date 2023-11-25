package Pilha._Model_Pilha_Loiane;
/*
 Escreva um programa para verificar  se uma expressão matemática tem os parênteses agrupados de forma correta, isto é:
 (1) Se o nº de parênteses á esquerda e a direita são iguais e;
 (2) Se todo parêntese aberto é seguido posteriormente por um fechamento de parêntese.
 Veja alguns exemplos: 
 - As expressões ((A+B) ou A+B(violam a condição 1
 - As expressões )A+B(-C ou (A+B)) - (C + D violam a condição 2
 - A expressão ((A+B)+D) está ok
 */

public class Exer06 { // Desafio dos símbolos balanceados
	
	// Vamos verificar se todo parêntese que foi aberto, foi fechado na expressão... Exemplo: Calculadora Científica

	public static void main(String[] args) {
		
		imprimeResultado("A + B"); // True
		imprimeResultado("A + B + (C - D)"); // True
		imprimeResultado("{[()]}[](){()}"); // True
		imprimeResultado("{[(]}[](){()}"); // False
		imprimeResultado("A + B + C - D)"); // False
	}
	
	public static void imprimeResultado(String expressao){
		System.out.println(expressao + "  está balanceado?  " + 
				verificaSimbolosBalanceados(expressao));
	}
	
	// CRIANDO CONSTANTES >  (CONSTANTES SÃO EM LETRAS MAIÚSCULAS)
	final static String ABRE = "([{<"; 
	final static String FECHA = ")]}>";

	public static boolean verificaSimbolosBalanceados(String expressao){
		
		Pilha<Character> pilha = new Pilha<Character>();
		int index = 0;
		char simbolo, topo;
		
		while (index < expressao.length()){
			simbolo = expressao.charAt(index);
			
			// Se for um caracter que abre... 
			// Se existe simbolo, empilha
			if (ABRE.indexOf(simbolo) > -1){ // indexOf > metodo da classe String (Array de caracteres)
				pilha.empilha(simbolo);
			
			// Se o caracter for um caracter que fecha...
			// Se existe simbolo, vai desempilhar se não estiver vazia
			} else if (FECHA.indexOf(simbolo) > -1){
				
				if (pilha.estaVazia()){ // Se a pilha estiver vazia, não está balanceado
					return false;
				} else {
					topo = pilha.desempilha(); // Se não estiver vazia, vai desempilhar...
					
					
					// Verificando se os simbolos de ABRE e FECHA são diferentes, se for diferente, está desbalanceado
					// Se forem iguais > Estão balanceados...
					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
						return false; //>>> Significa que está desbaçanceado
					}
				}
			}			
			index++;
		}		
		return pilha.estaVazia();
	}
}