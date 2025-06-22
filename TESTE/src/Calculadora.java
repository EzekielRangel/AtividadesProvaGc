import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;
        String operador;

        // Solicita os números e o operador
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        operador = scanner.next();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        // Realiza a operação com base no operador
        if (operador.equals("+")) {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        } else if (operador.equals("-")) {
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        } else if (operador.equals("*")) {
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
        } else if (operador.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não permitida.");
            }
        } else {
            System.out.println("Operador inválido.");
        }

        scanner.close();
    }
}