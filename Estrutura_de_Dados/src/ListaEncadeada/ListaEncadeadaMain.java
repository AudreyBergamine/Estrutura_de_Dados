package ListaEncadeada;
import javax.swing.JOptionPane;

public class ListaEncadeadaMain {

    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.adiciona(1);        
        // Print da Lista
        JOptionPane.showMessageDialog(null, lista);
        


        lista.adiciona(2);
        JOptionPane.showMessageDialog(null, lista);



        lista.adiciona(3);
        JOptionPane.showMessageDialog(null, lista);



        // Imprimir o tamanho da Lista (tam real)
        JOptionPane.showMessageDialog(null, "Tamanho: " + lista.getTamanho());


        // Limpando a lista
        lista.limpa();
        JOptionPane.showMessageDialog(null, lista);
    }
}
