package POO.Candidato;

//Passo 1: Crie a classe Candidato
public class Candidato {
 private String nome;
 private int quantidadeVotos;

 // Passo 3: Implemente os getters e setters
 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public int getQuantidadeVotos() {
     return quantidadeVotos;
 }

 // Passo 2: Implemente o método acrescentarVoto
 public void acrescentarVoto() {
     quantidadeVotos++;
 }
}

