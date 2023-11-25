package POO.Carro;

public class Carro {
	public String marca;
	public String modelo;
    public int ano;
    public String cor;

    public Carro() {
    }       

    public Carro(String marca, String modelo, int ano, String cor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}


	public void mover() {
        System.out.println("Movendo...");
        
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
    }   
    
}