package Matriz;


//QUEST�O 2 >>>>>> DEU 100%  CERTO !
import javax.swing.JOptionPane;

public class At_Ex_02 {

	public static void main(String[] args) {
            
     String[] notas_Alunos = new String[5];
     Double notas = 0.0;
     String nomes = "";
     double soma = 0.0;
             
     for (int i = 0; i < notas_Alunos.length; i++) {
     	
     	nomes = JOptionPane.showInputDialog("Insira o NOME do aluno:  " + (i + 1) +"\n");                       	
         notas = Double.parseDouble(JOptionPane.showInputDialog("Digite a NOTA do aluno:  \n" 
         			 								+ nomes +"\n"));
         soma = soma + notas;
         if (notas > 4) {
         	notas_Alunos[i] = nomes + "     Nota: " + notas;            	
         }
     }
     System.out.println("Soma das Notas: " + soma); 
     System.out.println("M�dia da turma: " + (soma/5) + "\n\n");
     
     System.out.println("Alunos que tiraram NOTAS maiores que 4:\n");
     for (int i = 0; i < notas_Alunos.length; i++) {
     	System.out.print(notas_Alunos[i]+ "\n");
     }
     System.out.println();
 }
}

