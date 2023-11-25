package ListaEncadeada.Aula_23_10_23;

public class ListaEncadeada<T> {
	private No<T> inicio;
	private No<T> ultimo;
	private int tamanho = 0;


	public void adiciona(T elemento) {
		No<T> celula = new No<T>(elemento);
		if (this.tamanho == 0) {  // Primeiro nó > Início > Start > 1ª Célula
			this.inicio = celula;
		} else { // Se não for o 1º, vai inserir o próximo elemento na celula e  se tornar o ultimo
			this.ultimo.setProximo(celula);
		}
		this.ultimo = celula; // Move o ponteiro do último para a célula
		this.tamanho++; // Aumenta mais 1
	}
	
	
	public int getTamanho() {
		return this.tamanho;
	}



	public void limpa() {
		for (No<T> atual = this.inicio; atual != null;) {
			No<T> proximo = atual.getProximo();
			atual.setElemento(null); 		// Removo o elemento
			atual.setProximo(null); 		// Removo o link de indicação para o seu próximo
			atual = proximo; 				// O atual passa a assumir o próximo 
		}
		this.inicio = null; 		// Zerando os valores salvos em "inicio"
		this.ultimo = null; 		// Zerando os valores salvos em "ultimo"
		this.tamanho = 0; 		// Zerando o tamanho
	}



	//    @Override
	//    public String toString() {
	//        if (this.tamanho == 0) {
	//            return "[]";
	//        }
	//        String result = "[";
	//        No<T> atual = this.inicio;
	//        
	//        while (atual != null) {
	//            result += "No: " 
	//        + " Elemento: " + atual.getElemento() 
	//        + " Proximo:" + (atual.getProximo() != null ? atual.getProximo().getElemento() : "null") + "";
	//            atual = atual.getProximo();
	//            
	//            if (atual != null) {
	//                result += "           -->            ";
	//            }
	//        }        
	//        result += "]\n ";
	//        return result;
	//    }

	@Override
	public String toString() {
		// [1, 2, 3, 4]
		if (this.tamanho == 0) { // Se estiver vazio, mostra a Lista Encadeada Vazia... 
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		// builder.append("ListaEncadeada [inicio=").append(inicio).append("]");
		
		No<T> atual = this.inicio; // Vai receber o início, para começar de algum lugar, posição 0  > Tem pelo menos 1 elemento
		for (int i = 0; i < this.tamanho - 1; i++) { // Para não colocar seta ou vírgula no ultimo, por isso tamanho -1
			builder.append(atual.getElemento()).append("    --->>>     ");
			atual = atual.getProximo();
		}
		builder.append(atual.getElemento()).append("]");
		/*
		 * builder.append(atual.getElemento()).append(",");
		 * while (atual.getProximo() != null) {
		 * atual = atual.getProximo();
		 * builder.append(atual.getElemento()).append(",");
		 * }
		 */
		return builder.toString();
	}





}






