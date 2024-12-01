package model;

import enums.CARGO;

public final class Funcionario extends Pessoa implements Remuneravel {
    private String matricula;
    private int salario;
    private CARGO cargo;

    public int isSalario() {
        return salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    public CARGO getCargo() {
        return this.cargo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
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

    @Override
    public void aplicarBonus() {
        int salarioBonus = salario + 100;
        System.out.println("Salario com bonus é igual: " + salarioBonus);
    }
}
