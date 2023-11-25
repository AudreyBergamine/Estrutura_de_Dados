package POO.At_Carro;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
				
		String marca = JOptionPane.showInputDialog("Digite a MARCA:");
        String modelo =JOptionPane.showInputDialog("Digite o MODELO:");
        String cor = JOptionPane.showInputDialog("Digite a COR:");
        
    
		Carro carro = new Carro(marca,modelo,cor);
		
		carro.showInfos();
		
		
	}

}
