package Arvore;

public class Elemento { // imaginar como se fosse um vagão de trem que vai ser adicionado na fila
    private int valor;

    public Elemento(int novoValor) {
        this.valor = novoValor;
    }

//    public Elemento(T elemento, Elemento<T> proximo) {
//        this.valor = elemento;
//    }

    public int getValor() {
        return valor;
    }

    public void setValor(int novoValor) {
        this.valor = novoValor;
    }



    //Teste pra saber se  está funcionando
//    public static void main(String[] args) {
//        Elemento primeiroNo = new Elemento(10);
//        Elemento segundoNo = new Elemento(20);
//       
//
//        JOptionPane.showMessageDialog(null, primeiroNo.toString());
//        JOptionPane.showMessageDialog(null, segundoNo.toString());
//    }
}
