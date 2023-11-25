package Pilha.Pilha_Notas;


public class Pilha {
	int pedidos[];
	int topo;

	public Pilha(int qtdPedidos) {
		topo =-1;
		pedidos = new int[qtdPedidos];
	}

	public boolean cheia() {
		return(topo ==(pedidos.length - 1));
	}

	public boolean vazia() {
		return(topo ==-1);
	}

	
	public void empilha(int recebePedido) { // push
		if(!cheia()) {
			topo++;
			pedidos[topo] = recebePedido;
			System.out.println("Elemento empilhado com sucesso");
		} else {
			System.out.println("Pilha cheia");
		}
			
	}
	
			
	public int desempilha() { // pop
		int valor = -1;
		if (!vazia()) {
			valor = pedidos[topo];
			pedidos[topo] = 0;
			topo--;
			System.out.println("Desempilhado com sucesso");

		}else {
			System.out.println("Pilha vazia");
		}
		return valor;
		
	}
	
	public void zerarPilha() {
		System.out.println(toString());
		while (!vazia()) {
			desempilha();
			System.out.println("Pilha zerada!!");
			}
		
	}

	public String toString() {
		String s = "[ ";
		for(int i =0; i< topo; i++) {
			s = s + pedidos[i];
			if(i<topo)
				s = s + ',';
		}
		return s;
		}

}
	

