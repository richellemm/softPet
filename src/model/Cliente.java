package model;

public class Cliente extends Pessoa {
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Cliente Nome: " + getNome());
    }

      @Override
    public String toString() {
        return "Informações do Tutor:\n" +
                "  Nome: " + nome + "\n" +
                "  CPF: " + cpf + "\n" +
                "  Endereço: " + endereco + "\n" +
                "  Telefone: " + telefone + "\n";
    }

}
