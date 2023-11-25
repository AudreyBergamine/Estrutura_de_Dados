package POO.Conta_Corrente;

public class ContaCorrente {
    private String name;
    private String acount;
    private double saldo;
    
    public int setName;
    public int setAcount;

    public ContaCorrente() {}

    public ContaCorrente(String name, String acount, double saldo) {
        this.name = name;
        this.acount = acount;
        this.saldo = saldo;
    }
    public ContaCorrente(String name, String acount) {
        this.name = name;
        this.acount = acount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcount() {
        return acount;
    }

    public void setAcount(String acount) {
        this.acount = acount;
    }

    public double getSaldo() {
        return saldo;
    }

    public double Deposit(double value){
        return saldo += saldo + value;
    }

    public double Saque(double value) {
        return saldo -= saldo - value - 5.0;
    }

    @Override
    public String toString() {
        return "Name do correntista: " + name 
        + "\nConta: " + acount 
        + "\nSaldo: $ " + String.format("%.2f", saldo)
        + "\n";
    }    
}

