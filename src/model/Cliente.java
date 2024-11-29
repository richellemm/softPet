package model;

public class Cliente extends Pessoa {
    private String endereco;
    String nomeTutor = new String();
    public String getNomeTutor() {

        return nomeTutor;
    }

    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Cliente Nome: " + getNome());
    }


    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "endereco='" + endereco + '\'' +
                ", nomeTutor='" + nomeTutor + '\'' +
                ", idade=" + idade +
                ", telefone=" + telefone +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;

    }
}
