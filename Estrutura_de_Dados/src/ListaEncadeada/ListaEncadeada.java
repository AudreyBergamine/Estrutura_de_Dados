package ListaEncadeada;

import javax.swing.JOptionPane;

public class ListaEncadeada<T> { // Com a lista encadeada não tem ordem, não precisa estar em ordem

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;


    public int getTamanho() {
        return this.tamanho;
    }

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (this.tamanho == 0){
            this.inicio = celula; // Apontando o início para o Nó... Inicio > Nó (1 elemento adicionado)
        } else { // Se a lista não estiver vazia, entra no else
            this.ultimo.setProximo(celula); // Faz a variavel ultimo apontar para o ultimo valor add
        }
        this.ultimo = celula;
        this.tamanho++;
    }


    public void removerElemento(T elemento) {
        if (this.tamanho == 0) {
            return; // A lista está vazia, não há nada para remover.
        }
    
        // Caso especial: remoção do primeiro elemento
        if (this.inicio.getElemento().equals(elemento)) {
            this.inicio = this.inicio.getProximo();
            this.tamanho--;
            if (this.tamanho == 0) {
                this.ultimo = null; // A lista ficou vazia, o último também deve ser nulo.
            }
            return;
        }
    
        // Procura o elemento a ser removido
        No<T> anterior = this.inicio;
        No<T> atual = this.inicio.getProximo();
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                anterior.setProximo(atual.getProximo());
                this.tamanho--;
                if (atual == this.ultimo) {
                    this.ultimo = anterior; // Atualizamos o último se o elemento removido era o último.
                }
                return;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
    
    public void removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            JOptionPane.showMessageDialog(null, "Posição inválida");
        }
    
        // Caso especial: remoção do primeiro elemento
        if (posicao == 0) {
            this.inicio = this.inicio.getProximo();
            this.tamanho--;
            if (this.tamanho == 0) {
                this.ultimo = null; // A lista ficou vazia, o último também deve ser nulo.
            }
            return;
        }
    
        // Encontra o nó anterior ao da posição especificada
        No<T> anterior = this.inicio;
        for (int i = 0; i < posicao - 1; i++) {
            anterior = anterior.getProximo();
        }
    
        // Remove o elemento na posição especificada
        No<T> atual = anterior.getProximo();
        anterior.setProximo(atual.getProximo());
        this.tamanho--;
        if (atual == this.ultimo) {
            this.ultimo = anterior; // Atualizamos o último se o elemento removido era o último.
        }
    }


    public void limpa(){
        /* 
        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
            }
            */
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;

    }
    

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        } else {
            String resultado = "[";
    
            No<T> atual = this.inicio;
    
            for (int i = 0; i < this.tamanho - 1; i++) {
                resultado += atual.getElemento() + "\t->\t";
                atual = atual.getProximo();
            }
            resultado += atual.getElemento() + "]";
    
            JOptionPane.showMessageDialog(null, resultado, "Representação da Lista", JOptionPane.INFORMATION_MESSAGE);
    
            return ""; 
        }
    }
}
