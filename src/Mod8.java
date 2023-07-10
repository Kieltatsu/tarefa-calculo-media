import java.util.Scanner;

public class Mod8 {
    public static void main (String[] args ) {
        double nota1, nota2, nota3, nota4, media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota 1 : ");
        nota1 = entrada.nextDouble();

        System.out.println("digite a nota 2 :");
        nota2 = entrada.nextDouble();

        System.out.println("Digite a nota 3 : ");
        nota3 = entrada.nextDouble();

        System.out.println("Digite a nota 4 : ");
        nota4 = entrada.nextDouble();

        media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("A media do aluno é : "+ media);



    }
}
