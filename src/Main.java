import enums.CARGO;
import model.*;
import service.AnimalService;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        Cliente c = new Cliente();
//        Pessoa pF = new Funcionario();
//        Animal a = new Animal();

        Scanner sc2 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Pessoa pC = new Cliente();
        Funcionario f = new Funcionario();
        Servico s = new Servico();
        AnimalService as = new AnimalService();

        ArrayList<Cliente> clientes = new ArrayList<>();

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
                    Cliente c = new Cliente();
                    System.out.print("Nome: ");
                    c.setNome(sc.nextLine());
                    sc.nextLine();
                    System.out.print("CPF: ");
                    c.setCpf(sc.next());
                    clientes.add(c);
                    System.out.print("Email: ");
                    c.setEmail(sc.nextLine());
                    sc.nextLine();
                    System.out.print("Telefone: ");
                    c.setTelefone(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Endereço: ");
                    c.setEndereco(sc.nextLine());

                    clientes.add(c);
                    System.out.println("Cliente cadastrado com sucesso!");
                    c = new Cliente();
                }
                case 2 -> {
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado. Cadastre um cliente primeiro!");
                        break;
                    }
                    System.out.print("CPF do tutor: ");
                    String cpf = sc.next().trim();
                    Pessoa c = buscarClientePorCPF(cpf, clientes);

                    if (c == null) {
                        System.out.println("Cliente não encontrado!");
                        break;
                    }
                    System.out.println("Cliente encontrado. Siga para cadastro de animal!");
//                    System.out.println("--- Cadastro de Animal ---");
                    Animal a = new Animal();
                    a.setCliente((Cliente) c);
                    a.setNomeTutor(c.getNome());
                    System.out.print("Nome do Animal: ");
                    a.setNomeAnimal(sc.nextLine());
                    sc.nextLine();
                    System.out.print("Espécie: ");
                    a.setEspecie(sc.nextLine());
                    System.out.print("Raça: ");
                    a.setRaca(sc.nextLine());
                    System.out.print("Cor: ");
                    a.setCor(sc.nextLine());
                    System.out.print("Idade: ");
                    a.setIdade(sc.nextDouble());
                    System.out.print("Peso: ");
                    a.setPeso(sc.nextDouble());

                    System.out.println("Animal cadastrado com sucesso! CPF do tutor do animal: " + c.getCpf());
                }
                case 3 -> {
                    System.out.println("--- Cadastro de Funcionário ---");
                    Pessoa pF = new Funcionario();
                    System.out.print("Nome: ");
                    pF.setNome(sc2.nextLine());
                    System.out.print("CPF: ");
                    pF.setCpf(sc2.nextLine());
                    System.out.print("Email: ");
                    pF.setEmail(sc2.nextLine());
                    System.out.print("Telefone: ");
                    pF.setTelefone(sc.nextInt());
                    System.out.print("Salário: ");
                    f.setSalario(sc.nextInt());
                    System.out.print("Matrícula: ");
                    f.setMatricula(sc.nextInt());
                    System.out.print("Idade: ");
                    pF.setIdade(sc.nextInt());
                    System.out.println("Funcionário cadastrado com sucesso!");
                    pF.quemSouEu();
                    System.out.println("CPF: " + pF.getCpf());
                    System.out.println("Email: " + pF.getEmail());
                    System.out.println("Telefone: " + pF.getTelefone());
                    System.out.println("Salário: " + f.getSalario());
                    System.out.println("Matrícula: " + f.getMatricula());
                    System.out.println("Idade: " + pF.getIdade());
                    System.out.println("A função deste funcionário é " + CARGO.Atendente);
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
        sc2.close();
    }


    private static Pessoa buscarClientePorCPF(String cpf, ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}
