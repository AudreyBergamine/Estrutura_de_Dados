package POO.Pessoa;

import javax.swing.JOptionPane;

public class Pessoa2 {
    // Atributos da classe Pessoa
    private String nome;
    private int idade;
    private String profissao;

    // Construtor da classe Pessoa
    public Pessoa2(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    // Getters e setters dos atributos da classe Pessoa
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

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // Método para exibir informações da pessoa
    public void exibirInformacoes() {
        String mensagem = "Nome: " + this.nome + "\nIdade: " + this.idade + "\nProfissão: " + this.profissao;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

    

