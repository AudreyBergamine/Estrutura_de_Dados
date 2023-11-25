package POO.Conta_Corrente;



import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente();
        
        System.out.print("Digite o seu nome: ");
        cc.setName = sc.nextInt();

        System.out.print("Digite o número da conta corrente: ");
        cc.setAcount = sc.nextInt();

        System.out.print(cc);
       
        sc.close();
    }
}