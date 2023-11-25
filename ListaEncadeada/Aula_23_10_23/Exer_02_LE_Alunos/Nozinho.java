package ListaEncadeada.Aula_23_10_23.Exer_02_LE_Alunos;

public class Nozinho {
	private String nome; // Vai receber os nomes
	private Nozinho proximo; // Vai apontar para o próximo elemento

	
	// CONSTRUTORES	
	public Nozinho() {}

	public Nozinho(String nome) {
		this.nome = nome;
		this.proximo = null; // O próximo SEMPRE vai ser null
	}

	// GETTERS e SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nozinho getProximo() {
		return proximo;
	}
	public void setProximo(Nozinho proximo) {
		this.proximo = proximo;
	}
	

	
	public Nozinho pesquisar(String i) {
		if(proximo.nome == i) {
			return proximo;
		} else {
			return proximo.pesquisar(i);
		}
	}
	
	
	@Override
	public String toString() {
		return "Valor: " + nome + "   -->>   " + proximo;
	}






}
