package Lista.Caracteres;

public class Caracteres {
	
	char [] lista;
	int nrItens;
	int tamanho;
	
	public Caracteres(int nrItens) {
		this.tamanho = 0;
		this.nrItens = nrItens;
		lista = new char[nrItens];
		
	}
	
	public void adicionar(char c) {
		
		lista[tamanho] = c;
		tamanho++;
	}
	
	public String concatenar() {
		String s = "";
		for (int i =0; i < tamanho; i++) {
			s = s + lista[i];
		}
		
		return s;
	}

	public int getNrItens() {
		return this.nrItens;
	}

	public int getTamanho() {
		return this.tamanho;
	}
//
//	public void pesquisar(int n) {
//		int i;
//		
//		for (i=0; i <getTamanho()&& itens[i] != n; i++) {
//			if (itens[i] == n) 
//				return i;
//			else
//				return -1;
//			}
//	
//		}
}
	
	
	



