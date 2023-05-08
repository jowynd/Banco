import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String nome = "João vitor De Souza Martins";
        String tipoDeConta = "Conta corrente";
        double saldo = 1599.99;

       // dados
        int opcao = 0;
        double valor = 0;
        System.out.println("************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo total: " + saldo);
        System.out.println("\n************************");

        System.out.println("\nMenu de opções");
        System.out.println("Digite de 1 a 4 o que deseja fazer");

        System.out.println("1- Fazer pix: ");
        System.out.println("2- Receber pix: ");
        System.out.println("3- Consultar saldo: ");
        System.out.println("4- Sair");

        Scanner leitor = new Scanner(System.in);
        leitor.next();



//        int opcao2 = 2;
//        int opcao3 = 3;
//        int opcao4 = 4;

        String menu = """
                *** Digite sua opção 
                 1- Consultar saldo: 
                 2- Depositar valor: 
                 3- transferir valor: 
                 4- Sair
                ***
                 """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println("Digite de 1 a 4 o que deseja fazer");

            System.out.println("\n1- Mostrar saldo:  ");
            System.out.println("2- Receber transferência: ");
            System.out.println("3- Fazer transferência: ");
            System.out.println("4- Sair");
            opcao = leitura.nextInt();

            if(opcao == 1) {
                System.out.println("Seu saldo é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja depositar? ");
               valor = leitura.nextDouble();
               saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao == 3) {
                System.out.println("Qual valor deseja transferir? ");
                valor = leitura.nextDouble();
                    saldo -= valor;
                    System.out.println("novo saldo: " + saldo);
                }   else if (opcao != 4) {
                    System.out.println("Digite um número válido");
                }
        }
    }
}

