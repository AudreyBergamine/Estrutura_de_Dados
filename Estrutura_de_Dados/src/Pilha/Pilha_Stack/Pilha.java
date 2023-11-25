package Pilha.Pilha_Stack;

import java.util.EmptyStackException;

public class Pilha { // Stack
    
    private int tamanhoMaximo;
    private int topo;
    private int[] elementos;

    public Pilha(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.topo = -1; // Inicializa o topo como -1 para indicar pilha vazia
        this.elementos = new int[tamanhoMaximo];
    }

    

    public int getTamanhoMaximo() {
        return tamanhoMaximo;
    }



    public void setTamanhoMaximo(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }



    public int getTopo() {
        return topo;
    }



    public void setTopo(int topo) {
        this.topo = topo;
    }



    public int[] getElementos() {
        return elementos;
    }



    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }



    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == tamanhoMaximo - 1;
    }

    public void push(int elemento) {
        if (isFull()) {
            throw new IllegalStateException("A pilha está cheia. Não é possível adicionar mais elementos.");
        }
        elementos[++topo] = elemento;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos[topo--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos[topo];
    }

    public int size() {
        return topo + 1;
    }

    public void clear() {
        topo = -1; // Reinicializa o topo para indicar pilha vazia
    }
}


