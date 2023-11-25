package Pilha.Ex_01_Slide_Peca;

public class Pilha {
	private String[] pecas; // Array para armazenar as peças
	private int topo; // Índice do topo da pilha

	public Pilha() {
		pecas = new String[10]; // Inicializa o array com tamanho 10
		topo = -1; // Inicializa o topo como -1 (pilha vazia)
	}

	public void Empilhar(String elemento) {
		if (topo < pecas.length - 1) { // Verifica se a pilha não está cheia
			pecas[++topo] = elemento; // Incrementa o topo e insere o elemento
		}
	}

	public String Desempilhar() {
		if (topo >= 0) { // Verifica se a pilha não está vazia
			return pecas[topo--]; // Retorna o elemento no topo e decrementa o topo
		}
		return null; // Retorna nulo se a pilha estiver vazia
	}

	public boolean EstaVazia() {
		return topo == -1; // Verifica se a pilha está vazia
	}

	public int TamanhoDaPilha() {
		return topo + 1; // Retorna o tamanho atual da pilha
	}

	public boolean EstaCheia() {
		return topo == (pecas.length - 1); // Verifica se a pilha está cheia
	}

	public static void substituirDefeituosa(Pilha pilha) {
		Pilha pilhaAuxiliar = new Pilha();
		boolean encontrouDefeituosa = false;
		int contador = 0;
		int tamanhoDaPilha = pilha.TamanhoDaPilha();
		while (!pilha.EstaVazia()) {
			String peca = pilha.Desempilhar();
			if (peca.equals("defeituosa") && !encontrouDefeituosa) {
				// Substitui a peça defeituosa pela próxima peça disponível
				pilhaAuxiliar.Empilhar("p" + (tamanhoDaPilha - contador));
				encontrouDefeituosa = true;
			} else {
				pilhaAuxiliar.Empilhar(peca);
			}
			contador++;
		}

		// Transfere as peças de volta para a pilha original
		while (!pilhaAuxiliar.EstaVazia()) {
			pilha.Empilhar(pilhaAuxiliar.Desempilhar());
		}
	}


	
	public String toString() {
		String s = "";
		if (!EstaVazia()) {
			s = s + "";
			for (int i = topo; i >= 0; i--) {
				s = s + pecas[i];
				if (i > 0) {
					s = s + "\n";
				}
			}
			s = s + "";
			return s;
		}
		return "[]"; // Retorna uma representação em string da pilha
	}
	
	
	
	
	
	

	//    public String toString() {
	//        String s = "";
	//        if (!EstaVazia()) {
	//            s = s + "[";
	//            for (int i = 0; i <= topo; i++) {
	//                s = s + pecas[i];
	//                if (i < topo) {
	//                    s = s + ",";
	//                }
	//            }
	//            s = s + "]";
	//            return s;
	//        }
	//        return "[]"; // Retorna uma representação em string da pilha
	//    }








}
