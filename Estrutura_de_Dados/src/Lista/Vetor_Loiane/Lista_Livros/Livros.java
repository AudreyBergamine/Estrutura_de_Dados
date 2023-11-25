package Lista.Vetor_Loiane.Lista_Livros;

//import java.util.Objects;

//import javax.swing.JOptionPane;

public class Livros {
	private String nome_Livro;
	private String nome_Autor;
	private String isbn;
	
	public Livros(String nome_Livro, String nome_Autor, String isbn) {
		super();
		this.nome_Livro = nome_Livro;
		this.nome_Autor = nome_Autor;
		this.isbn = isbn;
	}

	public Livros() {}
	
	public String getNome_Livro() {
		return nome_Livro;
	}
	public void setNome_Livro(String nome_Livro) {
		this.nome_Livro = nome_Livro;
	}
	public String getNome_Autor() {
		return nome_Autor;
	}
	public void setNome_Autor(String nome_Autor) {
		this.nome_Autor = nome_Autor;
	}
	public String getISBN() {
		return isbn;
	}
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Nome do Livro: " + nome_Livro + "\n"
				+ "Nome do Autor: " + nome_Autor + "\n"
				+ "ISBN: " + isbn + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((nome_Livro == null) ? 0 : nome_Livro.hashCode());
		result = prime * result
				+ ((nome_Autor == null) ? 0 : nome_Autor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Livros other = (Livros) obj;
		if (isbn == null) {
			if (other.isbn != null) {
				return false;
			}
		} else if (!isbn.equals(other.isbn)) {
			return false;
		}
		if (nome_Livro == null) {
			if (other.nome_Livro != null) {
				return false;
			}
		} else if (!nome_Livro.equals(other.nome_Livro)) {
			return false;
		}
		if (nome_Autor == null) {
			if (other.nome_Autor != null) {
				return false;
			}
		} else if (!nome_Autor.equals(other.nome_Autor)) {
			return false;
		}
		return true;
	}
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(email, nome, telefone);
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Contato other = (Contato) obj;
//		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome)
//				&& Objects.equals(telefone, other.telefone);
//	}

}
