import java.util.Scanner;

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