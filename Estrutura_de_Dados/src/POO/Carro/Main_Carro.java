package POO.Carro;

import javax.swing.JOptionPane;

public class Main_Carro {
    
	public static void main(String[] args) {
		Carro carrinho = new Carro();
        carrinho.mover();

        carrinho.marca = "Fiat";
        carrinho.modelo = "Argo";
        carrinho.ano = 1990;
        carrinho.cor = "Preto";
        System.out.println("Exibindo informações do carro 1");
        carrinho.exibirInformacoes();
        System.out.println("\n\n");


        // Não pode usar direto 
        String marca = JOptionPane.showInputDialog("Digite a MARCA:");
        String modelo =JOptionPane.showInputDialog("Digite o MODELO:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ANO:"));
        String cor = JOptionPane.showInputDialog("Digite a COR:");
        Carro carrinho2 = new Carro(marca, modelo, ano, cor);
		
		
		System.out.println("Exibindo informações do carro 2");
		carrinho2.exibirInformacoes();
		

        
		System.out.println("Calculando o consumo:");
		Consumo consumo1 = new Consumo();
		
		consumo1.distancia = 517.00;
		consumo1.consumo = 42.00;
		
		consumo1.calcularConsumo();
		
	}

}

    
