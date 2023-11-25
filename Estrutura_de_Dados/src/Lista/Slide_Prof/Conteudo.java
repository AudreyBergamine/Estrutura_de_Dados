package Lista.Slide_Prof;

public class Conteudo {
	/* Lista-Adicionar
	 public class Numeros {
		int qtdItens; // Numero de itens da lista
		int tamanho; // Tamanho da lista / quantos itens
		ocupam a lista
		int[] itens;// Metodoconstrutor
		Numeros(int n) {
		this.qtdItens= n;
		this.tamanho= 0;
		itens = new int[n];
		}
		public void adicionar(int n) {
		itens[tamanho] = n;
		tamanho++;
		}
		public int getNrItens(){
		return qtdItens;
		}
		public int getTamanho(){
		return tamanho;
		}
		public void imprimir(){
		System.out.print("[");
		for(int i=0; i < getTamanho(); i++){
		System.out.print(itens[i]);
		if(i < getTamanho()-1)
		System.out.print(", ");
		}System.out.print("]\n");
		}} 
	 */
	
	
	
	/* Lista-Principal
	  
	 import java.util.Arrays;
		public class Principal {
		public static void main(String[] args) {
		Numeros lista= new Numeros(3);
		lista.adicionar(5); // 0
		lista.adicionar(7); // 1
		lista.adicionar(8); // 2
		lista.imprimir();	 
	 */
	
	
	
	
	/* Lista de Caracteres
	  public class Caracteres {
		char[] lista;
		int nrItens;
		int tamanho;
		Caracteres(int nrItens) {
		this.tamanho = 0;
		this.nrItens = nrItens;
		lista = new char[nrItens];
		}
		public void adicionar(char c){
		lista[tamanho] = c;
		tamanho++; }
		
		public String concatenar(){
		String s="";
		for (int i=0; i < tamanho; i++){
		s = s + lista[i];
		}
		return s;
		}
		public int getTamanho(){
		return this.tamanho;
		}
		public int getNrItens(){
		return this.nrItens;
		} 
	 */
	
	
	
	
	/* Lista-Principal
	 Caracteres lista = new Caracteres(50);
		lista.adicionar('a');
		lista.adicionar('b');
		lista.adicionar('e');
		lista.adicionar('l');
		lista.adicionar('h');
		lista.adicionar('a');
		System.out.println(lista.concatenar());
		} 
	 */
	
	
	
	
	/* Lista-String
	 
	 public class Caracteres {
		String[] lista;
		int nrItens;
		int tamanho;
		Caracteres(int nrItens) {
		this.tamanho = 0;
		this.nrItens = nrItens;
		lista = new String[nrItens];
		}
	public void adicionar(String palavras){
		lista[tamanho] = palavras;
		tamanho++;
		} 
	 
		public String concatenar(){
			String s="";
			for (int i=0; i < tamanho; i++){
			s = s + " "+lista[i];
			}
			return s;
			}
		public int getTamanho(){
			return this.tamanho;
			}
		public int getNrItens(){
			return this.nrItens;
			}	 
	 */
	
	
	
	
	/* Principal
	 Caracteres lista = new Caracteres(50);
		lista.adicionar("Ana");
		lista.adicionar("Carol");
		lista.adicionar("Luiz");
		lista.adicionar("Priscila");
		System.out.println(lista.concatenar());	 
	 */
	
	
	/* Quando adicionamos um elemento é interessante aumentar a nossa
		lista. O método adicionar melhorado:
		
		public void adicionar(int n) {
			qtdItens = qtdItens * 2;
			int [] auxiliar = itens;
			this.itens = new int[qtdItens];
			this.itens = Arrays.copyOf(auxiliar,qtdItens);
			itens[tamanho] = n;
			tamanho++;
	 
	 
	 */
	
	
	/* Podemos adicionar um elemento escolhendo uma posição:
		public void adicionar(int posicao, int n) {
			if (posicao <= tamanho && posicao >= 0) {
			if (this.tamanho >= this.qtdItens) {
			qtdItens = qtdItens * 2;
			int [] auxiliar = itens;
			this.itens = new int[qtdItens];
			this.itens = Arrays.copyOf(auxiliar,qtdItens);
			itens[tamanho] = n;
			tamanho++;
			}	 
	 */
	
	
	
	
	
