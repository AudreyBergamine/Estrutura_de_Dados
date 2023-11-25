package Fila.Fila_Loiane;

public class FilaComPrioridade <T> extends Fila<T> {

	public void enfileira(T elemento){ // Colocando o elemento no lugar correto, ordenado
		@SuppressWarnings("unchecked")
		Comparable<T> chave = (Comparable<T>) elemento; // Comparable > Interface
		
		int i;
		for (i=0; i<this.tamanho; i++){
			if (chave.compareTo(this.elementos[i]) < 0){
				break;
			}
		}
		this.adiciona(i, elemento);
	}	
}
