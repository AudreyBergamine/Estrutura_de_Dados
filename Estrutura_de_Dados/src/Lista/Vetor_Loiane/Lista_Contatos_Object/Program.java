package Lista.Vetor_Loiane.Lista_Contatos_Object;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {

		Lista_Object lista = new Lista_Object(5);
		Contato c1 = new Contato("Audrey Bergamine", "(11) 96473-5512", "audreybergamini@outlook.com");
		Contato c2 = new Contato("Talles Bergamine", "(11) 96576-5513", "talles_berg@outlook.com");
		Contato c3 = new Contato("Gilbert Bergamine", "(11) 94550-5513", "gil_berg@outlook.com");
		
		// Não foi adicionado no vetor, mas usando equals e hashcode, ao fazer a busca na memória ele vai mostrar que existe no vetor
		Contato c4 = new Contato("Audrey Bergamine", "(11) 96473-5512", "audreybergamini@outlook.com");


		lista.adiciona(c1); // Posicao 0
		lista.adiciona(c2); // Posicao 1	
		lista.adiciona(c3); // Posicao 2
		// c4 não foi adicionado
		lista.toString();
		
		int pos = lista.buscaString(c4);
		if (pos >= -1) {
			JOptionPane.showMessageDialog(null, "Elemento existe no vetor");
		} else {
			JOptionPane.showMessageDialog(null, "Elemento não existe no vetor");
		}


//		JOptionPane.showMessageDialog(null, "Tamanho: " + lista.tamanho());
	
//		JOptionPane.showMessageDialog(null, "Busca elemento: \n" + lista.buscaIndex(2));
		
//		lista.buscaString("Elemento 1");
//	
//		
//		lista.adicionaNaPosicao(0, "Elemento 0");
//		
//		lista.toString();
//		
//		lista.removePosicao(0);
//		
//		lista.toString();

		// Removendo um elemento buscando por String, encontra o index e remove usando o index
//		int pos = lista.buscaString(c1);
//		if (pos >= 0) {
//			lista.removePosicao(pos);
//		} else {
//			JOptionPane.showMessageDialog(null, "Elemento não existe no vetor");
//		}		
//		lista.toString();
		

	}

}
