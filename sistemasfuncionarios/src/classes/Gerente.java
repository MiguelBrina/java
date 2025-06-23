package classes;

public class Gerente extends Funcionario {
    double bonificacao;

    public Gerente(String nome, double salario, String cpf, double bonificacao) {
        super(nome, salario, cpf);
        this.bonificacao = bonificacao;

    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Valor bonificação: " + bonificacao);
    }
}
