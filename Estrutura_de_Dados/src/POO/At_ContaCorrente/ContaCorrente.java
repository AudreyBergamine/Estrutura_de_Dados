package POO.At_ContaCorrente;

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
        JOptionPane.showMessageDialog(null, "Depósito efetuado com sucesso!!");
    }

    public void saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso!!");
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!!");
        }
    }

    public String toString() {
        String conta_str = (this.contaConjunta) ? "sim" : "não";
        String s = "\nNº da conta: " + this.numeroConta +
        			  "\nNome: " + this.nome.toUpperCase() +
                      "\nIdade:  " + this.idade +
                      "\nSexo:  " + this.sexo +
                      "\nConta Conjunta: " + conta_str.toUpperCase() +
                      "\nSaldo: " + this.saldo;
        return s;
    }
}

    