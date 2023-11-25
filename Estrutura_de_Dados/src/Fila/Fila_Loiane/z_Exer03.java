package Fila.Fila_Loiane;

/* FILA DO PRONTO SOCORRO:
 Utilize a classe Fila para simular um sistema de senhas de um pronto Socorro
 Cada pessoa deve ser classificada com 3 códigos:
 - Vermelho =>>> Prioridade Alta (Maior)
 - Amarelo =>>> Prioridade Média
 - Verde =>>> Prioridade Baixa - Quando a situação não é grave e a pessoa pode esperar mais tempo
 
 O programa deve obedecer ás seguinte condições: 
 - Enfileire 6 pessoas na fila inicial
 - Pessoas com prioridade vermelha devem ser atendidas primeiro
 - Cada consulta dura cerca de 5 segundos, e depois o próximo da fila é chamado
 - A cada 4 segundos, uma pessoa chega no pronto socorro com prioridade aleatória
 (Crie um código java para criar a aleatoriedade) 
 */

public class z_Exer03 { 
	
	public static final int VERMELHO = 0;			// Constante
	public static final int AMARELO = 1;				// Constante
	public static final int VERDE = 2;					// Constante

	public static void main(String[] args) {
		
		FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();
		fila.enfileira(new Pessoa("1", VERDE)); // Número de chegada + Prioridade
		fila.enfileira(new Pessoa("2", AMARELO));
		fila.enfileira(new Pessoa("3", VERMELHO));
		fila.enfileira(new Pessoa("4", VERDE));
		fila.enfileira(new Pessoa("5", VERDE));
		fila.enfileira(new Pessoa("6", VERMELHO));
		
		// Iniciando o Atendimento
		PSAtendimento atendimento = new PSAtendimento(fila);
		PSNovosPacientes pacientes = new PSNovosPacientes(fila);
		
		Thread t1 = new Thread(atendimento);
		Thread t2 = new Thread(pacientes);
		
		t1.start();
		t2.start();
	}
}