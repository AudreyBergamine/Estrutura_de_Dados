package ListaEncadeada.Aula_23_10_23.Exer_02_LE_Alunos;

import javax.swing.JOptionPane;

public class ListaEncAluno {
	private Nozinho primeiro; // Chamamos a classe Nozinho com o nome do objeto primeiro
	private Nozinho ultimo;
	private int tamanho = 0;
	
	public ListaEncAluno() { // No construtor criamos a lista
		primeiro = null;
	}
	
//	public void adiciona(int i) {
//		Nozinho novo = new Nozinho(); 	// Cria um novo nó (Vazio) 
//		novo.setValor(i);							// Insere o valor
//		novo.setProximo(null);					// Aponta para o próximo, que vai ser o novo primeiro 
//		primeiro = novo;							// Onde o primeiro vai er o novo "novo"
//	}	
	
	
	public void adiciona(String i) {
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
	
	
	@SuppressWarnings("unused")
	public Nozinho pesquisar (String i) {
		for (Nozinho no = primeiro; no != null; no = no.getProximo() ) {
			if ( no.getNome().equalsIgnoreCase(i)) {
				JOptionPane.showMessageDialog(null, "Aluno encontrado: \n" + no.getNome());
				//System.out.println("Valor encontrado");
				return no;
			} 
			}
		JOptionPane.showMessageDialog(null, "Não encontrado");
		return null;
	}
	
	
	public Nozinho pesquisar2(String i) {
		if (primeiro.getNome().equalsIgnoreCase(i)) {
			return primeiro;
		}
		return primeiro.pesquisar(i);
		
	}
	
	public void print() {
		JOptionPane.showMessageDialog(null, this.primeiro);
		//System.out.println(this.primeiro);
		
//		for (Nozinho no = primeiro; no != null; no = no.getProximo()) {
//			System.out.println(no);			
//		}
	}
}
