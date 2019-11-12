import java.util.Scanner;

public class Elemento {

    String nome;
    String email;
    String tel;
    int cod;
    double nota1;
    double nota2;
    double media;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double nota1, double nota2) {
        this.media = (nota1 + (nota2 * 2)) / 3;
    }

    @Override
    public String toString() {
        return
                "-------------------------------" +
                        "\n Nome = " + getNome() +
                        "\n Email = " + getEmail() +
                        "\n Telefone = " + getTel() +
                        "\n Codigo = " + getCod() +
                        "\n Nota 1 = " + getNota1() +
                        "\n Nota 2 = " + getNota2() +
                        "\n Media = " + getMedia() +
                        " \n-------------------------------";
    }

    public void ler() {
        Scanner tc = new Scanner(System.in);

        setCod(lerCod());

        System.out.println("Digite o nome");
        setNome(tc.next());

        setEmail(lerEmail());

        setTel(lerTel());

        System.out.println("Digite a nota 1");
        setNota1(tc.nextDouble());

        System.out.println("Digite a nota 2");
        setNota2(tc.nextDouble());

        setMedia(getNota1(), (getNota2()));

    }

    public String lerTel() {
        Scanner tc = new Scanner(System.in);
        String tel;
        boolean validar;
        String val = "\\d\\d-\\d\\d\\d\\d\\d\\d\\d\\d\\d";

        System.out.println("Digite seu Telefone (xx-xxxxxxxx)");
        tel = tc.next();
        validar = tel.matches(val);

        if (validar == true) {
            return tel;
        } else
            System.out.println("falta algum numero");
        return lerTel();
    }

    public String lerEmail() {
        Scanner tc = new Scanner(System.in);
        String email;
        boolean validar;

        System.out.println("Digite seu email");
        email = tc.next();
        validar = email.matches(".*@.*");

        if (validar == true) {
            return email;
        } else
            System.out.println("email errado, tente novamente");
        return lerEmail();
    }

    public static int lerCod() {
        boolean valida;
        int numero = 0;
        Scanner tc = new Scanner(System.in);
        do {
            System.out.println("Digite o código numérico (xxx)");
            try {
                numero = Integer.parseInt(tc.nextLine());
                return (numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite apenas números!");
                valida = false;
            }
        } while (!valida);
        return (numero);
    }

    public static int lerOp() {
        boolean valida;
        int numero = 0;
        Scanner tc = new Scanner(System.in);
        do {
            System.out.println("Digite o numero da operação");
            try {
                numero = Integer.parseInt(tc.nextLine());
                return (numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite apenas números!");
                valida = false;
            }
        } while (!valida);
        return (numero);
    }
}