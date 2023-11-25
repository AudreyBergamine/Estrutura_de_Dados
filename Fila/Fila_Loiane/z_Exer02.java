package Fila.Fila_Loiane;
/*
 Escreva um programa que simule a distribuição de senhas de atendimento a um grupo de pessoas
 Cada pessoa pode receber uma senha prioritária ou uma senha normal
 O programa deve obedecer os seguintes critérios: 
 
 - Existe apenas 1 atendente;
 - 1 Pessoa com senha normal deve ser atendida a cada 3 pessoas com senha prioritária;
 - Não havendo prioridades, as pessoas com senha normal, podem ser atendidas
 
 */

public class z_Exer02 {

	public static void main(String[] args) {
		Fila<String> regular = new Fila<>();
		Fila<String> prioridade = new Fila<>();

		final int MAX_PRIORIDADE = 3; // Constante

		regular.enfileira("Pessoa 1");
		regular.enfileira("Pessoa 2");
		regular.enfileira("Pessoa 3");
		prioridade.enfileira("Pessoa 1P");
		prioridade.enfileira("Pessoa 2P");
		prioridade.enfileira("Pessoa 3P");
		prioridade.enfileira("Pessoa 4P");
		prioridade.enfileira("Pessoa 5P");
		regular.enfileira("Pessoa 4");
		regular.enfileira("Pessoa 5");
		regular.enfileira("Pessoa 6");
		regular.enfileira("Pessoa 7");
		regular.enfileira("Pessoa 8");

		while (!regular.estaVazia() || !prioridade.estaVazia()) { // Enquanto as filas não estiverem vazias, vamos continuar atendendo
			int cont = 0;
			while(!prioridade.estaVazia() && cont < MAX_PRIORIDADE) { // Enquanto a Fila prioritário não estiver vazia....
				atendePessoa(prioridade); // Vou atender o nº max de prioridade até atender o regular novamente
				cont++;
			}
			// A cada 3 pessoas prioritárias, vamos atender 1 regular... 
			// Atendendo regular: 
			if (!regular.estaVazia()) { // Se tiver pessoas na fila, vamos atender
				atendePessoa(regular);
			}

			if (prioridade.estaVazia()) {
				while (!regular.estaVazia()) {
					atendePessoa(regular);
				}
			}
		}
	}

	public static void atendePessoa(Fila<String> fila) {
		String pessoaAtendida = fila.desenfileira();
		System.out.println(pessoaAtendida + " foi atendida.");
	}

}
