package POO.Pessoa;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String profissao;
	
	// Construtor da classe Pessoa
    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String toString() {

		String s = "\nNome: " + this.nome.toUpperCase() +
				"\nIdade: " + this.idade +
				"\nProfissao: " + this.profissao.toUpperCase() ;
		return s;		
		}
}



