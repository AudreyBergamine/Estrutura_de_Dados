package ListaEncadeada;

public class Contato {
	public String nome;
	private String email;
	
	public Contato(){
		
	}

	public Contato(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contato \nNome:" + nome + "\nEmail:" + email + "\n\n";
	}
	
	

}
