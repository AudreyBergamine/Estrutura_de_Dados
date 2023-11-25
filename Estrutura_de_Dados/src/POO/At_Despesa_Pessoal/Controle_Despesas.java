package POO.At_Despesa_Pessoal;

import javax.swing.JOptionPane;
// import java.util.List;
import java.time.LocalDate;


@SuppressWarnings("unused")
public class Controle_Despesas {
	public static void main(String[] args) {
		String cpf = JOptionPane.showInputDialog("Digite o CPF:");
		Despesa_Pessoal despesaPessoal = new Despesa_Pessoal(cpf, 0);
		
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
							"\n*| ESCOLHA UMA OPÇÃO |*  \n\n" +
							"1 - Lançamento das despesas\n" +
							"2 - Total geral de despesas\n" +
							"3 - Total de despesas por mês/ano\n" +
							"4 - Total de despesas por dia/mês/ano\n" +
							"5 - Imprimir todas as despesas\n" +
							"6 - Imprimir despesas por mês/ano\n" +
							"7 - Imprimir despesas por dia/mês/ano\n" +
							"8 - Sair" + "\n\n"));

			switch (opcao) {
			case 1:
				String data = JOptionPane.showInputDialog("Digite a data (dd/mm/aaaa):");
				double desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o desconto:"));
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
				Despesa despesa = new Despesa(data, desconto, valor);
				despesaPessoal.adicionarDespesa(despesa);
				break;
			case 2:
				double totalGeral = despesaPessoal.calcularTotalGeralDespesas();
				JOptionPane.showMessageDialog(null, "Total geral de despesas: R$" + totalGeral);
				break;
			case 3:
				String mesAno = JOptionPane.showInputDialog("Digite o mês/ano (mm/aaaa):");
				String[] parts = mesAno.split("/");
				String mes = parts[0];
				String ano = parts[1];
				double totalMesAno = despesaPessoal.calcularTotalDespesasMesAno(mes, ano);
				JOptionPane.showMessageDialog(null, "Total de despesas do mês/ano: R$" + totalMesAno);
				break;
			case 4:
				String diaMesAno = JOptionPane.showInputDialog("Digite o dia/mês/ano (dd/mm/aaaa):");
				String[] parts2 = diaMesAno.split("/");
				String dia = parts2[0];
				String mes2 = parts2[1];
				String ano2 = parts2[2];
				double totalDiaMesAno = despesaPessoal.calcularTotalDespesasDiaMesAno(dia, mes2, ano2);
				JOptionPane.showMessageDialog(null, "Total de despesas do dia/mês/ano: R$" + totalDiaMesAno);
				break;
			case 5:
				despesaPessoal.imprimirDespesas();
				break;
			case 6:
				String mesAno2 = JOptionPane.showInputDialog("Digite o mês/ano (mm/aaaa):");
				String[] parts3 = mesAno2.split("/");
				String mes3 = parts3[0];
				String ano3 = parts3[1];
				despesaPessoal.imprimirDespesasMesAno(mes3, ano3);
				break;
			case 7:
				String diaMesAno2 = JOptionPane.showInputDialog("Digite o dia/mês/ano (dd/mm/aaaa):");
				String[] parts4 = diaMesAno2.split("/");
				String dia2 = parts4[0];
				String mes4 = parts4[1];
				String ano4 = parts4[2];
				despesaPessoal.imprimirDespesasDiaMesAno(dia2, mes4, ano4);
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Saindo do programa...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}
		} while (opcao != 8);
	}
}

