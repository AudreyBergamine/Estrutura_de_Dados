package Algoritmo_Ordenacao;

// Bubble Sort Prof
public class BS_Prof {

	/*
				 É um algoritmo de ordenação que percorre os
			elementos de um vetor e compara com o seu
			próximo
	 */

public void bubble(int []valores) {
	for(int i=0;i<valores.length;i++) {
		for(int j=0;j<valores.length-1-i;j++) {
			if(valores[j]>valores[j+1]) {
				int aux=valores[j];
				valores[j]=valores[j+1];
				valores[j+1]=aux;
			}
		}
	}
}


public static void main(String[] args) {
	int [] v= {5,8,2,20,15,6};
	BS_Prof primeiro= new BS_Prof();
	primeiro.bubble(v);
	for(int x : v) {
	System.out.println(x);
	}

}

}
