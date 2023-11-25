package Pilha.Pilha_Int;

import javax.swing.JOptionPane;

public class Pilhas_Int {
	int qtdElementos;
	int elemento[];
	int topo=-1;
	String s = "";
	
	// CONSTRUTOR:
	public Pilhas_Int(int qtdElementos) {
		topo = -1;
		elemento = new int[qtdElementos];
	}
	
	// GETTERS AND SETTERS:
	public int getQtdElementos() {
		return qtdElementos;
	}

	public void setQtdElementos(int qtdElementos) {
		this.qtdElementos = qtdElementos;
	}

	public int[] getElemento() {
		return elemento;
	}

	public void setElemento(int[] elemento) {
		this.elemento = elemento;
	}
	
	public int getTopo() {
		return topo;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}
		
	
	// MÉTODOS:
	public boolean cheia() {
		return(topo ==(elemento.length - 1));
	}

	public boolean vazia() {
		return(topo ==-1);
	}
	
	public void empilha(int elemento) { // push
		if(!cheia()) {
			topo++;
			this.elemento[topo] = elemento;
			JOptionPane.showMessageDialog(null, "Elemento empilhado com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Pilha cheia");
		}		
	}
				
	public int desempilha() { // pop
		int valor = -1;
		if (!vazia()) {
			valor = elemento[topo];
			elemento[topo] = 0;
			topo--;
		}else {
			JOptionPane.showMessageDialog(null, "Pilha vazia");
		}
		return valor;		
	}
	
	public int Topo() { // peek
		if (vazia()) { // Se estiver vazia
			JOptionPane.showMessageDialog(null, "Pilha Vazia!");
			return -1;
		} // Se não estiver vazia
		return elemento[topo]; // Retorna o elemento do topo da pilha
	}
	
	public void zerarPilha() {
		while (!vazia()) {
			JOptionPane.showMessageDialog(null, "Zerando Pilha...\n" + toString());
			desempilha();
			JOptionPane.showMessageDialog(null, toString());
		}	
		JOptionPane.showMessageDialog(null, "Pilha zerada!!");
	}

	public String toString() {
		String s = "\n";
		for(int i =0; i<=topo; i++) {
			s = s + elemento[i];
			if(i<topo)
				s = s + "   |   ";
				//else  s = s + "";
		}
		return s;
	}
}
