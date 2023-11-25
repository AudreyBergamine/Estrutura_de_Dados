package _Estrutura_Estatica;

import javax.swing.JOptionPane;

// Estrutura Estática da Loiane

public class EstruturaEstatica<T> {
	protected T[] elementos; 
	protected int tamanho;

	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade){
		this.elementos = (T[]) new Object[capacidade]; //solução do livro effective Java
		this.tamanho = 0;
	}

	public EstruturaEstatica(){
		this(10);
	}

	public boolean estaVazia(){
		return this.tamanho == 0;
	}

	// Adiciona no Final
	protected boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}
	
	

	protected boolean adiciona(int posicao, T elemento){
		if (posicao < 0 || posicao > tamanho){
			throw new IllegalArgumentException("Posição inválida");
		}
		this.aumentaCapacidade();
		//mover todos os elementos
		for (int i=this.tamanho-1; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}
	
	

	protected void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao inválida");
		}
		for (int i=posicao; i<tamanho-1; i++){
			elementos[i] = elementos[i+1];
		}
		tamanho--;
	}
	
	

	@SuppressWarnings("unchecked")
	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	

	public int tamanho(){
		return this.tamanho;
	}
	
	

	public String toString() {
		String s = " \n";
		s += "";

		for (int i = 0; i < this.tamanho - 1; i++) {
			s += this.elementos[i];
			s += "\n";
		}
		if (this.tamanho > 0) {
			s += this.elementos[this.tamanho - 1];
		}
		s += "";
		JOptionPane.showMessageDialog(null, s);
		return s;
	}
}

