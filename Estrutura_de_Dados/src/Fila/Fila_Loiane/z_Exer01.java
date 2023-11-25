package Fila.Fila_Loiane;

/*
 Usando a estrutura de dados Fila, crie uma fila de documentos que precisam ser impressos
 Cada documento é composto de um nome e quantidade de folhas a serem impressas
 O programa deve:
 
 - Enfileirar os documentos;
 - E seguindo a ordem, deve "imprimir" cada documento, desinfileirando da fila
 Se desejar pode usar Threds para esperar a impressão de acordo com o número de folhas a serem impressas
 */

public class z_Exer01 {

	public static void main(String[] args) {

		Fila<Documento> filaImpressora = new Fila<>();

		filaImpressora.enfileira(new Documento("A", 1));
		filaImpressora.enfileira(new Documento("B", 2));
		filaImpressora.enfileira(new Documento("C", 3));
		filaImpressora.enfileira(new Documento("D", 7));
		filaImpressora.enfileira(new Documento("E", 9));

		while (!filaImpressora.estaVazia()) {
			Documento doc = filaImpressora.desenfileira();
			System.out.println("Imprimindo documento " + doc.getNome());
			
			try { // Para simular a demora da impressão > Thread
				Thread.sleep(200 * doc.getNumFolhas());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Todos os documentos foram impressos.");
	}

}
