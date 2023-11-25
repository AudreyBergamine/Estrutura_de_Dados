package Lista.Caracteres;

public class Program {

	public static void main(String[] args) {
		
		Caracteres lista = new Caracteres(10);
		
		lista.adicionar('A');
		lista.adicionar('u');
		lista.adicionar('d');
		lista.adicionar('r');
		lista.adicionar('e');
		lista.adicionar('y');
		

		System.out.println(lista.concatenar());		
	}
}

