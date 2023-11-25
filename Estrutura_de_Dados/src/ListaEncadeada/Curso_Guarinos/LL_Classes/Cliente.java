package ListaEncadeada.Curso_Guarinos.LL_Classes;

public class Cliente {
	private String cfp;
	private String nome;
	
	public Cliente(String novoCfp, String novoNome) {
		super();
		this.cfp = novoCfp;
		this.nome = novoNome;
		// Para instanciar um novo cliente:
		// LL_Generics<Cliente> clientes = new LL_Generics<Cliente>();
		//	clientes.adicionar( new Cliente("337.070.980-00", "Audrey Bergamine"));
	}

	

	public String getCfp() {
		return cfp;
	}


	public void setCfp(String cfp) {
		this.cfp = cfp;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	@Override
	public String toString() {
		// return this.nome;    ou 
		return "Cliente: " 
						+ "\nCPF: " + cfp 
						+ "\nNome: " + nome 
						+ "\n";
	}
	
	
	
	
	
	

}
