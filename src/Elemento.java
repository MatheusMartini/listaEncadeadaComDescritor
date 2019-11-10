public class Elemento {

    private Nodo primeiro = null;
    private int n = 0;
    private Nodo ultimo = null;

    public void inserirListaEsquerda(int valor){
        Nodo aux = new Nodo();
        aux.dado = valor;
        if (n == 0) {
            primeiro = aux;
            ultimo = aux;
            aux.elo = null;
        } else {
            aux.elo = primeiro;
            primeiro = aux;
        }
        n++;
    }

    public void inserirListaDireita(int valor){
        Nodo aux = new Nodo();
        Nodo tmp;
        aux.dado = valor;
        if (n == 0) {
            primeiro = aux;
            ultimo = aux;
        }
        else {
            tmp = ultimo;
            tmp.elo = aux;
            aux.elo = null;
            ultimo = aux;
        }
        n++;
    }

    public int consultarListaEsquerda(){
        Nodo aux;
        int dado;
        aux = primeiro;
        if (aux != null) {
            return(primeiro.dado);
        }else {
            return(0);
        }
    }

    public int consultarListaDireita(){
        Nodo aux;
        int dado;
        aux = ultimo;
        if (aux != null) {
            return(ultimo.dado);
        }else {
            return(0);
        }
    }

    public void imprimirLista(){
        int cont = 0;
        Nodo aux;
        aux = primeiro;
        System.out.print("Elementos adicionados a lista Encadeada com Descritor: ");
        if (aux != null) {
            while(aux != null) {
                System.out.print(aux.dado + " ");
                aux = aux.elo;
                cont ++;
            }
            System.out.println("");
            System.out.println("Total de elementos "+cont);
        }else {
            System.out.print("Vazia");
        }
    }

}

