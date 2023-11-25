package Pilha.Ativ_Pilha_Ex_01;

import javax.swing.JOptionPane;

public class Pilha_Peca {
	private int topo;
	private int tamanho;
	private String [] pilha;
	
	
	public String[] getPilha() {
		return pilha;
	}

	public void setPilha(String[] pilha) {
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

	public Pilha_Peca(int tamanho) {
		this.topo = -1;
		this.tamanho = tamanho;
		this.pilha = new String[tamanho]; 
		// (T[]) new Object[tamanho]; // Solução do livro (Vídeo Loiane)
	} 
		
	public boolean cheia() {
		return(topo == (pilha.length-1));
	}
	
	public boolean vazia() {
		return(topo ==-1);
	}
		
	public boolean push(String peca) { // Adicionar peça
		if(!cheia()) { // Verificar se está cheia, se não estiver cheia, tenta empilhar
			if (peca.equalsIgnoreCase("vermelha")) { // Verificação
				this.topo++;
				pilha[topo] = peca;
				JOptionPane.showMessageDialog(null, "Peça adicionada!");
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "A peça não é vermelha! Não foi adicionada");
				return false;
			}			
		} else {
			JOptionPane.showMessageDialog(null, "A pilha está cheia");
			return false;
		}
	}
	
	public String toString() {
	    String s = "    \n    ";
	    for (int i = tamanho - 1; i >= 0; i--) {
	        s = s + pilha[i];
	        if (i >= 0)
	            s = s + "    \n    ";
	    }
	    s = s + "    \n    ";
	    return s;
	}
}














