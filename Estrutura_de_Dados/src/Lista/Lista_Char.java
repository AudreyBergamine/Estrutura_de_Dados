package Lista;

public class Lista_Char {

  int tamanho, qtd;
  char itens[];
  String palavra = "";

  public Lista_Char(int qtd) {
    this.qtd = qtd;
    this.tamanho = 0;
    itens = new char[qtd];
  }
  public void adicionar(char letra) {
    itens[tamanho] = letra;
    tamanho++;
  }
  public int getTamanho() {
    return tamanho;
  }
  public int getQtd() {
    return qtd;
  }
  public void concatenar(){
    System.out.print("[");
    for(int i = 0; i<getTamanho();i++){
      System.out.print(itens[i]);
      palavra += itens[i]; 
    }System.out.print("]\n");
  }

  public char pesquisar(char c) {
    char enc;
    for (int i : itens) {
      if(i == c){
        enc = c;
        return enc;
      }
    }return ' ';
    
  }
  public boolean remover(){
    if(this.tamanho> 0){
      itens[tamanho-1] = 0;
      tamanho--;
      return true;
    }
    return false;
  }
  public void palindromo() {
    String palavra = "";
    String cPalavra = "";
    
    for(int i = 0; i<getTamanho();i++){
      // System.out.print(itens[i]);
      palavra += itens[i]; 
    }
    
    for(int i =getTamanho()-1; i>-1;i--){
      // System.out.print(itens[i]);
      cPalavra += itens[i]; 
    }
    // System.out.println(palavra);
    // System.out.println(cPalavra);
    if(cPalavra.equals(palavra)){
      System.out.println("A palavra "+palavra+" é um palindromo");
    } else{
      System.out.println("A palavra "+palavra+" não é um palindromo");
    }
  }
  public void imprimir() {
    System.out.print("[");
    for(int i = 0; i<getTamanho();i++){
      System.out.print(itens[i]);
      if(i<getTamanho()-1){
        System.out.print(", ");
      }
    }System.out.print("]\n");
    System.out.println("Tamanho da lista: "+tamanho
    +"\nQtd itens: "+qtd+
    "\nPalavra: "+palavra);
  }
}