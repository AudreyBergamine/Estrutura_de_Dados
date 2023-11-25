package ListaEncadeada.Aula_23_10_23;


public class No<T> { 
    private T elemento; 	// Nó ou célula... Onde vamos guardar o valor que pode ser de qualquer TIPO, int, nome, string, contato
    private No<T> proximo; 	// Cada elemento só sabe o seu próximo 

    
    // CONSTRUTORES
    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null; // O próximo SEMPRE vai ser null
    }
    
    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo; 
    }
    
    
    
// GETTERS e SETTERS
    public T getElemento() {
        return elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    
    
    

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("No [elemento=").append(elemento).append(", proximo=").append(proximo).append("]");
        return builder.toString();
    }

	public void setValor(int numero) {
		// TODO Auto-generated method stub
		
	} 
}

