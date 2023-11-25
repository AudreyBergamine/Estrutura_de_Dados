package Pilha.Pilha_Notas;

import javax.swing.JOptionPane;

public class Pilha_Notas {
	int qtdNotas;
	float notas[];
	int topo=-1;
	
	
	public Pilha_Notas(int qtdNotas) {
		topo = -1;
		notas = new float[qtdNotas];
	}
	
	// Getters e Setter
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
			System.out.println("Elemento empilhado com sucesso");
		} else {
			System.out.println("Pilha cheia");
		}		
	}
				
	public double desempilha() { // pop
		double valor = -1;
		if (!vazia()) {
			valor = notas[topo];
			notas[topo] = 0;
			topo--;
			System.out.println("Desempilhado com sucesso");

		}else {
			System.out.println("Pilha vazia");
		}
		return valor;		
	}
	
	public void zerarPilha() {
		JOptionPane.showMessageDialog(null, "Zerando Pilha..." + toString());
		while (!vazia()) {
			desempilha();
			JOptionPane.showMessageDialog(null, "" + toString());
			JOptionPane.showMessageDialog(null, "Pilha zerada!!");
		}	
	}

	public String toString() {
		String s = "[ ";
		for(int i =0; i<=topo; i++) {
			s = s + notas[i];
			if(i<topo)
				s = s + ", ";
				else  s = s + ']';
		}
		return s;
	}

}
