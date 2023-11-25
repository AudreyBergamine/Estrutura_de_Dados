package POO.At_Despesa_Pessoal;

public class Despesa {
	private String data;
	private double desconto;
	private double valor;

	public Despesa(String data, double desconto, double valor) {
		this.data = data;
		this.desconto = desconto;
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public double getDesconto() {
		return desconto;
	}

	public double getValor() {
		return valor;
	}

}
