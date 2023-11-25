package ListaEncadeada.Curso_Guarinos.LL_Double;

public class Elemento_Generics<T> {
	private T valor;
	private Elemento_Generics <T> proximo;
	
	
	
	
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	public Elemento_Generics <T> getProximo() {
		return proximo;
	}
	public void setProximo(Elemento_Generics <T> proximo) {
		this.proximo = proximo;
	}
	
	
	
	public Elemento_Generics(T novoValor) { 
		this.valor = novoValor;
	}

	
	
	
}
