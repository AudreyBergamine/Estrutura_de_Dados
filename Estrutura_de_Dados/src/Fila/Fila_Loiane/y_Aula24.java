package Fila.Fila_Loiane;

public class y_Aula24 {

	public static void main(String[] args) {
		
		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();
		
		fila.enfileira(new Paciente("A", 2)); // Média Prioridade > 2
		fila.enfileira(new Paciente("C", 1)); // Alta Prioridade > 1
		fila.enfileira(new Paciente("B", 3)); // Baixa Prioridade > 3

		System.out.println("Odem da Fila por Prioridade: " + fila); //1 2 3 e nao 1 3 2
		
		System.out.println("Efetuando o atendimento: " + fila.desenfileira());
		
		System.out.println("Fila Atual: " + fila);
	}
}