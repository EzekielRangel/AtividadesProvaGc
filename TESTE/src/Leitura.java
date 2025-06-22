import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);

        System.out.println("Digite seu filme favorito? ");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lançamento? ");
        int anoDeLançamento = leitura.nextInt();
        System.out.println("Digite sua nota: ");
        double nota = leitura.nextDouble();


        System.out.printf("Seu filme favorito é %s, o ano de lançamento é %d e a sua nota para ele é de %f", filme, anoDeLançamento, nota);
    }
}
