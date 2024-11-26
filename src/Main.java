import enums.CARGO;
import model.*;
import service.AnimalService;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Pessoa pC = new Cliente();
        Pessoa pF = new Funcionario();
        Animal a = new Animal();
        Servico s = new Servico();
        AnimalService as = new AnimalService();

        ArrayList<Pessoa> clientes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int y;

        do {
            System.out.println("\n--- SOFTPET - O SISTEMA DO SEU PETSHOP ---");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Animal");
            System.out.println("3. Cadastrar Funcionário");
            System.out.println("4. Atualizar Dados de um Animal");
            System.out.println("5. Deletar um Animal");
            System.out.println("6. Escolher Serviço para um Animal");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            y = sc.nextInt();
            switch (y) {
                case 1 -> {
                    System.out.println("--- Cadastro de Cliente ---");
                    System.out.print("Nome: ");
                    String nome = sc2.nextLine();
                    System.out.print("CPF: ");
                    int cpf = sc.nextInt();
                    System.out.print("Email: ");
                    String email = sc2.nextLine();
                    System.out.print("Telefone: ");
                    int telefone = sc.nextInt();
                    System.out.print("Endereço: ");
                    String endereco = sc2.nextLine();
                    clientes.add(pC);
                    System.out.println("Cliente cadastrado com sucesso!");
                }
                case 2 -> {
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado. Cadastre um cliente primeiro!");
                        break;
                    }
                    System.out.print("CPF do tutor: ");
                    int cpf = sc.nextInt();
                    Cliente cliente = associarClientePorCPF(cpf, clientes);

                    if (cliente == null) {
                        System.out.println("Cliente não encontrado!");
                        break;
                    }


                    System.out.println("--- Cadastro de Animal ---");
                    System.out.print("Nome do Animal: ");
                    String nomeAnimal = sc2.nextLine();
                    System.out.print("Espécie: ");
                    String especie = sc2.nextLine();
                    System.out.print("Raça: ");
                    int raca = sc.nextInt();
                    System.out.print("Cor: ");
                    String cor = sc2.nextLine();
                    System.out.print("Idade: ");
                    double idade = sc.nextDouble();
                    System.out.println("Animal cadastrado com sucesso!");
                }
                case 3 -> {
                    System.out.println("--- Cadastro de Funcionário ---");
                }
                case 4 -> {
                    System.out.println("--- Atualizar Dados de um Animal ---");

                }
                case 5 -> {
                    System.out.println("--- Deletar um Animal ---");
                }
                case 6 -> {
                    System.out.println("--- Escolher Serviço ---");
                }
                case 7 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while (y != 7);

        sc.close();
    }

    private static Cliente associarClientePorCPF(int cpf, ArrayList<Pessoa> clientes) {
        return null;
    }
}
