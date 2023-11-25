package Matriz;

import java.util.ArrayList;
import java.util.Scanner;

public class teste {
    
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> carrinho = new ArrayList<Item>();
        
        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Ver carrinho");
            System.out.println("3. Remover item");
            System.out.println("4. Calcular total");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Nome do item: ");
                    String nome = scanner.next();
                    System.out.print("Preço do item: ");
                    double preco = scanner.nextDouble();
                    Item item = new Item(nome, preco);
                    carrinho.add(item);
                    System.out.println("Item adicionado ao carrinho!");
                    break;
                case 2:
                    System.out.println("Itens no carrinho:");
                    for (int i = 0; i < carrinho.size(); i++) {
                        System.out.println((i+1) + ". " + carrinho.get(i).getNome() + " - R$ " + carrinho.get(i).getPreco());
                    }
                    break;
                case 3:
                    System.out.print("Digite o número do item que deseja remover: ");
                    int indice = scanner.nextInt();
                    carrinho.remove(indice-1);
                    System.out.println("Item removido do carrinho!");
                    break;
                case 4:
                    double total = 0;
                    for (int i = 0; i < carrinho.size(); i++) {
                        total += carrinho.get(i).getPreco();
                    }
                    System.out.println("Total: R$ " + total);
                    break;
                case 5:
                    System.out.println("Encerrando programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

class Item {
    private String nome;
    private double preco;
    
    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
}
