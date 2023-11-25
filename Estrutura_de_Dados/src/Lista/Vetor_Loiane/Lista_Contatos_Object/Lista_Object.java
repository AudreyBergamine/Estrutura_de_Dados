package Lista.Vetor_Loiane.Lista_Contatos_Object;

import javax.swing.JOptionPane;

public class Lista_Object {
	private Object[] elementos;
	private int tamanho;
	
	

	public Lista_Object(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	

	public int tamanho() {
		return this.tamanho;
	}
	
	
	public void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			Object[] elementosNovos = new Object[this.elementos.length*2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i]; // Copiando elementos da antiga lista(vetor)
			}
			this.elementos = elementosNovos; // Atribuindo o novo vetor no vetor existente
		}		
	}


	public boolean adiciona(Object elemento){
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) { // Se o tamanho for menor que a capacidade de elementos
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Vetor já está cheio! Não é possível adicionar + elementos!");
			return false;
		}	
	}
	
	
	public boolean adicionaNaPosicao(Integer posicao,Object elemento){
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		this.aumentaCapacidade();
		
		// Movendo todos os elementos
		for (int i = this.tamanho-1; i >= posicao; i--) { // Interando de trás para frente
			this.elementos[i+1] = this.elementos[i]; 
		}
		this.elementos[posicao] = elemento; // Adicionando elemento na posicao solicitada
		this.tamanho++;
		
		return true;
	}
	

	
	

	public Object buscaIndex(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		return this.elementos[posicao]; // Retorna o elemento que está na posição
	}

	
	
	

	public int buscaString(Object elemento) {
		for (int i = 0; i < this.tamanho; i++) {			
			if (this.elementos[i].equals(elemento)) {
				JOptionPane.showMessageDialog(null, "" + this.elementos[i] + " encontrado na posição: " + i);
				return i;
			}
			JOptionPane.showMessageDialog(null, "Elemento " + this.elementos[i] + " NÃO encontrado");
		}
		return -1;
	}
	
	public void removePosicao(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		//Movendo os elementos e substituindo elementos
		for (int i = posicao; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];			
		}
		this.tamanho--;
		JOptionPane.showMessageDialog(null, "Removido com Sucesso!");		
	}
	
	

	@Override
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
















	//	public void adiciona(String elemento) {
	//this.aumentaCapacidade();
	//	for (int i = 0; i < this.elementos.length; i++) {
	//		if (this.elementos[i]== null ) { // Se o elemento for nulo > adiciona elemento
	//			this.elementos[i]= elemento; // Atribuição do elemento
	//			break; // Para parar assim que encontrar a primeira posição nula > Frear o loop
	//		} 
	//	}
	//}

	//public void adiciona(String elemento) throws Exception {
	//this.aumentaCapacidade();
	//	if (this.tamanho < this.elementos.length) { // Se o tamanho for menor que a capacidade de elementos
	//		this.elementos[this.tamanho] = elemento;
	//		this.tamanho++;
	//	} else {
	//		throw new Exception("Vetor já está cheio! Não é possível adicionar + elementos!");
	//	}	
	//}

}


