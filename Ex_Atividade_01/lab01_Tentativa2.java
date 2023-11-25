package Ex_Atividade_01;

import javax.swing.JOptionPane;

public class lab01_Tentativa2 {

	public static void main(String[] args) {
	int vetor[] = new int[10];
	String repetidos = " ";
	int num = 0;
	for(int i=0; i<vetor.length; i++) {
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número ("+(i+1)+"/10):"));
		
		
		//Antes de adicionar no vetor, vamos verificar se o número ja existe no vetor, fazendo um novo for:
		// nosso variável não pode mais ser "i" pois ja estamos utilizando ela dentro deste laço, então, vamos chamar essa outra variável de j.
			for(int j=0; j<vetor.length; j++) {
				//para cada número ja adicinado no vetor, vamos verificar se é igual ao número que estamos tentando adicionar.
				//caso for igual, vamos adicionar no objeto String "repetidos" criado no inicio do código
				if(vetor[j] == num) {		
					//vamos verificar se ja foi adicionado na String "repetidos", se não tiver sido, vamos adicionar
					if(!repetidos.contains((" "+num+", "))) repetidos+=num+", ";
					// o ! significa "não", se ele estiver no inicio, significa que estamos atrás do contrário. nesse caso, queremos não contenha (contains) o texto acima
				}
			}
		vetor[i]=num; // Adicionamos o num no vetor depois de verificar se o número foi adicionado na string repetições
	}
	
	//verificamos se há algo escrito na String "repetidos", se tiver, significa que há repetições, se não, não.
	if(repetidos.length()<2) { //verificamos se é menor que 2 pois estamos contando com o espaço em branco que está na String "repetidos"
		JOptionPane.showConfirmDialog(null, "Nenhum número se repete");	
	
	} else {
		JOptionPane.showConfirmDialog(null, "Os números que se repetem são: \n" + repetidos + "\n" + "fim do programa.");	
	}

	}

}
