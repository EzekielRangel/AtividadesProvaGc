import java.util.Scanner;

public class Desafios{
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       int escolha = 0;
       double saldo = 0;
       String nome = "Ezekiel Nunes";
       String tipoConta = "Corrente";
       String textoBase = """
               ***********************
               Dados iniciais do cliente:
                              
               Nome: %s
               Tipo conta: %s
               Saldo inicial: R$ %.2f
               ***********************
               """;
        System.out.printf(textoBase, nome, tipoConta, saldo);
       while(escolha != 4){
           System.out.println("\n-----Menu-----");
           System.out.println("1- Consultar saldo");
           System.out.println("2- Receber valor");
           System.out.println("3- Transferir valor");
           System.out.println("4- Sair");
           System.out.println("Digite uma opção: ");
           escolha = leitor.nextInt();


           if(escolha == 1){
               System.out.printf("Seu saldo atual é de R$ %.2f\n", saldo);
           }else if(escolha == 2){
               System.out.println("Digite o valor que gostaria de receber: ");
               saldo += leitor.nextInt();
               System.out.println("Saldo atualizado");
           }else if(escolha == 3){
               System.out.println("Digite o valor que gostaria de transferir");
               saldo -= leitor.nextInt();
               System.out.println("Saldo atualizado");
           }else if(escolha ==4){
               System.out.println("Programa encerrado!");
           }else{
               System.out.println("Opção invalida, digite uma opção válida");
           }



          /*switch(escolha){
               case 1:
                   System.out.printf("Seu saldo atual é de R$ %.2f\n", saldo);
                   break;
               case 2:
                   System.out.println("Digite o valor que gostaria de receber: ");
                   saldo += leitor.nextInt();
                   System.out.println("Saldo atualizado");
                   break;
               case 3:
                   System.out.println("Digite o valor que gostaria de transferir");
                   saldo -= leitor.nextInt();
                   System.out.println("Saldo atualizado");
                   break;
               case 4:
                   System.out.println("Programa encerrado!");
                   break;
               default:
                   System.out.println("Opção invalida, digite uma opção válida");
                   break;*/

           }
       }
    }





