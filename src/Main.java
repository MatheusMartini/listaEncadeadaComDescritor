import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista list = new Lista();

        int op;

        Scanner tc = new Scanner(System.in);

        do {
            System.out.println("\n1 para add no inicio" +
                    "\n2 para add no fim" +
                    "\n3 para listar " +
                    "\n4 para rem no fim" +
                    "\n5 para rem no inicio" +
                    "\n6 incluir apos um nome" +
                    "\n7 consultar por nome" +
                    "\n8 excluir por codigo" +
                    "\n9 listar nomes com medias finais" +
                    "\n10 para sair ");

            op = Elemento.lerOp();
            switch (op) {
                case 1: {
                    Elemento e = new Elemento();
                    e.ler();
                    list.inserirPrimeiro(e);
                    break;
                }
                case 2: {
                    Elemento e = new Elemento();
                    e.ler();
                    list.inserirFinal(e);
                    break;
                }
                case 3: {
                    System.out.println(list.imprimirLista());
                    break;
                }
                case 4: {
                    list.removerFinal();
                    break;
                }
                case 5: {
                    list.removerInicio();
                    break;
                }
                case 6: {
                    if (list.listaVazia()) {
                        System.out.println("Lista vazia!");
                    }else {
                        Elemento e = new Elemento();
                        System.out.println("Digite o nome para incluir após:");
                        String nome;
                        nome = tc.next();
                        if (list.acharPosicaoNome(nome)){
                            e.ler();
                            list.inserirAposNome(e, nome);
                        }else {
                            System.out.println("Nome nao encontrado!");
                        }
                    }
                    break;
                }
                case 7: {
                    if (list.listaVazia()) {
                        System.out.println("Lista vazia");
                    } else {
                        list.pesquisarNome();
                    }
                    break;
                }
                case 8: {
                    if (list.listaVazia()) {
                        System.out.println("Lista vazia");
                    } else {
                        System.out.println("Digite o codigo para excluir da lista:");
                        int cod = tc.nextInt();
                        if (list.removerPorCodigo(cod)) {
                            System.out.println(" Código de numero " + cod + " foi removido!");
                        } else {
                            System.out.println("Nao foi possivel remover a pessoa de codigo " + cod);
                        }
                    }
                    break;
                }
                case 9: {
                    if (list.listaVazia()) {
                        System.out.println("Lista vazia!");
                    } else {
                        list.imprimirNotasFinais();
                    }
                    break;
                }
            }
        } while (op != 10);//sair do programa

    }
}