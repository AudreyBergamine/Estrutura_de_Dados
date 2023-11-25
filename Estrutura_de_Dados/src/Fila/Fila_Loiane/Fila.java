package Fila.Fila_Loiane;

import _Estrutura_Estatica.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{ // FIFO (First In, First Out). 

	public Fila(){
		super(); // Atributos da Estrutura Estática
	}
	
	
	public Fila(int capacidade){
		super(capacidade);
	}
	
	
	public void enfileira(T elemento){
		//this.elementos[this.tamanho] = elemento;
		//this.tamanho++;		
		//this.elementos[this.tamanho++] = elemento;
		this.adiciona(elemento); // Método da Super Classe Estrutura Estática	
	}
	
	
	public T espiar(){ // peek inicio		
		if (this.estaVazia()){ // Método da Super Classe Estrutura Estática	
			return null;
		}		
		return this.elementos[0];
	}
	
	
	
	public T desenfileira(){		
		final int POS = 0;		
		if (this.estaVazia()){
			return null;
		}		
		T elementoASerRemovido = this.elementos[POS];		
		this.remove(POS);	// Método da Super Classe Estrutura Estática	
		return elementoASerRemovido;		
	}
}
