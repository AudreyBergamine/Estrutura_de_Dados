package Lista.Ex_Jos.Livros;

public class ListaLivros {

	private String lista[];
	private int topo;
	
	public ListaLivros(int capacidade) {
		topo = -1; //topo zerado
		this.lista = new String [capacidade];
	}
	public void adicionarLivro(String elemento) {
		if(!cheia()) {
			topo++;
			this.lista[topo]=elemento;
		}else {
			System.out.println("L cheia!\n");
		}
		
	}
	
	
	public String pesquisarLivroJava() { 
		String livro = "Use a cabeça Java";
		if (!vazia()) {
			for (int i = topo; i>=0; i--) { 
				if(lista[i].equals(livro)) { 
					return "bom gosto";
				}
			}
		}
		return "não existe o livro pesquisado";
	}
	
	
	

	
	public boolean cheia() {
		return (topo == (lista.length-1)); 
	}
	public boolean vazia() {
		return (topo == -1);
	}
	
	public String toString(){
		String s = "";
		if(!this.vazia()) {
			s = s+ "[";
			for (int i = 0; i<this.topo; i++) {
				s = s+(this.lista[i]);
				s = s+("");
			}
			
			s= s+this.lista[topo]+"]";
			return s;
		}
		return "[]";
	}
}

