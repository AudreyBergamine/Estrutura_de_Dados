package Lista.Ex_Jos.Jogadores;

public class Lista {

	private Jogadores lista[];
	private int topo;

	public Lista(int capacidade) {
		topo = -1; //topo zerado
		this.lista = new Jogadores [capacidade];
	}
	public void adicionarJogador(Jogadores elemento) {
		if(!cheia()) {
			topo++;
			this.lista[topo]= elemento;
		} else {
			System.out.println("Lista cheia!\n");
		}

	}

	private Jogadores removerUltimoJogador() {
		Jogadores valor = null;
		if (!vazia()) {
			valor = lista[topo];
			lista[topo] = null;
			topo--;
		}else {
			System.out.println("A lista já está vazia!\n");
		}
		return valor;

	}

	public boolean removerJogador(Jogadores jogador) { 
		boolean verificar = false; 

		if (!vazia()) {
			Jogadores armazenador [] = new Jogadores[lista.length]; 
			for (int i = topo; i>=0; i--) { 
				armazenador[i] = lista[i]; 

				if(this.removerUltimoJogador().equals(jogador)) { 
					verificar = true; //Se a condicional acima for verdadeira, então o jogador será substituído
					lista[i] = null;

					for (int j = i+1; j<lista.length; j++) { //Loop para colocar os valores que haviam sido retirados
						this.adicionarJogador(armazenador[j]); //Método adicionarJogador armazena os jogadores do vetor armazenador na lista.
					}
					return verificar; //Retorna True.

				}
			}
			if(verificar == false) {
				for (int i = 0; i<lista.length;i++) {
					this.adicionarJogador(armazenador[i]);
				}
				System.out.println("Jogador digitado não existe!\n");
				return verificar;
			}
		}

		return verificar;
	}





	public boolean cheia() {
		return (topo == (lista.length-1)); 
	}
	public boolean vazia() {
		return (topo == -1);
	}

	public String toString(){
		String s = "Jogadores: \n";
		if(!this.vazia()) {
			s = s+ "\n";
			for (int i = 0; i<this.topo; i++) {
				s = s+(this.lista[i]);
				s = s+("\n\n");
			}

			s= s+this.lista[topo]+"\n";
			return s;
		}
		return "[]";
	}
}

