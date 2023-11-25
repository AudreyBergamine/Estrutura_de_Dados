package Pilha.Pilha_Double;

import javax.swing.JOptionPane;

public class Pilhas_Double {
	int qtdNotas;
	float notas[];
	int topo=-1;
	String s = "";
	
	// CONSTRUTOR:
	public Pilhas_Double(int qtdNotas) {
		topo = -1;
		notas = new float[qtdNotas];
	}
	
	// GETTERS AND SETTERS:
	public int getQtdNotas() {
		return qtdNotas;
	}

	public void setQtdNotas(int qtdNotas) {
		this.qtdNotas = qtdNotas;
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}

	public int getTopo() {
		return topo;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}
	
	// MÉTODOS:
	public boolean cheia() {
		return(topo ==(notas.length - 1));
	}

	public boolean vazia() {
		return(topo ==-1);
	}
	
	public void empilha(float notas) { // push
		if(!cheia()) {
			topo++;
			this.notas[topo] = notas;
			JOptionPane.showMessageDialog(null, "Elemento empilhado com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Pilha cheia");
		}		
	}
				
	public double desempilha() { // pop
		double valor = -1;
		if (!vazia()) {
			valor = notas[topo];
			notas[topo] = 0;
			topo--;
		}else {
			JOptionPane.showMessageDialog(null, "Pilha vazia");
		}
		return valor;		
	}
	
	public double elemento_Topo() { // peek
		if (vazia()) { // Se estiver vazia
			JOptionPane.showMessageDialog(null, "Pilha Vazia!");
			return -1;
		} // Se não estiver vazia
		return notas[topo]; // Retorna o elemento do topo da pilha
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
			s = s + notas[i];
			if(i<topo)
				s = s + "   |   ";
				else  s = s + "";
		}
		return s;
	}

}
