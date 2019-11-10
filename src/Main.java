import java.util.Scanner;

/*
1- Incluir no final
2 - Incluir no início
3- Incluir após um nome(ler um nome, encontrar na lista e incluir na posição posterior)
4 - Consultar por nome (ler um nome e mostrar o registro do nome procurado)
5 - Excluir do início
6 - Excluir do fim
7 - Excluir por código
8 - Listar todos os registros
9 - Listar com médias finais ( listar os nomes dos alunos com suas médias finais calculadas)
10- Sair
 */

public class Main {
    public static void main(String[] args) {

        String s;
        char op, ch = 'e';
        int dado = 0;

        Elemento lista = new Elemento();
        Scanner tc = new Scanner(System.in);

        do {
            System.out.print("[I]ncluir, [C]onsultar ou [F]im: ");
            do {
                s = tc.nextLine();
                op = s.charAt(0);
                op = Character.toLowerCase(op);
            } while (op != 'i' && op != 'c' && op != 'f');

            if (op == 'i' || op == 'c') {
                do {
                    System.out.print("[E]squerda ou [D]ireita: ");
                    s = tc.nextLine();
                    ch = s.charAt(0);
                    ch = Character.toLowerCase(ch);
                } while (ch != 'e' && ch != 'd');
            }

            switch (op) {
                case 'i': System.out.print("Digite um inteiro: ");{
                    s = tc.nextLine();
                    dado = Integer.parseInt(s);
                    if (dado != 0) {
                        if (ch == 'e') {
                            lista.inserirListaEsquerda(dado);
                        }
                        else {
                            lista.inserirListaDireita(dado);
                        }
                    }
                    break;
                }

                case 'c': if (ch == 'e') {
                    dado = lista.consultarListaEsquerda();
                }else {
                    dado = lista.consultarListaDireita();
                }System.out.println("Dado Consultado: " + dado);
                    break;
            }

        } while (op != 'f');
        lista.imprimirLista();
        System.exit(0);
    }
}