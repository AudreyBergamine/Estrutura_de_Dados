package ListaEncadeada.Aula_23_10_23.Exer_01_LE_Int;

public class Nozinho {
	private int valor; // Vai receber os números
	private Nozinho proximo; // Vai apontar para o próximo elemento

	
	// CONSTRUTORES	
	public Nozinho() {}

	public Nozinho(int valor) {
		this.valor = valor;
		this.proximo = null; // O próximo SEMPRE vai ser null
	}

	public Nozinho(int elemento, Nozinho proximo) {
		this.valor = elemento;
		this.proximo = proximo; 
	}




	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Nozinho getProximo() {
		return proximo;
	}
	public void setProximo(Nozinho proximo) {
		this.proximo = proximo;
	}

	public Nozinho pesquisar(int i) {
		if(proximo.valor == i) {
			return proximo;
		} else {
			return proximo.pesquisar(i);
		}
	}
	
	@Override
	public String toString() {
		return "valor: " + valor + "   -->>   " + proximo;
	}






}
