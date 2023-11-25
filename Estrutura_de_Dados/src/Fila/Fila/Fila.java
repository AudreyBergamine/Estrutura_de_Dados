package Fila.Fila;

import javax.swing.JOptionPane;

public class Fila<T> {

	int inicio; // O primeiro a entrar, deve ser o primeiro a sair
	int fim; // O ultimo a entrar deve ser o ultimo a sair
	int tamanho;
	int qtdeElementos;
	T[] nomesAlunos;
	

	@SuppressWarnings("unchecked") 	// Para não dar problema no código que fiz
	public Fila() {
		inicio = fim = -1;
		tamanho = 100;
		nomesAlunos = (T[]) new Object[tamanho];
		qtdeElementos = 0;
	}

	public int tamanho() {
		return this.tamanho;
	}

	public boolean estaVazia() {
		if (qtdeElementos == 0) {
			return true;
		}
		return false;
	}

	public boolean estaCheia() {
		if (qtdeElementos == tamanho - 1) {
			return true;
		}
		return false;
	}

	public void adicionar(T elemento) {
		if (!estaCheia()) {
			if (inicio == -1) {
				inicio = 0;
			}
			fim++;
			nomesAlunos[fim] = elemento;
			qtdeElementos++;
		}
	}

	public void remover() {
		if (!estaVazia()) {
			inicio++; // [0  -  1  -  2  -  3  - 4.... ]
			qtdeElementos--;
		}
	}

	// Criar a função para ordenar String e mostrar ordenado
	private void ordenar() {
		for (int i = 0; i < qtdeElementos - 1; i++) { 			// Estou percorrendo os nomes 
	        for (int j = 0; j < qtdeElementos - i - 1; j++) {	// Para cada nome estou percorrendo os seus caracteres
	            String aluno1 = (String) nomesAlunos[j];
	            String aluno2 = (String) nomesAlunos[j + 1];

				// Vou verificar qual palavra tem o maior número de caracteres, e usar como referencia
				// Calculando a quantidade mínima de caracteres entre duas strings e armazenando na variável
				// A palavra 1 é < que palavra2 ?  A quantidade de caracteres da menor palavra vai ser atribuída na variável
	            int qtdMinCaracteres = aluno1.length() < aluno2.length() ? aluno1.length() : aluno2.length();
	            
				// Vou verifica se o valor da variável index é menor do que a quantidade mínima de caracteres
				// Para percorrer apenas o necessário
				// Comparando os caracteres e ignorando se é maiúscula ou minúscula.
	            int index = 0;
	            while (index < qtdMinCaracteres) { 			//  Vou percorrer os caracteres das palavras
	                char char1 = aluno1.charAt(index); 		// Aqui estou obtendo os caracteres do aluno 1
	                char char2 = aluno2.charAt(index); 	// Aqui estou obtendo os caracteres do aluno 2
	                
	                char char1Lower = Character.toLowerCase(char1); // Converti os caracteres para letras minúsculas
	                char char2Lower = Character.toLowerCase(char2); // Para fazer a comparação ignorando o case
	                
				// Lógica> Comparando Caracter por Caracter manualmente
				// 		A  u  d  r  e   y			> Inicia com a mesma letra, logo tenho que passar para o prox caracter
	            // 		A  m  a  n  d   a			> Como a segunda letra é diferente, agora consigo ver qual vem primeiro
				//  		0   1  2  3  4   5 				 
	                
	                // Se as letras forem igual eu pulo para a proxima letra, se forem diferentes entra no if
	                // Se o char do aluno1 for > que o aluno2 na ordem alfabética, realizo a troca dos nomes na fila
	                if (char1Lower != char2Lower) {
	                    // Fazendo a troca
	                    if (char1Lower > char2Lower) {
	                        T temp = nomesAlunos[j];
	                        nomesAlunos[j] = nomesAlunos[j + 1];
	                        nomesAlunos[j + 1] = temp;
	                    }
	                    break;  // Após a troca ou se os caracteres forem diferentes eu saio do while
	                }
	                // Se os caracteres forem iguais, passa para o próximo char
	                index++;
	            }
	        }
	    }
	}

		

		// Pesquisar um aluno na Fila
		public int buscaString(String elemento) {
			for (int i = 0; i < this.nomesAlunos.length; i++) {
				if (elemento.equalsIgnoreCase((String) this.nomesAlunos[i])) {
					JOptionPane.showMessageDialog(null, "" + elemento + " encontrado na posição: " + (i + 1));
					return i + 1;
				}
			}
			return -1;
		}

		public void mostrar() {
		    if (!estaVazia()) {
		        this.ordenar();
		        String s = "\n";
		        for (int i = inicio; i <= fim; i++) {
		            s += (i + 1) + " -  ";
		            s += nomesAlunos[i] + "\n";
		        }
		        // System.out.println(s);
		        JOptionPane.showMessageDialog(null, s);
		    } else {
		        JOptionPane.showMessageDialog(null, "A lista ainda está vazia! \n"
		        							+	"Adicione nomes de alunos usando a opção 1...\n");
		    }
		}
}


	//public void ordenar() {
	//    for (int i = 0; i < qtdeElementos - 1; i++) {
	//        for (int j = 0; j < qtdeElementos - i - 1; j++) {
	//            // Comparando as strings em ordem alfabética
	//            if (((String) dados[j]).compareToIgnoreCase((String) dados[j + 1]) > 0) { // Mesmo que equalsIgnoreCase
	//                // Troca os elementos
	//                T temp = dados[j];
	//                dados[j] = dados[j + 1];
	//                dados[j + 1] = temp;
	//            }
	//        }
	//    }
	//} 

