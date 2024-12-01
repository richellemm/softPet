package service;

import model.Animal;

import java.util.ArrayList;

public class AnimalService {
    private final ArrayList<Animal> animais = new ArrayList<>();


    public void cadastrarAnimal(Animal a) {
        animais.add(a);
        System.out.println("Animal cadastrado com sucesso!");
    }

    public ArrayList<Animal> listar() {
        return animais;
    }

    public void atualizarNome(String nomeAnimal, String novoNomeAnimal, String cpfTutor) {
        for (Animal animal : animais) {
            if (animal.getNomeAnimal().equalsIgnoreCase(nomeAnimal) &&
                    animal.getCliente().getCpf().equals(cpfTutor)) {
                animal.setNomeAnimal(novoNomeAnimal);
                System.out.println("Nome do animal atualizado com sucesso! Novo nome: " + animal.getNomeAnimal());
                return;
            }
        }
        System.out.println("Animal não encontrado ou não pertence a este tutor, por favor, tente novamente!");
    }

    public void deletarAnimal(String nomeAnimal, String cpfTutor) {

        for (int i = 0; i < animais.size(); i++) {
            if (animais.get(i).getNomeAnimal().equalsIgnoreCase(nomeAnimal) && animais.get(i).getCliente().getCpf().equals(cpfTutor)) {
                animais.remove(i);
                System.out.println("Animal removido do banco de dados com sucesso");
                return;
            }
        }
        System.out.println("Animal não encontrado ou não pertence a esse tutor, por favor, tente novamente!");
    }
}