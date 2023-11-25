package POO.Candidato;

public class Program {
    public static void main(String[] args) {
        // Crie um objeto Candidato
        Candidato candidato1 = new Candidato();
        
        // Configure o nome do candidato
        candidato1.setNome("Candidato A");

        // Simule votação adicionando votos
        candidato1.acrescentarVoto();
        candidato1.acrescentarVoto();
        candidato1.acrescentarVoto();

        // Obtenha e imprima o nome e a quantidade de votos do candidato
        System.out.println("Nome do candidato: " + candidato1.getNome());
        System.out.println("Quantidade de votos: " + candidato1.getQuantidadeVotos());
    }
}
