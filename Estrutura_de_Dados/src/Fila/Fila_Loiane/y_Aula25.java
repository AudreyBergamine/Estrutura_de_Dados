package Fila.Fila_Loiane;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class y_Aula25 {

	public static void main(String[] args) {
		
		Queue<Paciente> filaComPrioridade = new PriorityQueue<>( new Comparator<Paciente>() {
				// Queue > Interface                   PriorityQueue > Fila com Prioridade				Comparator > Interface
				
					@Override
					public int compare(Paciente p1, Paciente p2) {
//						if (p1.getPrioridade() > p2.getPrioridade()) {
//							return 1;
//						} else if (p1.getPrioridade() < p2.getPrioridade()) {
//							return -1;
//						}
						return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
					}
				}
		);
		
		filaComPrioridade.add(new Paciente("A", 2));
		filaComPrioridade.add(new Paciente("B", 1));
		
		System.out.println(filaComPrioridade);

	}
}