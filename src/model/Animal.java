package model;

public class Animal {
    private String nomeTutor;
    private String nomeAnimal;
    private String especie;
    private String raca;
    private double peso;
    private String cor;
    private double idade;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNomeTutor() {
        return nomeTutor;
    }

    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Informações do Animal:\n" +
                "  Nome do Animal: " + nomeAnimal + "\n" +
                "  Espécie: " + especie + "\n" +
                "  Raça: " + raca + "\n" +
                "  Cor: " + cor + "\n" +
                "  Idade (meses): " + idade + "\n" +
                "  Peso (kg): " + peso + "\n" +
                "  Telefone do Tutor: " + (cliente != null ? cliente.getTelefone() : "Não informado") + "\n" +
                "  CPF do Tutor: " + (cliente != null ? cliente.getCpf() : "Não informado") + "\n";
    }
}