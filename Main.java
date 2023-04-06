import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ContaBancaria> list = new ArrayList<ContaBancaria>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo! Selecione uma das opções: ");
        System.out.println("====================================");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Listar Clientes");
        System.out.println("3 - Excluir Clientes");
        System.out.println("4 - Sair do programa");
        int resposta = scanner.nextInt();
        while (resposta != 4) {
            if (resposta == 1) {
                System.out.println("Informe os dados do cliente: ");
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
            }
        }

        list.add(new ContaBancaria(1000,
                new Cliente("1111111111", "Paulo Barreto Neto", new Endereco(123456, "Bomba do Hemeterio", 666),
                        new Telefone(81, 40028922))));

        list.add(new ContaBancaria(2000,
                new Cliente("2222222222", "Alex Campos", new Endereco(654321, "Alto zé pinho", 777),
                        new Telefone(81, 40562688))));

        for (ContaBancaria contaBancaria : list) {
            System.out.println(contaBancaria);
            System.out.println("------------------");
        }

    }
}