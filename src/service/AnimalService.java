package service;
import model.Animal;
import java.util.ArrayList;

public class AnimalService {
    private ArrayList<Animal> animais = new ArrayList<>();

    //POST
    public void cadastrarAnimal(Animal a){
        animais.add(a);
        System.out.println("Animal cadastrado com sucesso!");
    }

    //GET
    public ArrayList<Animal>listar(){
        return animais;
    }

    //UPDATE
    public void atualizarNome(String nomeAnimal, String novoNome){
        for(Animal animal : animais) {
            if(animal.getNomeAnimal().equalsIgnoreCase(nomeAnimal))  {
                animal.setNomeAnimal(novoNome);
                System.out.println("Nome do animal atualizado com sucesso!");
            } else {
                System.out.println("Animal não encontrado, por favor, tente novamente!");
            }
        }
    }
    //DELETE
    public void deletarAnimal(String nomeAnimal){
        boolean animalRemovido = animais.removeIf(animal -> animal.getNomeAnimal().equalsIgnoreCase(nomeAnimal));
        if (animalRemovido) {
            System.out.println("Animal removido do banco de dados com sucesso");
        } else {
            System.out.println("Animal não encontrado, por favor, tente novamente!");
        }
    }
}