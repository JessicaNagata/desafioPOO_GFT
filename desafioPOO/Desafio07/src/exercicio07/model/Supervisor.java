package exercicio07.model;

public class Supervisor extends Funcionario {

    public Supervisor() {
    }

    public Supervisor(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public double bonificacao(double salario) {
        salario = salario + 5000;
        return salario;
    }

}
