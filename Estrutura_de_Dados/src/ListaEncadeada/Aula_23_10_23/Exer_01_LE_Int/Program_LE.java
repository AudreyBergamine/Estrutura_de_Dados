package ListaEncadeada.Aula_23_10_23.Exer_01_LE_Int;

public class Program_LE {

	public static void main(String[] args) {
		
		ListaInteEnc list = new ListaInteEnc();
		
		list.adiciona(1);
		list.adiciona(2);
		list.adiciona(3);
		
		
		list.print();
		
		list.pesquisar(2);
		System.out.println(list.pesquisar2(1).getValor());
		
		// Pesquisar: 
//		if(lista.pesquisar(40)!=null) {
//			 System.out.println("O
//			valor existe na lista");
//			 }else {
//			 System.out.println("O
//			valor Não existe na lista");
//			 }
		
		//Limpar lista:
//		while (!list.vazia()) {
//		 int e = list.limpar();
//		 System.out.println("Retirei o elemento "+ e);
//		 }
//		 list.print();
		

	}

}
