package Lista.ED_Lista_Int;

import java.util.Arrays;

// Pilha de Livros

public class Lista_Inteiros {

	private int numElementos;
	private int tamanho;
	int [] dados;
	public String[] elementos;

	Lista_Inteiros(int numElementos) {  // construtor que recebe o numero de elemento
		this.numElementos = numElementos;
		this.iniciar(numElementos);

	}

	private void iniciar(int numElementos) {
		dados =new int[numElementos];
	}

	private void aumentarElemento() {
		numElementos = numElementos*2;
		int [] auxiliar = dados;
		this.dados = new int[numElementos];
		this.dados = Arrays.copyOf(auxiliar, numElementos);
	}

	public void adicionar(int n) {
		if (this.tamanho >= this.numElementos) {
			this.aumentarElemento();
		}
		dados[tamanho] = n;
		tamanho++;
	}

	public void adicionar(int posicao, int n) {
		if (posicao <= tamanho && posicao >= 0) {
			if (this.tamanho >=this.numElementos) {
				this.aumentarElemento();

			}

			for (int i = tamanho; posicao <i;i--) {
				dados[i] = dados[i-1];
			}
			dados[posicao] = n;
			tamanho++;
		}

	}


	public boolean remover() {

		if (this.tamanho < this.numElementos && this.tamanho >0) {
			dados[tamanho - 1] = 0;
			tamanho--;
			return true;
		}
		return false;
		
	}
	
	public int procurar(int n) {
		int i;
		for (i =0; i <tamanho && dados[i] != n; i++) {
			
		}
		
		if (dados[i] == n)
			return i;
		else
			return -1;
	}
	
	public void imprimir () {
		
		System.out.println("\\n[");
		for (int i=0; i <tamanho; i++) {
			System.out.println(dados[i]);
			if (i < tamanho - 1)
				System.out.println(", ");
		}
		System.out.println("]\\n");
	}
	
	public int getNumElementos() {
		return numElementos;
	}
	public int getTamanho() {
		return tamanho;
	}
}
		
	






