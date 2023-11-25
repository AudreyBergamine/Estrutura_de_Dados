package Pilha._Model_Pilha_Loiane;

public class Exer05 { // É palindromo? 

	public static void main(String[] args) {
		
		fazerTestePalindromo("ADA"); // True
		
		fazerTestePalindromo("ABCD"); // False
		
		fazerTestePalindromo("ABCCBA"); // True
		
		fazerTestePalindromo("Maria"); // False
	}
	
	public static void fazerTestePalindromo(String palavra){
		System.out.println(palavra + " é palindromo?   >   " + ehPalindromo(palavra));
	}

	
	public static boolean ehPalindromo(String palavra){		
		Pilha<Character> pilha = new Pilha<Character>(); 		
		for (int i=0; i<palavra.length(); i++){
			pilha.empilha(palavra.charAt(i)); // Caracter na posição i
		}		
		String palavraInversa = "";
		while (!pilha.estaVazia()){
			palavraInversa += pilha.desempilha();
		}		
		if (palavraInversa.equalsIgnoreCase(palavra)){
			return true;
		}		
		return false;
	}
}