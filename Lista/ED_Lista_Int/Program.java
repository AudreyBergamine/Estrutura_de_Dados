package Lista.ED_Lista_Int;

public class Program {

	public static void main(String[] args) {
		
		Lista_Inteiros lista = new Lista_Inteiros(4);
		System.out.println("Nr. Elementos: "+lista.getNumElementos());
		System.out.println("Tamanho      : "+lista.getTamanho());
		lista.imprimir();
		lista.adicionar(5);
		lista.adicionar(0, 15);
		lista.adicionar(0, 3);
		lista.adicionar(1, 20);
		lista.adicionar(2, 30);
		lista.adicionar(3, 35);
		lista.imprimir();
		
		int i;
		i = lista.procurar(3);
		if (i>-1)
			System.out.println("Achei -->"+lista.elementos[i]);
		else
			System.out.println("Não achei -->"+ 3);
		
		lista.imprimir();
		lista.remover();
		lista.imprimir();
		
	}

}