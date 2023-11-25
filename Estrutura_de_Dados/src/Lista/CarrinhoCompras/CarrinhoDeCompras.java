package Lista.CarrinhoCompras;

import java.util.Scanner;

public class CarrinhoDeCompras{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        

        // Definir o tamanho máximo do carrinho
        int maxItens = 10;

        // Criar os vetores e matrizes para armazenar as informações do carrinho
        String[] produtos = new String[maxItens];
        double[] precos = new double[maxItens];
        int[] quantidades = new int[maxItens];
        double[][] totalPorItem = new double[maxItens][2]; // [0] = preço total, [1] = quantidade

        // Variáveis auxiliares
        int numItens = 0;
        double valorTotal = 0;

        // Loop para adicionar itens ao carrinho
        while (true) {
            // Pedir ao usuário para digitar o nome do produto
            System.out.print("Digite o nome do produto (ou 'fim' para encerrar): ");
            String produto = sc.nextLine();

            // Verificar se o usuário digitou 'fim'
            if (produto.equalsIgnoreCase("fim")) {
                break;
            }

            // Pedir ao usuário para digitar o preço do produto
            System.out.print("Digite o preço do produto: ");
            double preco = Double.parseDouble(sc.nextLine());

            // Pedir ao usuário para digitar a quantidade do produto
            System.out.print("Digite a quantidade do produto: ");
            int quantidade = Integer.parseInt(sc.nextLine());

            // Adicionar as informações do produto aos vetores e matrizes
            produtos[numItens] = produto;
            precos[numItens] = preco;
            quantidades[numItens] = quantidade;
            totalPorItem[numItens][0] = preco * quantidade;
            totalPorItem[numItens][1] = quantidade;

            // Atualizar as variáveis auxiliares
            numItens++;
            valorTotal += preco * quantidade;

            // Verificar se o carrinho está cheio
            if (numItens == maxItens) {
                System.out.println("Carrinho cheio! Não é possível adicionar mais itens.");
                break;
            }
        }

        // Imprimir o resumo do carrinho
        System.out.println("\nRESUMO DO CARRINHO:");
        for (int i = 0; i < numItens; i++) {
            System.out.printf("%s x%d: R$ %.2f\n", produtos[i], quantidades[i], totalPorItem[i][0]);
        }
        System.out.printf("Valor total: R$ %.2f\n", valorTotal);
    }
}

