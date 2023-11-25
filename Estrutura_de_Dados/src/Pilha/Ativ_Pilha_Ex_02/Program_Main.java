package Pilha.Ativ_Pilha_Ex_02;

import javax.swing.JOptionPane;

public class Program_Main {

	public static void main(String[] args) {
		
		Pilha_Int pilha = new Pilha_Int(10);
			
		// Preenchendo a pilha
		int i = 1;
        while (i <= pilha.getTamanho()) {
        	int elemento = Integer.parseInt(JOptionPane.showInputDialog("Insira o número " + (i) + " de 10: ")); 
            	
        	if (elemento % 2 == 1) { // Se o número for ímpar empilhe na pilha 
        		if (pilha.empilhar(elemento) == true) {
        			i++;					
				}                
            } else { // Se for número par, tente desempilhar
            	if (pilha.vazia()) { // Se a pilha estiver vazia
            		JOptionPane.showMessageDialog(null, "A pilha está vazia!");
                } else { // Se não estiver vazia e o número for par desempilhe um número da pilha              	
                	if (pilha.desempilhar(elemento) == true) {
                		JOptionPane.showMessageDialog(null, "Elemento desempilhado!");
                		i--;
					}                
                }
            }
        } 
        JOptionPane.showMessageDialog(null, "Pilha: " + pilha.toString());
	}
}
