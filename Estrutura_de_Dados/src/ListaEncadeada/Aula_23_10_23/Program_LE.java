package ListaEncadeada.Aula_23_10_23;

// https://www.youtube.com/watch?v=a4PxWvFppmM&list=PLGxZ4Rq3BOBrgumpzz-l8kFMw2DLERdxi&index=49

public class Program_LE {

	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println("Tamanho da Lista Encadeada:  " + lista.getTamanho() + "\n");
        System.out.println(lista + "\n");

        lista.adiciona(2);
        System.out.println(lista + "\n");

        lista.adiciona(3);
        System.out.println(lista + "\n");
        
        System.out.println("Tamanho da Lista Encadeada:  " + lista.getTamanho() + "\n");

         lista.limpa();
         System.out.println(lista);
         
         System.out.println("Tamanho da Lista Encadeada:  " + lista.getTamanho() + "\n");
    }
}