package Pilha._Model_Pilha_Loiane;

import _Estrutura_Estatica.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> { // Estrutura Estática > Arquivo na pasta _Estrutura_Estatica
	
	public Pilha(){
		super();
	}
	
	public Pilha(int capacidade){
		super(capacidade);
	}
	
	public void empilha(T elemento){
		super.adiciona(elemento);
	}
	
	public T topo(){
		
		if (this.estaVazia()){
			return null;
		} 
		
		return this.elementos[tamanho-1];
	}
	
	
	
	public T desempilha(){
		
		if (this.estaVazia()){
			return null;
		}
		
		/*T elemento = this.elementos[tamanho-1];
		tamanho--;
		
		return elemento;*/
		
		return this.elementos[--tamanho];
	}
	
	public String toString() {
	    if (estaVazia()) {
	        return "[]"; // Pilha Vazia
	    }
	    String s = "";
	    for (int i = tamanho - 1; i >= 0; i--) {
	        s += elementos[i];
	        if (i > 0) {
	            s += ", ";
	        }
	    }
	    return s;
	}
		
}