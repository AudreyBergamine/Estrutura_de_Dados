package Fila.ED_Fila;

public class Fila<T> {
	
	int inicio;
	int fim;
	int tamanho;
	int qtdeElementos;
	T[] dados;
	
	@SuppressWarnings("unchecked")
	public Fila() {
		inicio = fim = -1;
		tamanho = 100;
		dados = (T[]) new Object[tamanho];
		qtdeElementos = 0;
	}
	
	public boolean estaVazia() {
		if(qtdeElementos == 0){
			return true;
		}
		return false;
	}
	
	public boolean estaCheia() {
		if(qtdeElementos == tamanho -1) {
			return true;
		}
		return false;
	}
	
	public void adicionar(T elemento) {
		if(!estaCheia()) {
			if(inicio == -1) {
				inicio = 0;
			}
			fim++;
			dados[fim]=elemento;
			qtdeElementos++;
		}
	}
	
	public void remover() {
		if(!estaVazia() ) {
			inicio++;
			qtdeElementos--;
		}
	}
	
	public void mostrar() {
		if(!estaVazia() ) {
		String elementos = "";
		for(int i = inicio; i<=fim; i++) {
			elementos += dados[i]+ " - ";
		}
		System.out.println(elementos);
		}		
	}
}