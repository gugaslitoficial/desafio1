import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Gustavo Romão";
        String tipoConta = "Corrente";
        double saldo = 1299.46;

        System.out.println("**********");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**********");

        String menu = """
                ** Digite a opção desejada **
                1 - Consultar o saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair 
                """;
        Scanner leitura = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir para sua conta? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente para transferência");
                } else {
                    saldo -= valor;
                    System.out.println("O seu saldo atualizado é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("O seu saldo atualizado é: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Essa opção é invalida. Por favor, digita a opção desejada!");
            }
        }
    }
}
