package Recursividade;

public class Fatorial {

	// Fatorial (Multiplicação)
	public int fatorialRecursivo(int numero) {
		if (numero == 0){
			return 1;
		} else {
			return numero*fatorialRecursivo(numero-1);
		}
	}

	public int fatorialSoma(int numero) {
		if (numero == 0){
			return 0;
		} else {
			return numero + fatorialSoma(numero-1);
		}
	}
	//	public int somar(int valor) {
	//	if (valor == 0) {
	//	return 0;
	//	} else return somar(valor-1) + valor;
	//	}


	public static int metodoB(int n, int m) { // (5,1)
		if (m > n) {	
			return 0;
		}
		if (m == n) { 
			return n;
		}
		return (metodoB( n - 1, m + 1 ) + ( n + m )); 
	}

	//					    ( n - 1, m + 1) + ( n + m)
	// 					  ( 5 - 1, 1 + 1) + ( 5 + 1 )
	//							( 4, 2 ) 	+ 	(6)
	// chama metodoB( 4, 2 ) + ( n + m )); 

	//						Agora n vale 4 e m vale 2
	//					     ( n - 1, m + 1) + ( n + m )
	//						  ( 4 - 1, 2 + 1 ) + ( 4 + 2 )
	//								( 3, 3 )	+ 	( 6 )      
	//						Agora n vale 3 e m vale 3  (  (3,3): n == m) São iguais, então entra no 2o if e retorna n = 3, agora soma o restante...)
	//							 n = (3)	+   (6	)  =	  retorna 9 

	// 			logo metodoB( 4, 2 )  = 9 

	//				metodoB(5,1) --> chama metodoB( 4, 2 = retorna 9)  + 	(6)  =  logo 9 + 6 = retorna 15
	//				metodoB(4,2) --> chama metodoB( 3, 3 = retorna 3) 	+ 	(6)  = 9    
	//				metodoB(3,3) = 3
	//				


	public static int metodoA(int n) { 
		if (n == 1) {	
			return 1;
		}
		return (metodoA( n - 1) + n); 		
	} 

	// 	medotoA(5):
	//		5 > 1 logo:
	// 	metodoA(5 - 1) + 5)
	//						((4)	+ 5)							metodoA(4) = 10 	+ 5 	= 15
	//		metodoA(4):
	//		4 > 1 logo:
	// 	metodoA(4 - 1) + 4)
	//						((3)	+ 4)							metodoA(3) = 6 	+ 4 	= 10
	//		metodoA(3):
	//		3 > 1 logo:
	// 	metodoA(3 - 1) + 3)
	//						((2)	+ 3)							metodoA(2) = 3 	+ 3 	= 6
	//		metodoA(2):
	//		2 > 1 logo:
	// 	metodoA(2 - 1) + 2)
	//						((1)	+ 2)							metodoA(1) = 1 		+ 2 	= 3
	//		metodoA(1):
	// 	retorna 1





