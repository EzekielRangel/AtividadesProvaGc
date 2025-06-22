import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double filmNote = 0;
        String filmName = "null";

        System.out.println("Digite o que gostaria de fazer 1 - acessar programa 0 - fechar");
        int program = reader.nextInt();

        switch (program) {

            case 1:
                System.out.println("Digite o filme que deseja avaliar:");
                reader.nextLine();
                filmName = reader.nextLine();
                
                if (!filmName.trim().isEmpty()) {
                    System.out.printf("Digite a nota para o filme, %s: ", filmName);
                    filmNote = reader.nextDouble();
                } else {
                    System.out.println("Nenhum nome de filme foi digitado.");
                }
                System.out.printf("A nota do filme %s foi %.2f", filmName, filmNote);
                break;

            case 0:
                break;

            default:
        }
    }
}