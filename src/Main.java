import enums.CARGO;
import model.*;
import service.AnimalService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc2 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Pessoa pC = new Cliente();
        Servico s = new Servico();
        AnimalService as = new AnimalService();

        ArrayList<Cliente> clientes = new ArrayList<>();
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
            System.out.println("7. Adicionar bônus a funcionário");
            System.out.println("8. Sair");
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
                    sc.nextLine();
                    Pessoa c = buscarClientePorCPF(cpf, clientes);

                    if (c == null) {
                        System.out.println("Cliente não encontrado!");
                        break;
                    }
                    System.out.println("Cliente encontrado. Siga para cadastro de animal!");
                    Animal a = new Animal();
                    a.setCliente((Cliente) c);
                    a.setNomeTutor(c.getNome());
                    System.out.print("Nome do Animal: ");
                    a.setNomeAnimal(sc.nextLine());
                    System.out.print("Espécie: ");
                    a.setEspecie(sc.nextLine());
                    System.out.print("Raça: ");
                    a.setRaca(sc.nextLine());
                    System.out.print("Cor: ");
                    a.setCor(sc.nextLine());
                    System.out.print("Idade em Meses: ");
                    a.setIdade(sc.nextDouble());
                    System.out.print("Peso em Quilos: ");
                    a.setPeso(sc.nextDouble());
                    as.cadastrarAnimal(a);
                    System.out.println(as.listar());
                    System.out.println(" Animal cadastrado em tutor com CPF:" + c.getCpf());
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
                    sc.nextLine();
                    System.out.print("Salário: ");
                    ((Funcionario) pF).setSalario(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Matrícula: ");
                    ((Funcionario) pF).setMatricula(sc2.nextLine());
                    System.out.print("Idade: ");
                    pF.setIdade(sc.nextInt());

                    System.out.println("Qual sua função? \nFunções disponíveis:");
                    System.out.println("1. Atendente");
                    System.out.println("2. Tosador");
                    System.out.println("3. Banhista");
                    System.out.println("4. Veterinário");
                    System.out.print("Digite o número da função escolhida:");
                    int opcaoFuncao = sc.nextInt();
                    sc.nextLine();

                    CARGO cargoEscolhido;
                    if (opcaoFuncao == 1) {
                        cargoEscolhido = CARGO.Atendente;
                        System.out.println("Função atribuída: " + CARGO.Atendente);
                    } else if (opcaoFuncao == 2) {
                        cargoEscolhido = CARGO.Tosador;
                        System.out.println("Função atribuída: " + CARGO.Tosador);
                    } else if (opcaoFuncao == 3) {
                        cargoEscolhido = CARGO.Banhista;
                        System.out.println("Função atribuída: " + CARGO.Banhista);
                    } else if (opcaoFuncao == 4) {
                        cargoEscolhido = CARGO.Veterinario;
                        System.out.println("Função atribuída: " + CARGO.Veterinario);
                    } else {
                        System.out.println("Opção inválida!");
                        return;
                    }
                    ((Funcionario) pF).setCargo(cargoEscolhido);
                    funcionarios.add((Funcionario) pF);
                    System.out.println("----------------------------------");
                    System.out.println("Funcionário cadastrado com sucesso!");
                    pF.quemSouEu();
                    System.out.println("CPF: " + pF.getCpf());
                    System.out.println("Email: " + pF.getEmail());
                    System.out.println("Telefone: " + pF.getTelefone());
                    System.out.println("Salário: " + ((Funcionario) pF).getSalario());
                    System.out.println("Matrícula: " + ((Funcionario) pF).getMatricula());
                    System.out.println("Idade: " + pF.getIdade());
                    System.out.println("A função deste funcionário é " + cargoEscolhido);
                }
                case 4 -> {
                    System.out.println("--- Atualizar Dados de um Animal ---");
                    System.out.print("Digite o CPF do tutor: ");
                    String cpfTutor = sc.next();
                    System.out.print("Digite o nome do animal que deseja atualizar: ");
                    String nomeAnimal = sc.next();
                    System.out.print("Digite o novo nome do animal: ");
                    String novoNomeAnimal = sc.next();
                    as.atualizarNome(nomeAnimal, novoNomeAnimal, cpfTutor);
                }
                case 5 -> {
                    System.out.println("--- Deletar um Animal ---");
                    System.out.print("Digite o CPF do tutor: ");
                    String cpfTutor = sc.next();
                    System.out.print("Digite o nome do animal que deseja deletar: ");
                    String nomeAnimal = sc.next();
                    as.deletarAnimal(nomeAnimal, cpfTutor);
                }
                case 6 -> {
                    System.out.println("--- Escolher Serviço ---");
                    System.out.println("Serviços Disponíveis:");
                    System.out.println("1. Banho");
                    System.out.println("2. Tosa");
                    System.out.println("3. Vacina");
                    System.out.print("Digite o número do serviço escolhido:");
                    int opcaoServico = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome do animal: ");
                    String nomeAnimal = sc.nextLine();

                    if (opcaoServico == 1) {
                        System.out.println("Serviço de Banho agendado para " + nomeAnimal + "\nQuem vai fazer esse serviço é: " + CARGO.Tosador);
                    } else if (opcaoServico == 2) {
                        System.out.println("Serviço de Tosa agendado para " + nomeAnimal + "\nQuem vai fazer esse serviço é: " + CARGO.Banhista);
                    } else if (opcaoServico == 3) {
                        System.out.println("Serviço de Vacina agendado para " + nomeAnimal + "\nQuem vai fazer esse serviço é: " + CARGO.Veterinario);
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
                case 7 -> {
                    if (funcionarios.isEmpty()) {

                        System.out.println("Nenhum funcionário cadastrado. Cadastre um funcionário primeiro!");
                        break;
                    }
                    System.out.print("Matrícula do funcionário: ");
                    String matricula = sc.next().trim();
                    sc.nextLine();
                    Pessoa pf = buscarFuncionarioPorMatricula(matricula, funcionarios);

                    if (pf == null) {
                        System.out.println("Funcionário não encontrado!");
                        break;
                    }
                    System.out.println("Funcionário encontrado. ");
                    ((Funcionario) pf).aplicarBonus();
                }
                case 8 -> System.out.println("Saindo do sistema...");
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

    private static Pessoa buscarFuncionarioPorMatricula(String cpf, ArrayList<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                return funcionario;
            }
        }
        return null;
    }
}
