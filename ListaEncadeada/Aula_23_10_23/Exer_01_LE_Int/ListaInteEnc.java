package ListaEncadeada.Aula_23_10_23.Exer_01_LE_Int;

public class ListaInteEnc {
	private Nozinho primeiro; // Chamamos a classe Nozinho com o nome do objeto primeiro
	private Nozinho ultimo;
	private int tamanho = 0;
	
	public ListaInteEnc() { // No construtor criamos a lista
		primeiro = null;
	}
	
	
	public boolean vazia() {
		if (primeiro == null) {
		System.out.println("Lista vazia");
		return true;
		} else {
		System.out.println("Lista com elementos");
		return false;
		}
		}
	
//	public void adiciona(int i) {
//		Nozinho novo = new Nozinho(); 	// Cria um novo nó (Vazio) 
//		novo.setValor(i);							// Insere o valor
//		novo.setProximo(null);					// Aponta para o próximo, que vai ser o novo primeiro 
//		primeiro = novo;							// Onde o primeiro vai er o novo "novo"
//	}	
	
	
	public void adiciona(int i) {
	Nozinho novo = new Nozinho(i);
	if (this.tamanho == 0) {  // Primeiro nó > Início > Start > 1ª Célula
		//novo.setValor(i);
		this.primeiro = novo;
		this.ultimo = primeiro;
	} else { // Se não for o 1º, vai inserir o próximo elemento na celula e  se tornar o ultimo
		this.ultimo.setProximo(novo); // 
	}
	this.ultimo = novo; // Move o ponteiro do último para a célula
	this.tamanho++; // Aumenta mais 1
}
	
	public void adicionaFim(int numero) {
		Nozinho novo = new Nozinho();
		novo.setValor(numero);
		novo.setProximo(null);
		
		if (primeiro == null) { // Verifica se está no null, se sim coloque o novo elemento
			primeiro = novo;
		} else { // Senão
			Nozinho auxiliar;
			auxiliar = primeiro; 
			while ( auxiliar.getProximo() != null) { // Meu ponteiro vai para o início e percorre a lista até encontrar o null

				auxiliar = auxiliar.getProximo(); 
			} // Quando ele achar o null a minha auxiliar insere o  novo valor no próximo elelemento
			auxiliar.setProximo(novo);
		}
		}
	
	
	@SuppressWarnings("unused")
	public Nozinho pesquisar (int i) {
		for (Nozinho no = primeiro; no != null; no = no.getProximo() ) {
			if ( no.getValor() == i) {
				System.out.println("Valor encontrado");
				return no;
			} else {
				System.out.println("Valor não encontrado");
				return null;
			}
		}
		return null;
	}
	
	
	
	public Nozinho pesquisar2(int i) {
		if (primeiro.getValor() == i) {
			return primeiro;
		}
		return primeiro.pesquisar(i);
		
	}
	
	public void remover(int i) {
		Nozinho anterior = null; // Referencia para o elemento anterior
		Nozinho p = primeiro; // Para percorrer a nossa lista
		while (p != null && p.getValor() != i) { // Procura o elemento na lista guardando anterior
		anterior = p;
		p = p.getProximo();
		}
		if (p == null) { // Verifica se o achou o elemento
		return;
		}
		if (anterior == null) { // Retira o elemento
			primeiro = p.getProximo();
			} else {
			anterior.setProximo(p.getProximo());
			}	
	}
	
	public int limpar() {
		Nozinho no = primeiro;
		int elemento = no.getValor();
		primeiro = no.getProximo();
		return elemento;
		
//		while (!lista.vazia()) {
//			 int e = lista.limpar();
//			 System.out.println("Retirei o elemento "+ e);
//			 }
//			 lista.print();
	}
	
	
	
	public void print() {
		System.out.println(this.primeiro);
		
//		for (Nozinho no = primeiro; no != null; no = no.getProximo()) {
//			System.out.println(no);			
//		}
	}
}
