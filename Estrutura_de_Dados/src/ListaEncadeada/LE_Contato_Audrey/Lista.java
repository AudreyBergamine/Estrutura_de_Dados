package ListaEncadeada.LE_Contato_Audrey;

import javax.swing.JOptionPane;

public class Lista {
    private No primeiro;
    private No ultimo;
    private int tamanho = 0;

    public Lista() {
        primeiro = null;
    }

    public boolean vazia() {
        if (primeiro == null) {
            //JOptionPane.showMessageDialog(null, "Lista Vazia");
            return true;
        } else {
            //JOptionPane.showMessageDialog(null, "Lista com elementos!");
            return false;
        }
    }

    public void adiciona(Contato contato) {
        No novo = new No(contato);

        if (tamanho == 0) {
            primeiro = novo;
            ultimo = primeiro;
        } else {
            ultimo.setProximo(novo);
            ultimo = novo;
        }

        tamanho++;
    }

    public No pesquisar(Contato contato) {
        for (No no = primeiro; no != null; no = no.getProximo()) {
            if (no.getContato().equals(contato)) {
                JOptionPane.showMessageDialog(null, "Contato encontrado:\n" + no.getContato());
                return no;
            }
        }
        JOptionPane.showMessageDialog(null, "Contato não encontrado");
        return null;
    }

    public void remover(Contato contato) {
        No anterior = null;
        No p = primeiro;
        while (p != null && !p.getContato().equals(contato)) {
            anterior = p;
            p = p.getProximo();
        }
        if (p == null) {
            return;
        }
        if (anterior == null) {
            primeiro = p.getProximo();
        } else {
            anterior.setProximo(p.getProximo());
        }
        tamanho--;
    }

    public void limpar() {
        while (!vazia()) {
            No no = primeiro;
            primeiro = no.getProximo();
            tamanho--;
        }
        ultimo = null;
    }

    public void print() {
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "A lista está vazia.");
        } else {
            No atual = primeiro;
            String listaContatos = "";

            while (atual != null) {
                Contato contato = atual.getContato();
                listaContatos += "" + contato.toString();

                if (atual.getProximo() != null) {
                    listaContatos += "Próximo: --->\n\n";
                } else {
                    listaContatos += "Próximo: ---> \n\n null";
                }

                atual = atual.getProximo();
            }

            JOptionPane.showMessageDialog(null, listaContatos);
        }
    }
}