	// Calcula a soma dos elementos positivos do array  v até o índice n-1.
	public static int f (int[] v, int n) { 
		if (n == 0) { // Caso Base
			return 0;
		} else {
			int s = f(v, n-1);
			if (v[n-1] > 0)
				s = s + v[n - 1];
			return s;
		}
	}
	/* EXPLICAÇÃO f(v,6) onde  int [] v = {2, -4, 7, 0, -1, 4}: 
A função f recebe um array v e um inteiro n como argumentos. Ela calcula a soma dos elementos positivos do array v até o índice n-1.

Aqui está como o cálculo ocorre para o array v fornecido {2, -4, 7, 0, -1, 4} e n = 6 (tamanho do array):

1 - Primeira chamada: f(v, 6)
n não é igual a 0, então calculamos s = f(v, 5).

2 - Segunda chamada: f(v, 5)
n não é igual a 0, então calculamos s = f(v, 4).

3 - Terceira chamada: f(v, 4)
n não é igual a 0, então calculamos s = f(v, 3).

4 - Quarta chamada: f(v, 3)
n não é igual a 0, então calculamos s = f(v, 2).

5 - Quinta chamada: f(v, 2)
n não é igual a 0, então calculamos s = f(v, 1).

6 - Sexta chamada: f(v, 1)
n não é igual a 0, então calculamos s = f(v, 0).

7 - Sétima chamada: f(v, 0)

Agora n é igual a 0, então retornamos 0, como especificado na base da recursão.
Agora, a função começa a retornar valores para as chamadas anteriores:

1 - s em f(v, 1) recebe 0 (resultado da chamada 7) porque v[0] é negativo.

2 - s em f(v, 2) recebe 0 (resultado da chamada 6) porque v[1] é negativo.

3 - s em f(v, 3) recebe 0 (resultado da chamada 5) porque v[2] é positivo, mas não é adicionado, já que é zero.

4 - s em f(v, 4) recebe 0 (resultado da chamada 4) porque v[3] é zero.

5 - s em f(v, 5) recebe 0 (resultado da chamada 3) porque v[4] é negativo.

6 - s em f(v, 6) recebe 7 (resultado da chamada 2) porque v[5] é positivo e é adicionado ao resultado acumulado.

Assim, o resultado final da função é 7, e a saída do programa será "Resultado: 7". A função f soma os elementos positivos do array v até o índice 5.

	 */

	public int calculaFatorial (int num) { 
		int total = 1;
		for ( int i = num; i > 1; i--) {
			total *= i;
		}
		return total;
	}

	public static int somar(int posicao, int[] vetor) {   // [3,    5,   10,    2,   20]						somar(20, 4, vetor)   (20 + 20 = 40)
		int soma = 0;										    	// index 0  -  1   - 2  -  3  -  4						somar(18, 3, vetor)    (18 + 2 = 20)
		if ( posicao < vetor.length) {								//											        		somar(8, 2, vetor)     (8 + 10 = 18)
			soma = soma + vetor[posicao];						//											        		somar(3, 1, vetor)      (3 + 5 = 8)
			return somar(posicao + 1, vetor);					//											        		somar(0, 0, vetor)      (0 + 3 = 3)
		} else {
			return soma;
		}
	}

    public static void dec2Bin(int n) {
    	String s = "  ";
    	
        // Base case: quando n é 0, paramos a recursão
        if (n == 0) {
            return;
        }
        // Chamamos a função recursivamente com o quociente de n dividido por 2
     // Encontrando o proximo número enquando for != de 0
        dec2Bin(n / 2); 		// Empilha (n=12)					Imprime desempilhando
										// 1   Divide por 2 = 0    		  resta 1 
										// 3   Divide por 2 = 1     		  resta 1
										// 6   Divide por 2 = 3   		  resta 0
        								// 12  Divide por 2 = 6  		  resta 0
        
        
        s += "    " +  (n % 2);  //  Desempilha:    1   -   1    -    0    -    0 
        // Imprimimos o resto, que é o próximo dígito binário
        System.out.print(s);
        // ou System.out.print(n % 2);
    }

    public static void main(String[] args) {
        int decimalNumber = 12;
        System.out.print("Representação binária de " + decimalNumber + " é: ");
        dec2Bin(decimalNumber);
    }
    
    /*    Por exemplo: dec2Bin(12);																				Pilha
			12 / 2 = 6, resto 0 (1º dígito da direita para esquerda),							 1      	1     Imprime 1º
			6 / 2 = 3, resto 0 (2º dígito da direita para esquerda),							     3	        1     Imprime 2º
			3 / 2 = 1 resto 1 (3º dígito da direita para esquerda),			      			     6 	    0     Imprime 3º
			1 / 2 = 0 resto 1 (4º dígito da direita para esquerda).			      			    12 	    0     Imprime 4º
			Resultado: 12 = 1100 (Imprimindo a pilha retirando os num de cima)
     
     */
	

}
