import java.util.Scanner;

public class Lista {
    Nodo primeiro;
    Nodo ultimo;
    int qtd;

    //construtor
    public Lista() {
        this.primeiro = null;
        this.ultimo = null;
        this.qtd = 0;
    }

    //testa se a lista esta vazia
    public boolean listaVazia() {
        return (this.primeiro == null);
    }

    //inserir no começo
    public void inserirPrimeiro(Elemento pessoa) {
        Nodo novoNo = new Nodo(pessoa);

        if (this.listaVazia()) {
            this.ultimo = novoNo;
        }
        novoNo.setProximo(this.primeiro);
        this.primeiro = novoNo;
        this.qtd++;
    }

    //inserir no final
    public void inserirFinal(Elemento pessoa) {
        Nodo novoNo = new Nodo(pessoa);
        if (this.listaVazia()) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
        }
        this.ultimo = novoNo;
        this.qtd++;
    }

    //insere um novo elemento apos o nome
    public void inserirAposNome(Elemento pessoa){
        Nodo aposNome = new Nodo(pessoa);
        Nodo aux = primeiro;

        while(aux != null){
            aux.proximo = aposNome;

        }

    }

    //acha se o nome exite e retorar para inseirir o outro
    public boolean acharPosicaoNome(String nome) {
        Nodo aux = primeiro;
        if (nome.equals(aux.getPessoa().getNome())) {
            if (aux.getPessoa().getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    //remover no final
    public void removerFinal() {
        Nodo aux = primeiro;
        Nodo antes = primeiro;

        if (listaVazia()) {
            System.out.println("Lista vazia");
        }
        if (this.primeiro == this.ultimo) {
            removerInicio();

        } else {
            while (aux.proximo != null) {
                antes = aux;
                aux = aux.proximo;
            }
            if (this.primeiro != this.ultimo) {
                antes.proximo = null;
                this.ultimo = antes;
                this.qtd--;
            }
            System.out.println("Removido");
        }

    }

    //remover no incio
    public void removerInicio() {

        if (listaVazia()) {
            System.out.println("Lista vazia");
        } else {
            this.primeiro = this.primeiro.getProximo();
            this.qtd--;
            System.out.println("Removido!");
        }

    }

    //remover pessoa por codigo
    public boolean removerPorCodigo(int codig) {
        Nodo atual = this.primeiro;
        Nodo ant = null;

        if (listaVazia()) {
            return false;
        } else {
            while ((!(atual.getPessoa().getCod() == codig))) {
                ant = atual;
                atual = ant.getProximo();
            }
            if (atual == this.primeiro) {
                if (this.primeiro == this.ultimo) {
                    this.ultimo = null;
                }
                this.primeiro = this.primeiro.getProximo();
            } else {
                if (atual == this.ultimo) {
                    this.ultimo = ant;
                }
                ant.setProximo(atual.getProximo());
            }
        }
        this.qtd--;
        return true;
    }

    //imprimir dados
    public String imprimirLista() {
        String msg = "";
        if (listaVazia()) {
            msg = "Lista vazia";
        } else {
            Nodo atual = this.primeiro;
            while (atual != null) {
                System.out.println(atual.getPessoa().toString());
                atual = atual.proximo;
            }
        }
        return msg;
    }

    //imprimir medias finais
    public String imprimirNotasFinais() {
        String msg = "";
        if (listaVazia()) {
            msg = "Lista vazia";
        } else {
            Nodo atual = this.primeiro;
            while (atual != null) {
                if (atual.getPessoa().getMedia() >= 7)
                    System.out.println(atual.getPessoa().nome + " Media: " + atual.getPessoa().media);
                atual = atual.proximo;
            }
        }
        return msg;
    }


    //verifica se há comparação de nome
    public void pesquisarNome() {
        System.out.println("Digite o nome que voce deseja encontrar ");
        Scanner tc = new Scanner(System.in);
        String nome = tc.next();

        Nodo aux = primeiro;
        while (aux != null && !aux.getPessoa().getNome().equals(nome)) {
            aux = aux.proximo;
        }
        if (aux == null) {
            System.out.println("Nome nao encontrado");
        } else {
            System.out.println(aux.getPessoa().toString());
        }

    }

    public Nodo getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Nodo primeiro) {
        this.primeiro = primeiro;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

}
