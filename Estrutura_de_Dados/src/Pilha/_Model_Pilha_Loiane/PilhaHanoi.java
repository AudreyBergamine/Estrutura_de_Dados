package Pilha._Model_Pilha_Loiane;

public class PilhaHanoi<T> extends EstruturaEstatica<T> { 
	public PilhaHanoi(){
		super();
	}
	
	public PilhaHanoi(int capacidade){
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
}