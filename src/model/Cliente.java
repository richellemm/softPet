package model;

public class Cliente extends Pessoa {
    private String email;
    private String endereco;
    String nomeTutor = new String();
    public String getNomeTutor() {

        return nomeTutor;
    }

    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }

}
