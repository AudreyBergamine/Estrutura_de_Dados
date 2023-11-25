package POO.At_Despesa_Pessoal;


@SuppressWarnings("unused")
class Despesa_Pessoal {
	private String cpf;
    private Despesa[] despesas;
    private int tamanho;

    public Despesa_Pessoal(String cpf, int capacidade) {
        this.cpf = cpf;
        this.despesas = new Despesa[capacidade];
        this.tamanho = 0;
    }

    public void adicionarDespesa(Despesa despesa) {
        if (tamanho < despesas.length) {
            despesas[tamanho] = despesa;
            tamanho++;
        } else {
            System.out.println("A capacidade máxima de despesas foi atingida.");
        }
    }

    public double calcularTotalGeralDespesas() {
        double total = 0;
        for (int i = 0; i < tamanho; i++) {
            total += despesas[i].getValor() - despesas[i].getDesconto();
        }
        return total;
    }

    public double calcularTotalDespesasMesAno(String mes, String ano) {
        double total = 0;
        for (int i = 0; i < tamanho; i++) {
            String[] data = despesas[i].getData().split("/");
            if (data[1].equals(mes) && data[2].equals(ano)) {
                total += despesas[i].getValor() - despesas[i].getDesconto();
            }
        }
        return total;
    }

    public double calcularTotalDespesasDiaMesAno(String dia, String mes, String ano) {
        double total = 0;
        for (int i = 0; i < tamanho; i++) {
            String[] data = despesas[i].getData().split("/");
            if (data[0].equals(dia) && data[1].equals(mes) && data[2].equals(ano)) {
                total += despesas[i].getValor() - despesas[i].getDesconto();
            }
        }
        return total;
    }

    public void imprimirDespesas() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Data: " + despesas[i].getData());
            System.out.println("Valor: " + despesas[i].getValor());
            System.out.println("Desconto: " + despesas[i].getDesconto());
            System.out.println("------------");
        }
    }

    public void imprimirDespesasMesAno(String mes, String ano) {
        for (int i = 0; i < tamanho; i++) {
            String[] data = despesas[i].getData().split("/");
            if (data[1].equals(mes) && data[2].equals(ano)) {
                System.out.println("Data: " + despesas[i].getData());
                System.out.println("Valor: " + despesas[i].getValor());
                System.out.println("Desconto: " + despesas[i].getDesconto());
                System.out.println("------------");
            }
        }
    }

    public void imprimirDespesasDiaMesAno(String dia, String mes, String ano) {
        for (int i = 0; i < tamanho; i++) {
            String[] data = despesas[i].getData().split("/");
            if (data[0].equals(dia) && data[1].equals(mes) && data[2].equals(ano)) {
                System.out.println("Data: " + despesas[i].getData());
                System.out.println("Valor: " + despesas[i].getValor());
                System.out.println("Desconto: " + despesas[i].getDesconto());
                System.out.println("------------");
            }
        }
    }
}

