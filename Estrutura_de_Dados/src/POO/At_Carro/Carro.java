package POO.At_Carro;

import javax.swing.JOptionPane;

public class Carro {
	
	private String marca;
	private String modelo;
	private String cor;
	
	public Carro(String marca, String modelo, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;		
	}
	

	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;	
	}
	

	public String getCor() {
		return cor;	
	}
	
	
	public void showInfos() {		
		String s = "Marca: " + this.marca.toUpperCase() + 
					"\nModelo: " + this.modelo.toUpperCase() + 
					"\nCor: " + this.cor.toUpperCase();
		JOptionPane.showMessageDialog(null, s);		
	}
}
