package Pilha.Ativ_Pilha_Ex_03;

import javax.swing.JOptionPane;

public class Pilha_Int {
	private int topo;
	private int tamanho;
	private int [] pilha;
	
	
	public int[] getPilha() {
		return pilha;
	}

	public void setPilha(int[] pilha) {
		this.pilha = pilha;
	}

	public int getTopo() {
		return topo;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}

	public int getTamanho() { 
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public Pilha_Int(int tamanho) {
		this.topo = -1;
		this.tamanho = tamanho;
		this.pilha = new int[tamanho]; 
		// (T[]) new Object[tamanho]; // Solução do livro (Vídeo Loiane)
	} 
		
	public boolean cheia() {
		return(topo == (pilha.length-1));
	}
	
	public boolean vazia() {
		return(topo ==-1);
	}
		
	public boolean empilhar(int elemento) { 
		if(!cheia()) { // Verificar se está cheia, se não estiver cheia, vai empilhar
			this.topo++;
			pilha[topo] = elemento;
			//JOptionPane.showMessageDialog(null, "Elemento empilhado!");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "A pilha está cheia");
			return false;
		}
	}
	
	public boolean desempilhar(int elemento) { // Método pop
	    @SuppressWarnings("unused")
		int valor = -1;
	    if (!vazia()) { // Verifica se a pilha não está vazia
	        valor = pilha[topo]; // Obtém o valor do topo da pilha
	        pilha[topo] = 0; // Limpa o valor do topo
	        topo--; // Atualiza o topo da pilha
	        return true;
	    } else {
	        JOptionPane.showMessageDialog(null, "A pilha está vazia");
	        return false;
	    }
	}
	
	
	public String toString() {
	    if (vazia()) {
	        return "Pilha vazia";
	    }
	    String s = "";
	    for (int i = topo; i >= 0; i--) {
	        s += pilha[i];
	        if (i > 0) {
	            s += "\n ";
	        }
	    }
	    return s;
	}
}