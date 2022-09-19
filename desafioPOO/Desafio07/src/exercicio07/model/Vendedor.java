package exercicio07.model;

public class Vendedor extends Funcionario {

    public Vendedor() {
    }

    public Vendedor(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public double bonificacao(double salario) {
        salario = salario + 3000;
        return salario;
    }

}
