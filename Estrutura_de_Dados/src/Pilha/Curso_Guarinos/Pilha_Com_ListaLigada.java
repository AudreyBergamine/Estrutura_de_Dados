package Pilha.Curso_Guarinos;

public class Pilha_Com_ListaLigada {
	private ListaLigada lista;
	
	public Pilha_Com_ListaLigada() {
		this.lista = new ListaLigada();
	}
	
	
	
	public void adicionar(String novoValor) {
		this.lista.adicionarComeco(novoValor);
	}
	
	// Sempre vai remover o topo
	public void remover() {
		this.lista.remover(this.get());
	}
	
	
	public String get() {
		return this.lista.getPrimeiro().getValor();
	}
	
	
	
	

}
