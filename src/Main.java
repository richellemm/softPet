//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import model.*;
import service.AnimalService;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa pC = new Cliente();
        Pessoa pF = new Funcionario();
        Animal a = new Animal();
        Servico s = new Servico();
        AnimalService as = new AnimalService();

        System.out.println("Digite o seu nome:");
        pC.setNomeTutor(sc.next());

        System.out.println("Digite o nome do seu pet:");
        a.setNomeAnimal(sc.next());

        System.out.println("Digite a idade do seu pet:");
        a.setIdade(sc.nextDouble());

        System.out.println("Digite a raça do seu pet:");
        a.setRaca(sc.next());

        System.out.println("Digite a espécie do seu pet:");
        a.setEspecie(sc.next());

        System.out.println("Digite o peso do seu pet:");
        a.setPeso(sc.nextDouble());

        System.out.println("Digite a cor do seu pet:");
        a.setCor(sc.next());


        System.out.println("Digite qual serviço será realizado:");
        s.setServico(sc.next());

        System.out.println("Digite o nome do funcionário que irá realizar o serviço:");
        pF.setNome(sc.next());

        as.cadastrarAnimal(a); // Use o objeto "as" para cadastrar o animal
        System.out.println("Animais cadastrados:");
        System.out.println(as.listar()); // Lista os animais cadastrados
        }
    }
