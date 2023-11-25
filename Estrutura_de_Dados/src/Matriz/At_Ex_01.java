package Matriz;


//QUEST�O 1 >>>>>> DEU 100%  CERTO !
import javax.swing.JOptionPane;

public class At_Ex_01 {

	public static void main(String[] args) {		
				
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Insira a ALTURA do Triangulo em número inteiro: "));
		
		int[][] triangulo = new int[altura][altura/altura];		
		String estrela = "";		
		int cont = 0;
		boolean contValido = false;
		do {			
			for (int i = 0; i< triangulo.length; i++) {
				for (int j = 0; j < triangulo[i].length; j++) {
					estrela += "*";			
					cont++;
					System.out.println(estrela);
					
					if (cont == altura) {
						contValido = true;
					}
				}
			}					
		} while (!contValido);		
	}
}


