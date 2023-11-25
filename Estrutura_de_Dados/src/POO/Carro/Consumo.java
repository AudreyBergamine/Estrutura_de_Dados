package POO.Carro;

import javax.swing.JOptionPane;

public class Consumo {
	public double distancia;
	public double consumo;
	
	public Consumo() {
		
	}
	
	public Consumo(double distancia, double consumo) {
		this.distancia = distancia;
		this.consumo = consumo;
	}
	
	public void calcularConsumo() {
		distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a Distância: "));
		consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite o consumo: "));
		double media_KM_Litro = this.distancia/this.consumo;
		JOptionPane.showMessageDialog(null, "CALCULANDO O CONSUMO: \n" 
				+ "Média de Consumo Km/Litro: " + media_KM_Litro);
		
	}
}
