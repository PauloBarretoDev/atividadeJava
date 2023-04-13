import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numeroConta;
        double saldo;
        String cpf;
        String nome;
        int cep;
        String logradouro;
        int numeroCasa;
        int ddd;
        int numeroTelefone;

        List<ContaBancaria> list = new ArrayList<ContaBancaria>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá bem vindo ao banco da cidade do guaxinim");
        System.out.println("O que deseja fazer?");
        System.out.println("========================");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Listar Clientes");
        System.out.println("3 - Excluir Cliente");
        System.out.println("4 - Sair do programa");
        int resposta = scanner.nextInt();

        switch (resposta) {
            case 1:
                System.out.println("Informe os dados do usuário: ");
                System.out.println("Dados da conta bancaria: ");
                System.out.print("Número da conta: ");
                numeroConta = scanner.nextInt();
                System.out.print("Saldo: ");
                saldo = scanner.nextDouble();
                System.out.println("----");
                System.out.println("Dados do cliente: ");
                System.out.print("CPF: ");
                cpf = scanner.next();
                System.out.print("Nome: ");
                scanner.next();
                nome = scanner.nextLine();
                System.out.println("----");
                System.out.println("Endereço");
                System.out.print("CEP: ");
                cep = scanner.nextInt();
                System.out.print("Logradouro: ");
                scanner.next();
                logradouro = scanner.nextLine();
                System.out.print("Número casa: ");
                numeroCasa = scanner.nextInt();
                System.out.println("----");
                System.out.println("Telefone: ");
                System.out.print("DDD: ");
                ddd = scanner.nextInt();
                System.out.print("Número: ");
                numeroTelefone = scanner.nextInt();
                System.out.println("Cadastrado com sucesso!");
                list.add(new ContaBancaria(numeroConta, saldo,
                        new Cliente(cpf, nome,
                                new Endereco(cep, logradouro, numeroCasa),
                                new Telefone(ddd, numeroTelefone))));

                System.out.println("O que deseja fazer agora?");
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Listar Clientes");
                System.out.println("3 - Excluir Cliente");
                System.out.println("4 - Sair do programa");
                resposta = scanner.nextInt();
            case 2:
                System.out.println("Listado os clientes...");
                for (ContaBancaria contaBancaria : list) {
                    System.out.println(contaBancaria);
                    System.out.println("");
                }

                System.out.println("O que deseja fazer agora?");
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Listar Clientes");
                System.out.println("3 - Excluir Cliente");
                System.out.println("4 - Sair do programa");
                resposta = scanner.nextInt();
            case 3:
                System.out.println("Informe o número da conta do cliente que deseja excluir: ");
                System.out.println("O que deseja fazer agora?");
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Listar Clientes");
                System.out.println("3 - Excluir Cliente");
                System.out.println("4 - Sair do programa");
                resposta = scanner.nextInt();
            case 4:
                System.out.println("Fechando o programa...");
                break;
        }
        scanner.close();
    }
}