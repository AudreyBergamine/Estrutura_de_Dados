package ListaEncadeada.LE_Contato_Audrey;


public class No{
	private Contato contato;
	private No proximo;
	
	No(Contato contato){
		this.contato = contato;
		this.proximo = null;
	}

	Contato getContato() {
		return this.contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public No getProximo() {
		return proximo;
	}
	
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "No: " + "[Contato: " + contato  + " "+ "Proximo: --->>>" + proximo + "]";
	}

}
