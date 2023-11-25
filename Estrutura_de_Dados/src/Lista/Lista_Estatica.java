package Lista;

//import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Lista_Estatica<T> {
    // ATRIBUTOS:
    private T[] elementos; // Vetor de Dados ou Itens ou Elementos
    private int tamanho;
	public int length;

    // CONSTRUTORES:
	public Lista_Estatica() { // Já inicializo a lista com capacidade de 10
		this(10);
	}
	
    @SuppressWarnings("unchecked")
	public Lista_Estatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // Solução do livro (2a alternativa)
        this.tamanho = 0;
    }
    
    @SuppressWarnings("unchecked")
	public Lista_Estatica(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }


    // GETTERS AND SETTERS
    public T[] getElementos() {
        return elementos;
    }

    public void setElementos(T[] elementos) {
        this.elementos = elementos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    // MÉTODOS OU FUNÇÕES:
    public boolean estaVazia() {
        return this.tamanho == 0;
    }


    public boolean estaCheia() {
        return this.tamanho == this.elementos.length;
    }


    // Add no início da lista
    public void adicionaInicio(T elemento) {
        // Verifica se a lista está cheia, se estiver, aumenta a capacidade
        if (this.tamanho == this.elementos.length) {
            this.aumentaCapacidade();
        }

        // Move todos os elementos para a direita para liberar espaço para o novo elemento
        for (int i = this.tamanho - 1; i >= 0; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        // Insere o novo elemento no início
        this.elementos[0] = elemento;
        this.tamanho++;
    }


    // Add um novo elemento no final da lista
    public void adicionaFinal(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
    }


    // Adiciona em uma determinada posição e valida se o usuário deu uma posição válida - Vídeo
    public boolean adicionaPosicao(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        this.aumentaCapacidade();
        // Função para mover todos os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }


    public void removeInicio() {
        if (estaVazia()) {
            throw new IllegalStateException("A lista está vazia, não é possível remover.");
        }
        // Move todos os elementos para a esquerda para preencher o espaço deixado pelo elemento removido
        for (int i = 0; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        // Define o último elemento como nulo e decrementa o tamanho
        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
    }


    public void removeFinal() {
        if (estaVazia()) {
            throw new IllegalStateException("A lista está vazia, não é possível remover.");
        }
        // Define o último elemento como nulo e decrementa o tamanho
        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
    }


    public void removePosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        // Move os elementos após a posição para a esquerda para preencher o espaço deixado pelo elemento removido
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        // Define o último elemento como nulo e decrementa o tamanho
        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
    }


    public T obtemPrimeiro() {
        if (estaVazia()) {
            throw new IllegalStateException("A lista está vazia, não há primeiro elemento.");
        }
        return this.elementos[0];
    }


    public T obtemUltimo() {
        if (estaVazia()) {
            throw new IllegalStateException("A lista está vazia, não há último elemento.");
        }
        return this.elementos[this.tamanho - 1];
    }


    // Função para mostrar o tamanho real do Vetor
    public int obtemTamanho() {
        return this.tamanho;
    }


    // Função para aumentar a capacidade do Vetor (tamanho)
    protected void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            @SuppressWarnings("unchecked")
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public String procurarString(String valor) {
        for (int i = 0; i < this.tamanho; i++) {
            if (elementos[i] != null && elementos[i].toString().equals(valor)) {
                return "Elemento '" + valor + "' encontrado na posição " + i;
            }
        }
        return "Elemento '" + valor + "' não encontrado na lista";
    }

    public int procurarInteiro(int valor) {
        for (int i = 0; i < this.tamanho; i++) {
            if (elementos[i] != null && elementos[i].equals(valor)) {
                return i;
            }
        }
        return -1; // Retorna -1 se não encnotrar 
    }


    /* 
    public void mostrarMenu() {
        int opcao = -1; // Inicializamos com um valor inválido para entrar no loop

        while (opcao != 0) {
            String menu = "Escolha uma opção:\n\n"
                    + "1. Adicionar elemento no início\n"
                    + "2. Adicionar elemento no final\n"
                    + "3. Adicionar elemento em uma posição\n"
                    + "4. Remover elemento do início\n"
                    + "5. Remover elemento do final\n"
                    + "6. Remover elemento de uma posição\n"
                    + "7. Obter primeiro elemento\n"
                    + "8. Obter último elemento\n"
                    + "9. Mostrar tamanho da lista\n"
                    + "10. Procurar elemento (String)\n"
                    + "11. Procurar elemento (Inteiro)\n"
                    + "12. Mostrar Lista\n" 
                    + "0. Sair";

            String entrada = JOptionPane.showInputDialog(menu);

            if (entrada == null) {
                opcao = 0;
            } else {
                try {
                    opcao = Integer.parseInt(entrada);

                    switch (opcao) {
                        case 1:
                            T elementoInicio = (T) JOptionPane.showInputDialog("Digite o elemento para adicionar no início:");
                            adicionaInicio(elementoInicio);
                            break;
                        case 2:
                            T elementoFinal = (T) JOptionPane.showInputDialog("Digite o elemento para adicionar no final:");
                            adicionaFinal(elementoFinal);
                            break;
                        case 3:
                            String posicaoStr = JOptionPane.showInputDialog("Digite a posição para adicionar o elemento:");
                            int posicao = Integer.parseInt(posicaoStr);
                            T elementoPosicao = (T) JOptionPane.showInputDialog("Digite o elemento para adicionar na posição:");
                            adicionaPosicao(posicao, elementoPosicao);
                            break;
                        case 4:
                            removeInicio();
                            break;
                        case 5:
                            removeFinal();
                            break;
                        case 6:
                            String posicaoRemoveStr = JOptionPane.showInputDialog("Digite a posição para remover o elemento:");
                            int posicaoRemove = Integer.parseInt(posicaoRemoveStr);
                            removePosicao(posicaoRemove);
                            break;
                        case 7:
                            JOptionPane.showMessageDialog(null, "Primeiro elemento: " + obtemPrimeiro());
                            break;
                        case 8:
                            JOptionPane.showMessageDialog(null, "Último elemento: " + obtemUltimo());
                            break;
                        case 9:
                            JOptionPane.showMessageDialog(null, "Tamanho da lista: " + obtemTamanho());
                            break;
                        case 10:
                            String elementoString = JOptionPane.showInputDialog("Digite o elemento a ser procurado (String):");
                            JOptionPane.showMessageDialog(null, procurarString(elementoString));
                            break;
                        case 11:
                            String elementoInteiroStr = JOptionPane.showInputDialog("Digite o elemento a ser procurado (Inteiro):");
                            int elementoInteiro = Integer.parseInt(elementoInteiroStr);
                            int posicaoEncontrada = procurarInteiro(elementoInteiro);
                            if (posicaoEncontrada != -1) {
                                JOptionPane.showMessageDialog(null, "Elemento " + elementoInteiro + " encontrado na posição " + posicaoEncontrada);
                            } else {
                                JOptionPane.showMessageDialog(null, "Elemento " + elementoInteiro + " não encontrado na lista");
                            }
                            break;
                        case 12: 
                            JOptionPane.showMessageDialog(null, "Lista: " + toString());
                            break;
                        case 0:
                            JOptionPane.showMessageDialog(null, "Saindo do programa.");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida. Digite um número válido.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Opção inválida. Digite um número válido.");
                }
            }
        }
    }
    */

    @Override
    public String toString() {
        String s = "";
        s += "[";

        for (int i = 0; i < this.tamanho - 1; i++) {
            s += this.elementos[i];
            s += " , ";
        }
        if (this.tamanho > 0) {
            s += this.elementos[this.tamanho - 1];
        }
        s += " ] ";
		//System.out.println(s);
        JOptionPane.showMessageDialog(null, s);
        return s;
    }
}
