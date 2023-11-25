package Arvore.Curso_Guarinos;

import javax.swing.JOptionPane;

public class Elemento<T> {  
    private T valor;
    private Elemento<T> esquerda;
    private Elemento<T> direita;

    public Elemento(T novoValor) {
        this.valor = novoValor;
        this.esquerda = null;
        this.direita = null;
    }

//    public Elemento(T novoValor, Elemento<T> proximo) {
//        this.valor = novoValor;
//    }
    
    
    

    public T getValor() {
        return valor;
    }

    public void setValor(T novoValor) {
        this.valor = novoValor;
    }
   
    
   public Elemento<T> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Elemento<T> esquerda) {
		this.esquerda = esquerda;
	}

	public Elemento<T> getDireita() {
		return direita;
	}

	public void setDireita(Elemento<T> direita) {
		this.direita = direita;
	}
	
	
	
	

	@Override
    public String toString() {
        return "Nó= \nElemento:" + valor +  "\n";
    }

    //Teste pra saber se  está funcionando
    public static void main(String[] args) {
        Elemento<Integer> primeiroNo = new Elemento<>(10);
        Elemento<Integer> segundoNo = new Elemento<>(20);
       

        JOptionPane.showMessageDialog(null, primeiroNo.toString());
        JOptionPane.showMessageDialog(null, segundoNo.toString());
    }
}
