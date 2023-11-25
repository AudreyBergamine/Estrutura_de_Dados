package Lista.Ex_Jos.Jogadores;

public class Jogadores {
	String nome;
	int idade;
	String time;
	int posicao;
	
	public Jogadores(String nome, int idade, String time, int posicao) {
		this.nome = nome;
		this.idade = idade;
		this.time = time;
		this.posicao = posicao;
	}

	@Override
	public String toString() {
		return "Nome: " + nome 
				+ "\nIdade: " + idade 
				+ "\nTime: " + time 
				+ "\nPosicao: " + posicao 
				+ "\n";
	}
	
	
	
}

