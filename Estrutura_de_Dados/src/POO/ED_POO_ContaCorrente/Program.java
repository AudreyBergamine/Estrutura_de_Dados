package POO.ED_POO_ContaCorrente;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente();
		ContaCorrente conta3 = new ContaCorrente();
		
		conta1.setNumeroConta("0001");
		conta1.setNome("Audrey Bergamine");
		conta1.setContaConjunta(false);
		conta1.setSaldo(5500);
		conta1.setSexo('F');
		conta1.setIdade(32);
		
		conta2.setNumeroConta("0002");
		conta2.setNome("Talles Bergamine");
		conta2.setContaConjunta(false);
		conta2.setSaldo(10.500);
		conta2.setSexo('M');
		conta2.setIdade(23);
		
		conta3.setNumeroConta("0003");
		conta3.setNome("Sueli Bergamine");
		conta3.setContaConjunta(true);
		conta3.setSaldo(5.800);
		conta3.setSexo('F');
		conta3.setIdade(66);
		
		
		JOptionPane.showMessageDialog(null, 
		  "" + conta1.toString()
		+ "=========================\n" + "  "
		+ "" + conta2.toString()
		+ "=========================\n" + "  "
		+ "" + conta3.toString());
		

		
		
		
		
		
		
		

	}

}
