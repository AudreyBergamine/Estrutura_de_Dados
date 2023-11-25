package Pilha.Pilha_Peca_String;

import javax.swing.JOptionPane;

import Pilha.Ex_01_Slide_Peca.Pilha;

@SuppressWarnings("unused")
public class Pilha_Peca {
	// ATRIBUTOS
	private int topo;
	private int tamanho;
	private String [] pilha;
	
	// CONSTRUTOR
	public Pilha_Peca(int tamanho) {
		this.topo = -1;
		this.tamanho = tamanho;
		this.pilha = new String[tamanho];
	} 

	// GETTERS AND SETTERS
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

	public String[] getPilha() {
		return pilha;
	}

	public void setPilha(String[] pilha) {
		this.pilha = pilha;
	}
	
	// MÉTODOS	
	public boolean estaVazia() {
        return topo == -1;
    }

	public boolean estaCheia() {
        return topo == tamanho - 1;
    }

	
	public void empilhar(String peca) { // Adicionaando peças
		if(estaCheia()) {			
			JOptionPane.showMessageDialog(null, "A pilha está cheia!");
		} else {
			this.topo++;
			pilha[topo] = peca;
			//JOptionPane.showMessageDialog(null, "Peça adicionada!");
		}
	}
	
	public String desempilhar() { // Removendo peças
	    if (estaVazia()) {
	        JOptionPane.showMessageDialog(null, "A pilha está vazia!");
	        return null; // Retorna null em caso de pilha vazia
	    } else {
	        String peca = pilha[topo];
	        topo--;
	        return peca;
	    }
	    //JOptionPane.showMessageDialog(null, "Peça removida!");
	}
	

	public static void remove_Peca_Dedeituosa(Pilha_Peca pilha) {
	    Pilha_Peca pilhaTemp = new Pilha_Peca(pilha.getTamanho());
	    @SuppressWarnings("unused")
		int i = 0;
	    //JOptionPane.showMessageDialog(null, "Desempilhando até encontrar peça defeituosa...\n" + pilha.toString());

	    // Percorra a pilha original
	    while (!pilha.estaVazia()) {
	        String peca = pilha.desempilhar();
	        
	        if (peca.equalsIgnoreCase("defeituosa")) {
	            // Substitui a peça defeituosa pela próxima peça disponível
	            //pilhaTemp.empilhar("p" + (pilha.getTamanho() - i));	        
	        } else {
	            pilhaTemp.empilhar(peca);
	        }
	        i++;
	     // Exibe a peça desempilhada
	        
	    }

	    // Transfira as peças de volta para a pilha original
	    while (!pilhaTemp.estaVazia()) {
	        pilha.empilhar(pilhaTemp.desempilhar());
	    }
	}

	
	public void desempilharTudo() {
		JOptionPane.showMessageDialog(null, "Desempilhando...");
		while(topo >= 0) {
			desempilhar();
		}
		JOptionPane.showMessageDialog(null, toString());
	}


	public String toString() {
	    if (estaVazia()) {
	        return "A pilha está vazia";
	    } else {
	        String s = "Pilha: \n\n";
	        for (int i = topo; i >= 0; i--) {
	            s += pilha[i] + "\n";
	        }
	        return s;
	    }
	}		
}











