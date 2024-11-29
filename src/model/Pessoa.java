package model;

public abstract class Pessoa {
    protected String cpf;
    protected String nome;
    protected int telefone;
    protected int idade;
    private String email;
    private Object nomeTutor;

    public Pessoa(String cpf, String nome, int telefone, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    public Pessoa(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
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

    public void setNomeTutor(String next) {
        this.nomeTutor = nomeTutor;
    }

    public abstract void quemSouEu();

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", nomeTutor=" + nomeTutor +
                '}';
    }
}
