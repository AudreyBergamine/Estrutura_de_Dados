package Pilha.Pilha_Peca_Int_new;

import javax.swing.JOptionPane;

public class Pilha_Peca_Int {
	// ATRIBUTOS
	private int topo;
	private int tamanho;
	private int [] pilha;
	
	// CONSTRUTOR
	public Pilha_Peca_Int(int tamanho) {
		this.topo = -1;
		this.tamanho = tamanho;
		this.pilha = new int[tamanho];
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

	public int[] getPilha() {
		return pilha;
	}

	public void setPilha(int[] pilha) {
		this.pilha = pilha;
	}
	
	// MÉTODOS	
	public boolean estaVazia() {
        return topo == -1;
    }

	public boolean estaCheia() {
        return topo == tamanho - 1;
    }

	
	public void empilhar(int peca) { // Adicionaando peças
		if(estaCheia()) {			
			JOptionPane.showMessageDialog(null, "A pilha está cheia!");
		} else {
			this.topo++;
			pilha[topo] = peca;
			//JOptionPane.showMessageDialog(null, "Peça adicionada!");
		}
	}
	
	public int desempilhar() { // Removendo peças
		if(estaVazia()) {
			JOptionPane.showMessageDialog(null, "A pilha está vazia!");
			return -1;
		} else {
			int peca = pilha[topo];
			topo --;
			JOptionPane.showMessageDialog(null, "Peça removida!");
			return peca;
		}
	}
	
	// Desmontando em ordem crescente
//	public void desmontar(int pecaDefeituosa, int pecaNova) { // Desmontar peça(pilha)
//		int[] pilhaTemp = new int[tamanho];
//		int i = 0;
//		int peca;
//
//		while(topo >= 0) {
//			peca = desempilhar();
//			if (peca == pecaDefeituosa) {
//				pilhaTemp[i] = pecaNova;
//				
//			} else {
//				pilhaTemp[i] = peca;
//			}
//			i++;
//		}
//		for (int j = i-1; j >= 0; j--) {
//			empilhar(pilhaTemp[j]);
//		}
//	}
	
//	public void desmontar(int pecaDefeituosa, int pecaNova) {
//	    int[] pilhaTemp = new int[tamanho];
//	    int i = 0;
//	    int peca;
//
//	    while (topo >= 0) {
//	        peca = desempilhar();
//	        if (peca == pecaDefeituosa) {
//	            pilhaTemp[i] = pecaNova;
//	        } else {
//	            pilhaTemp[i] = peca;
//	        }
//	        i++;
//	    }
//
//	    // Empilhar os elementos de pilhaTemp na ordem decrescente
//	    for (int j = i - 1; j >= 0; j--) {
//	        empilhar(pilhaTemp[j]);
//	    }
//	    JOptionPane.showMessageDialog(null, toString());
//	}


	public void desmontar(int pecaDefeituosa, int pecaNova) {
        Pilha_Peca_Int pilhaTemp = new Pilha_Peca_Int(tamanho);

        while (!estaVazia()) {
            int pecaAtual = desempilhar();
            if (pecaAtual == pecaDefeituosa) {
                pilhaTemp.empilhar(pecaNova);
            } else {
                pilhaTemp.empilhar(pecaAtual);
            }
        }

        while (!pilhaTemp.estaVazia()) {
            empilhar(pilhaTemp.desempilhar());
        }
    }

	
	public void desempilharTudo() {
		while(topo >= 0) {
			JOptionPane.showMessageDialog(null, "Desempilhando...");
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






	// public static class Main {
	// 	public static void main(String[] args) {
	// 		Produto peca1 = new Produto();
			
	// 		// Adicionar peças à pilha
	// 		peca1.pilhaDePecas.empilhar(new Peca("p1"));
	// 		peca1.pilhaDePecas.empilhar(new Peca("p2"));
	// 		peca1.pilhaDePecas.empilhar(new Peca("peca_defeituosa"));
	// 		peca1.pilhaDePecas.empilhar(new Peca("p3"));
			
	// 		// Montar o produto
	// 		peca1.montar();
			
	// 		// Trocar peça defeituosa por uma nova
	// 		Peca pecaNova = new Peca("p4");
	// 		peca1.trocarPecaDefeituosa(pecaNova);
			
	// 		// Montar o produto novamente
	// 		peca1.montar();



	// 		Pilha_Peca pilha = new Pilha_Peca(5);
	// 		pilha.push(1);
	// 		pilha.push(2);
	// 		pilha.push(3);

	// 		JOptionPane.showMessageDialog(null, pilha.toString());
	// 	}
	// }
		
}











