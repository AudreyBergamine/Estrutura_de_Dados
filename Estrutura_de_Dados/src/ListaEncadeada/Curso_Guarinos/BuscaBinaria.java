package ListaEncadeada.Curso_Guarinos;

import javax.swing.JOptionPane;

// Complexidade é:     O(log n)
public class BuscaBinaria {

	public static void main(String[] args) {
		int[] vetor = new int[10000];
		
		// Preenchendo o vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]= i*2; 
			//System.out.println(vetor[i]);
		}
		
		// Inserir numero para buscar
		int buscado = Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja buscar? \n"));
		
		// Busca Binária
		boolean achou = false;
		int inicio = 0;
		int meio = 0;
		int fim = vetor.length;
		
		int contador =0; // Para fazer o teste de velocidade e quantidade de passagens no while
		
		// LOOP PARA REALIZAR A BUSCA NO VETOR
		while (inicio <= fim ) {
			meio = (int) ((inicio + fim )/2);
			contador++;
			
			// Se o Pivô for o número buscado
			if (vetor[meio] ==  buscado) { 
				achou = true;
				break;			
				
			// Se o número Pivô(meio) for  MENOR que o número buscado - Vai p/ Direira 
			} else if (vetor[meio] < buscado) { 
				inicio = meio +1;
			
			// Se o número Pivô(meio) for  MAIOR que o número buscado - Vai p/ Esquerda	
			} else { 
				fim = meio -1;
			}
		}
		// Resultado da busca: 
		if (achou == true) {
			JOptionPane.showMessageDialog(null, "Achou !!! \n" + "Foram realizados " + contador + " buscas");
		} else {
			JOptionPane.showMessageDialog(null, "Não achou !!! \n"+ "Foram realizados " + contador + " buscas");
		}
		
		
		
		
		
		
		

	}

}
