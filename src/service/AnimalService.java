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

    //DELETE

}