	/* Lista-Pesquisar
	 public int pesquisar(int n){
		int i;
		for (i = 0; i < getTamanho() &&
		itens[i] != n; i++) {
		}
		if (itens[i] == n)
		return i;
		else
		return -1;
		}


		Principal
		System.out.println("Procurando 3 na
		lista -> Resultado índice
		="+lista.pesquisar(4));
		lista.imprimir();
	 	 */
	
	/* 
	 Remover
	Esse método remove o último elemento da lista
	public boolean remover() {
		if (this.tamanho < this.qtdItens && this.tamanho > 0) {
		itens[tamanho-1] = 0;
		tamanho--;
		return true;
		}
		return false;
		}
	 */
	
	/*
	 * POO-Objetos
	 * 
	Na programação OO, objetos são usados para
	representar entidades do mundo real ou computacional.
	
	Na POO os objetos possuem características e
	comportamentos.
	As características também podem ser chamadas de dados ou
	atributos.
	
	Enquanto os comportamentos também podem ser chamados
	de operações ou métodos.
	 */
	
	/*
	 * POO-Classe
	 * 
	Classe-uma classe é o projeto de um objeto. Por exemplo, com a classe
	botão podemos criar vários botões diferentes e cada botão poderá ter sua
	cor e formato diferente
	
	Objeto- são construídos a partir da classe. Para criar um objeto
	precisamos de duas classes, uma para tipo de objeto que deseja usar e
	outra para testar.
	
	Os objetos são vistos como representações concretas
	(instâncias) das classes.
	
	 */

	
		/*
		 * public class Carro {
				int ano;
				String marca;
				String modelo;
				public int getAno() {
				return ano;
				}
				
			public Carro(int ano, String marca, String modelo) {
				this.ano = ano;
				this.marca = marca;
				this.modelo = modelo;
				}
				
			public void setAno(int ano) {
				this.ano = ano; }
				
			public static void main(String[] args) {
				Carro carrinho = new Carro();
				carrinho.setAno(1992);//inserir o valor
				System.out.println("O ano do carro é :"+carrinho.getAno());
				
				
				Carro carrinho= new Carro(1964,"VW","Brasilia");
				// carrinho.setAno(1992);//inserir o valor
				System.out.println("O ano do carro é :"+carrinho.getAno());
				
				
				
				
				public class Carro {
					int ano;
					String marca;
					String modelo;
					Pessoa dono;
					public void setDono(Pessoa dono){
					this.dono=dono;
					}
					public Pessoa getDono(){
					return dono;
					}
					
				Carro carrinho = new Carro();
					Pessoa p1 = new Pessoa();
					p1.setNome("Ana");
					p1.setIdade(20);
					carrinho.setDono(p1);
					System.out.println("O dono do carro é :" +
					carrinho.getDono().getNome());

						
		 */
	
	/* public class Pessoa {
		String nome;
		int idade;
	 * 
	 */
	
	/*
	 * A ideia de encasular vem de esconder os atributos , mas pense no
		comportamento inteligentes para acessa-los . 

		O encapsulamento acontece por meio dos modificadores de acesso
	 */
		
	
	
	/* public class Agenda {
		int dia;
		int mes;
		int ano;
		String anotacao;
		void validarData(){
		if((dia<=0)||(dia>31)||(mes<=0)||(mes>12)){
		this.dia=0;
		this.mes=0;
		this.ano=0;
		this.anotacao="Anotação inválida";
		}}
		public void anote(int dia, int mes, int ano, String nota) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.anotacao = nota;
		
		
		public void anote(int dia, int mes, int ano, String nota) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
			this.anotacao = nota;
			}
			void validarData(){
			if((dia<0)||(dia>31)||(mes<0)||(mes>12)){
			this.dia=0;
			this.mes=0;
			this.ano=0;
			this.anotacao="Anotação inválida";
			}
			}
			void apresentar(){
			System.out.println(this.dia+"/"+this.mes+"/"+this.ano+":
			"+this.anotacao);
			} }
			
			
			public static void main(String[] args) {
				Agenda ag1= new Agenda();
				ag1.dia=7;
				ag1.mes=15;
				ag1.ano=2022;
				ag1.anotacao="Dia das crianças";
				ag1.apresentar();
				}
	 	 
	 */
	
	/*  POO-Herança
	Classe Abstrata- são classes que não precisam ser
	instanciadas, ou seja, não gera objetos
	É utilizada apenas como superclasse em hierarquia de
	heranças.
	  
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
}
