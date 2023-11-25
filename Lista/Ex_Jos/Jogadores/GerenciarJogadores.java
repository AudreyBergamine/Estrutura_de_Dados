package Lista.Ex_Jos.Jogadores;

public class GerenciarJogadores {
	public static void main(String[] args) {
		
		Jogadores jogador1 = new Jogadores("Gilson", 32, "Corinthians", 9);
		Jogadores jogador2= new Jogadores("Audrey", 31, "Time a definir", 10);
		Jogadores jogador3= new Jogadores("Gilbert", 26, "Corinthians", 7);
		Jogadores jogador4= new Jogadores("Talles", 22, "Time a definir", 6);
		
		Lista lista = new Lista(4);
		
		lista.adicionarJogador(jogador1);
		lista.adicionarJogador(jogador2);
		lista.adicionarJogador(jogador3);
		lista.adicionarJogador(jogador4);
		
		System.out.println("\n" + lista);
		
		System.out.println(lista.removerJogador(jogador1)); //Remoção do primeiro jogador
		
		System.out.println("\nLista atualizada com o primeiro jogador removido>\n" + lista);
	}
}

