package model;

public final class Funcionario extends Pessoa {
    private int matricula;
    private int salario;

    public int isSalario() {
        return salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Funcionário Nome: " + getNome());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", salario=" + salario +
                ", idade=" + idade +
                ", telefone=" + telefone +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
