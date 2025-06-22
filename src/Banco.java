import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        Scanner reader = new Scanner(System.in);
        String nameClient = "Ezekiel Rangel";
        String accountType = "Corrente";
        double bankBalance = 1600.55;

        System.out.println(
                "*****************************\n" +
                        "       DADOS DO CLIENTE      \n" +
                        "*****************************\n" +
                        "Nome do cliente : " + nameClient + "\n" +
                        "Tipo da conta   : " + accountType + "\n" +
                        "Saldo atual     : " + formatoMoeda.format(bankBalance) + "\n" +
                        "*****************************\n"
        );

        System.out.println(
                "Digite o que gostaria de fazer\n" +
                        "1 - CONSULTAR SALDO\n" +
                        "2 - ADICIONAR SALDO\n" +
                        "3 - SACAR VALOR\n" +
                        "4 - SAIR\n"
        );
        int option = reader.nextInt();

        switch (option){
            case 1:
                System.out.printf("O seu saldo é de %.2f", bankBalance);
                break;

            case 2:
                System.out.println("Digite o saldo que gostaria de adiconar: ");
                double newBalance = bankBalance + reader.nextDouble();
                System.out.printf("Seu saldo agora é %.2f", newBalance);
                break;

            case 3:
                System.out.println("Digite o valor que gostaria de sacar: ");
                newBalance = bankBalance - reader.nextDouble();
                System.out.printf("Seu saldo agora é de %.2f", newBalance);
                break;

            case 4:
                System.out.println("Programa encerrado com sucesso!");
                break;
            default:
                System.out.println("Opcao inválida");
                return;
        }
    }
}

