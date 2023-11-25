package Matriz;

//QUEST�O 3 >>>>>> DEU 100%  CERTO ! 

import javax.swing.JOptionPane;

public class At_Ex_03 {

 public static void main(String[] args) {
     int elementos[] = new int[10];
     int numeroDigitado = 0;
     String num_repetidos = "";

     for(int ind1=0; ind1<elementos.length; ind1++) {
		numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o n�mero: \n(" + (ind1 + 1)+"/10)"));		
			for(int ind2=0; ind2<elementos.length; ind2++) {
				if(elementos[ind2] == numeroDigitado) {		
					if(!num_repetidos.contains((" "+numeroDigitado+", "))) num_repetidos+=numeroDigitado+", ";
				}
			}
		elementos[ind1]=numeroDigitado;
	}	
	if(num_repetidos.length()<2) { 
		JOptionPane.showConfirmDialog(null, "Nenhum número se repete");	
	
	}else {
		JOptionPane.showConfirmDialog(null, "Os n�meros que se repetem são: \n\n" + num_repetidos + "\n" + "\n");	
	}

	}
}