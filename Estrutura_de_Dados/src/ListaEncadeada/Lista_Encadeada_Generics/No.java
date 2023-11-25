package ListaEncadeada.Lista_Encadeada_Generics;

import javax.swing.JOptionPane;

public class No<T> { // imaginar como se fosse um vagão de trem que vai ser adicionado na fila

    private T elemento;
    private No<T> proximo;

    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

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
        return "Nó= \t elemento:" + elemento +  "->" + "\t proximo:" + proximo + "\n";
    }

    //Teste pra saber se  está funcionando
    public static void main(String[] args) {
        No<Integer> primeiroNo = new No<>(10);
        No<Integer> segundoNo = new No<>(20);
        primeiroNo.setProximo(segundoNo);

        JOptionPane.showMessageDialog(null, primeiroNo.toString());
        JOptionPane.showMessageDialog(null, segundoNo.toString());
    }
}
