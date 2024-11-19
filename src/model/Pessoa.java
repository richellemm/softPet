package model;

public abstract class Pessoa {
    protected int cpf;
    protected String nome;
    protected int telefone;
    protected int idade;

    public Pessoa(int cpf, String nome, int telefone, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    public Pessoa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
