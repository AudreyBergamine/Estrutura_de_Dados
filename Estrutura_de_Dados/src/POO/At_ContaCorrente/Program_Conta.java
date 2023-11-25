package POO.At_ContaCorrente;


import javax.swing.JOptionPane;

public class Program_Conta {


	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();


		contaCorrente.setNumeroConta(JOptionPane.showInputDialog("Insira o Nº da Conta Corrente: "));
		contaCorrente.setNome(JOptionPane.showInputDialog("Insira o NOME do titular: "));
		contaCorrente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a IDADE: ")));
		contaCorrente.setSexo(JOptionPane.showInputDialog("Insira o gênero (M ou F): ").charAt(0));
		contaCorrente.setContaConjunta(JOptionPane.showInputDialog("A conta é conjunta? (S ou N): ").equalsIgnoreCase("S"));
		contaCorrente.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Insira o SALDO: " + "\n\nExemplo: 1000.00")));

		
		String menu;
		do {
			menu = JOptionPane.showInputDialog("\n*| ESCOLHA UMA OPÇÃO |*\n"+
					"\n 1 - Depósitar" +
					"\n 2 - Sacar" +
					"\n 3 - Ver informações" +
					"\n 0 - Sair" + "\n\n");

			switch (menu) {
			case "1":
				double valorDep = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para depósito:"));
				contaCorrente.deposito(valorDep);
				
				break;
				
			case "2":
				double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para saque:"));
				contaCorrente.saque(valorSaque);
				
				break;
				
			case "3":
				JOptionPane.showMessageDialog(null, contaCorrente);
				
				break;
				
			case "0":
				JOptionPane.showMessageDialog(null, "Saindo do programa...");
				
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		} while (!menu.equals("0"));
	}
}

