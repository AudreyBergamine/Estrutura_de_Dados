package POO.ED_POO_ContaCorrente;

import javax.swing.JOptionPane;

public class ContaCorrente {

    private String nome;
    private int idade;
    private char sexo;
    private String numeroConta;
    private boolean contaConjunta;
    private double saldo;

    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public boolean isContaConjunta() {
		return contaConjunta;
	}

	public void setContaConjunta(boolean contaConjunta) {
		this.contaConjunta = contaConjunta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }

    @Override
	public String toString() {
		return "\nNumero da Conta: " + numeroConta
				+ "\nNome: " + nome 
				+ "\nIdade: " + idade 
				+ "\nSexo: " + sexo 
				+ "\nConta Conjunta: " + contaConjunta
				+ "\nSaldo: " + saldo 
				+ "\n\n";
	}       
}