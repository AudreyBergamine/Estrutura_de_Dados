package POO.Pessoa;

import javax.swing.JOptionPane;

public class Program {
	 
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:"));
        String profissao = JOptionPane.showInputDialog("Digite a profissão da pessoa:");

       Pessoa pessoa = new Pessoa(nome, idade, profissao);

        System.out.println(pessoa.getNome()+pessoa.getIdade()+pessoa.getProfissao());
    }
}
