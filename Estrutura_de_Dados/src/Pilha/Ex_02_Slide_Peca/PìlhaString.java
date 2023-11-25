package Pilha.Ex_02_Slide_Peca;

import java.util.Scanner;

public class PìlhaString {
	String pilha[];
	int topo;

	public PìlhaString(int capacidade) {
		topo = -1; //topo zerado
		this.pilha = new String [capacidade];
	}
	public void push(String elemento) {
		if(!cheia()) {
			topo++;
			this.pilha[topo]=elemento;
		}else {
			System.out.println("Pilha cheia! \n");
		}

	}

	public String pop() {
		String valor = "";
		if (!vazia()) {
			valor = pilha[topo];
			pilha[topo] = null;
			topo--;
			System.out.println("Item desempilhado \n");
		}else {
			System.out.println("A lista já está vazia! \n");
		}
		return valor;

	}

	public boolean pecaDefeituosa(String pecaComDefeito) { //Parâmetro de peça com defeito
		if (!vazia()) {
			String vetor_temp [] = new String[pilha.length]; //Vetor para armazenar os dados retirados da pilha.
			@SuppressWarnings("resource")
			Scanner leitor = new Scanner(System.in); //Scanner para usuário digitar a nova peça
			for (int i = topo; i>0; i--) { //Loop, onde será desempilhado a pilha atual.
				vetor_temp[i] = pilha[i]; //Primeiro o valor atual de pilha[] é armazenado no vetor vetor_temp[].

				if(this.pop().equals(pecaComDefeito)) { 
					// é chamado o método pop() que retorna a String que ele desempilha. 
					//Em seguida o método equals é chamado comparando a var pecaComDefeito com a que foi desempilhada pelo pop.

					System.out.print("Digite o NOME da nova peça que irá substituir a peça defeituosa: "); //Print para digitar o nome da peça nova
					this.push(leitor.nextLine()); //A peça é adicionada por meio do scanner.

					for (int j = i+1; j<pilha.length; j++) { //Retornando os valores da pilha_temp para a pilha original
						this.push(vetor_temp[j]); //Método push armazena os valores do vetor armazenador na pilha.
					}
					leitor.close(); 
					return true; 
				}
			}
		}
		return false;
	}



	public boolean cheia() {
		return (topo == (pilha.length-1)); 
	}
	public boolean vazia() {
		return (topo == -1);
	}




	public String toString() {
		String s = "";
		if (!this.vazia()) {
			s = s + "\n ";
			for (int i = this.topo; i > 0; i--) {
				s = s + (this.pilha[i]);
				s = s + ("\n ");
			}

			s = s + this.pilha[0] + " "; 
			return s;
		}
		return "[]";
	}

	
	
	
	//	public String toString(){
	//		String s = "";
	//		if(!this.vazia()) {
	//			s = s+ "[";
	//			for (int i = 0; i<this.topo; i++) {
	//				s = s+(this.pilha[i]);
	//				s = s+(", ");
	//			}
	//
	//			s= s+this.pilha[topo]+"]";
	//			return s;
	//		}
	//		return "[]";
	//	}





}

