package ListaEncadeada.Curso_Guarinos.LL_String;

public class Programa {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("CE");
		lista.adicionar("DF");
		System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo: " + lista.getUltimo().getValor());
//		System.out.println(lista.get(0).getValor());
//		System.out.println( lista.get(1).getValor());
//		System.out.println( lista.get(2).getValor());
//		System.out.println(lista.get(3).getValor());
		//System.out.println(lista.getTamanho());
		
		
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		
		lista.remover("DF");
		System.out.println("Removeu DF");
		lista.adicionar("SP");
		System.out.println("Adicionou SP");
		
		lista.remover("BA");
		lista.remover("CE");
		lista.remover("AC");
		lista.remover("SP");
		lista.adicionar("RJ");
		
		System.out.println("Tamanho: " + lista.getTamanho());
		
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		
		
	}

}
