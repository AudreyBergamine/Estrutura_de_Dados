package Pilha.Ex_02_Slide_PecaJOption;

import javax.swing.JOptionPane;

public class PìlhaString {
    String pilha[];
    int topo;

    public PìlhaString(int capacidade) {
        topo = -1;
        this.pilha = new String[capacidade];
    }

    public void push(String elemento) {
        if (!cheia()) {
            topo++;
            this.pilha[topo] = elemento;
        } else {
            JOptionPane.showMessageDialog(null, "Pilha cheia!");
        }
    }

    public String pop() {
        String valor = "";
        if (!vazia()) {
            valor = pilha[topo];
            pilha[topo] = null;
            topo--;
            //JOptionPane.showMessageDialog(null, "Item desempilhado");
        } else {
            JOptionPane.showMessageDialog(null, "A lista já está vazia!");
        }
        return valor;
    }

    public boolean pecaDefeituosa(String pecaComDefeito) {
        if (!vazia()) {
            String vetor_temp[] = new String[pilha.length];
            for (int i = topo; i > 0; i--) {
                vetor_temp[i] = pilha[i];

                if (this.pop().equals(pecaComDefeito)) {
                    String novaPeca = JOptionPane.showInputDialog("Peça defeituosa retirada!! \n\n" 
                    				+ "Digite o NOME da nova peça: \n(Que irá  substituir a defeituosa)\n ");
                    this.push(novaPeca);

                    for (int j = i + 1; j < pilha.length; j++) {
                        this.push(vetor_temp[j]);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public boolean cheia() {
        return (topo == (pilha.length - 1));
    }

    public boolean vazia() {
        return (topo == -1);
    }

    public String toString() {
        String s = "";
        if (!this.vazia()) {
            s = s + "\n ";
            for (int i = this.topo; i > 0; i--) {
                s = s + (this.pilha[i]) + "\n ";
            }
            s = s + this.pilha[0] + " ";
            //JOptionPane.showMessageDialog(null, s);
            return s;
        }
        //JOptionPane.showMessageDialog(null, "[]");
        return "[]";
    }
}