package Fila.Curso_Guarinos;

public class Elemento {
	private String valor;
	private Elemento proximo;
	
	
	
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	
	
	public Elemento(String novoValor) { 
		this.valor = novoValor;
	}

	
	
	
}
