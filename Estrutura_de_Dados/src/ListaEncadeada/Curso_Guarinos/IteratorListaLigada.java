package ListaEncadeada.Curso_Guarinos;

public class IteratorListaLigada<T> {
    private Elemento_Generics<T> elemento;

    public IteratorListaLigada(Elemento_Generics<T> primeiro) {
        this.elemento = primeiro;
    }

    public boolean temProximo() {
        return this.elemento != null;
    }

    public Elemento_Generics<T> getProximo() {
        if (temProximo()) {
            Elemento_Generics<T> atual = this.elemento;
            this.elemento = this.elemento.getProximo();
            return atual;
        }
        return null;  // Retorna null se não houver próximo elemento
    }
}
