package Ex_Atividade_01;

//Crie um vetor com capacidade de 10 números inteiros, e mostre os números repetidos.

import javax.swing.JOptionPane;

public class At_01_Ex_01 {

 public static void main(String[] args) {
     int vetor[] = new int[10];
     int num = 0;
     String repetidos = "";

     for(int i=0; i<vetor.length; i++) {
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número ("+(i+1)+"/10):"));
		
			for(int j=0; j<vetor.length; j++) {
				if(vetor[j] == num) {		
					if(!repetidos.contains((" "+num+", "))) repetidos+=num+", ";
				}
			}
		vetor[i]=num;
	}	
	if(repetidos.length()<2) { 
		JOptionPane.showConfirmDialog(null, "Nenhum número se repete");	
	
	}else {
		JOptionPane.showConfirmDialog(null, "Os números que se repetem são: \n\n" + repetidos + "\n" + "\n\n\n *Fim do programa*");	
	}	

	}
}
