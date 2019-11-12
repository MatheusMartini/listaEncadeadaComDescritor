class Nodo {
    Elemento pessoa;
    Nodo proximo = null;

    public Nodo(Elemento atributos) {
        this.pessoa = atributos;
        this.proximo = null;
    }
    public Elemento getPessoa() {
        return pessoa;
    }

    public void setPessoa(Elemento pessoa) {
        this.pessoa = pessoa;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}

