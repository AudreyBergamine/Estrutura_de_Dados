package Pilha.Pilha_Pedido;

import javax.swing.JOptionPane;

public class Pilha_Pedido {
	int pedidos[];
	int topo;

	public Pilha_Pedido(int qtdPedidos) {
		topo = -1;
		pedidos = new int[qtdPedidos];
	}

	public boolean cheia() {
		return(topo ==(pedidos.length - 1));
	}

	public boolean vazia() {
		return(topo ==-1);
	}

	
	public void empilha(int elemento) {
		if(!cheia()) {
			topo++;
			pedidos[topo] = elemento;
			JOptionPane.showMessageDialog(null, "Elemento empilhado com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Pilha cheia");
		}		
	}
	
	public int desempilha() {
		int valor = -1;
		if (!vazia()) {
			valor = pedidos[topo];
			pedidos[topo] = 0;
			topo--;
			JOptionPane.showMessageDialog(null, " Elemento desempilhado!");
			//JOptionPane.showMessageDialog(null, " Elemento " + pedidos[topo] + " desempilhado!");
		} else {
			JOptionPane.showMessageDialog(null, "Pilha vazia");
		}
		return valor;
	}
	
	
	public int elementoTopo() { // peek
		if (vazia()) { // Se estiver vazia
			JOptionPane.showMessageDialog(null, "Pilha Vazia!");
			return -1;
		} // Se não estiver vazia
		return pedidos[topo]; // Retorna o elemento do topo da pilha
	}
	
	
	public void zerarPilha() {
		while (!vazia()) {
			JOptionPane.showMessageDialog(null, "Desempilhando... \n" + toString());
			desempilha();
		}
		JOptionPane.showMessageDialog(null, "Pilha zerada");
	}
	
	public String toString() {
	    String s = "\n";
	    for (int i = topo; i >= 0; i--) {
	        s = s + pedidos[i];
	        if (i > 0) {
	            s = s + "\n";
	        }
	    }
	    return s;
	}
}


