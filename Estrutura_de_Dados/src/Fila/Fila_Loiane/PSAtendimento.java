package Fila.Fila_Loiane;

public class PSAtendimento implements Runnable { // Runnable > Interface
	
	private FilaComPrioridade<Pessoa> fila;
	
	public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
		super();
		this.fila = fila;
	}
	

	@Override
	public void run() {		
		while (!fila.estaVazia()) {
			try {
				System.out.println(fila.desenfileira() + " atendida.");
				Thread.sleep(5000); // A cada 5 segundo, uma nova pessoa é atendida
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		System.out.println("Atendimento concluído.");		
	}
	
	
}