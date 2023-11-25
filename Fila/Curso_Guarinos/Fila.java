package Fila.Curso_Guarinos;

public class Fila {
	private ListaLigada lista;
	
	public Fila() {
		this.lista = new ListaLigada();
	}


	public void adicionar(String novoValor) {
		this.lista.adicionar(novoValor);
	}

	// Remove apenas o 1o da Fila
	public void remover( ) {
		this.lista.remover(this.get());
	}

	// Pega o primeiro elemento
	public String get() {
		return  this.lista.getPrimeiro().getValor() ;
	}
	

}
