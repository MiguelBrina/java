package classes;

public class Funcionario {
    String nome;
    Double salario;
    String cpf;

    public Funcionario(String nome, Double salario, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public void exibirDados() {
        System.out.println("nome:  " + nome);
        System.out.println("salario:  " + salario);
        System.out.println("cpf:  " + cpf);
    }

}
