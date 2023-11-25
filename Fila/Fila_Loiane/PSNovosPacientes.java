package Fila.Fila_Loiane;

import java.util.Random;

public class PSNovosPacientes implements Runnable { // Runnable > Interface

	private FilaComPrioridade<Pessoa> fila;
	private int cont = 7;
	private Random prioridade = new Random();

	public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
		super();
		this.fila = fila;
	}

	@Override
	public void run() {		
		for (int i = 0; i < 8; i++) { // Adicionar no máximo 8 pessoas ( Podemos aumentar... ) > Enquanto i for < 8... 
			try {
				Thread.sleep(8000); // A cada 8 segundos colocamos uma pessoa nova
				Pessoa p = new Pessoa("" + cont, prioridade.nextInt(3)); // Vai ser 0 ou 1 ou 3 	> 		Prioridade Aleatória usando Random
				fila.enfileira(p);
				cont++;
				System.out.println(p + " enfileirada.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	}
