package Algoritmo_Ordenacao;

// Insertion Sort
public class IS_Prof {

	public void insert(int[]valores) {
		for(int i=1;i<valores.length;i++) {
			int aux=valores[i];
			int j=i-1;
			while((j>=0)&& (aux<valores[j])){
				valores[j+1]= valores[j];
				j--;
			}
			valores[j+1]=aux;
		}
	}

	public static void main(String[] args) {
		int [] v= {5,8,2,20,15,6};
		IS_Prof primeiro= new IS_Prof();
		primeiro.insert(v);
		for(int x : v) {
			System.out.println(x);
		}

	}

}
