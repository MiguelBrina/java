package classes;

public class Diretor extends Funcionario {
    private double acoesEmpresa;

    public Diretor(String nome, double salario, String cpf, double acoesEmpresa) {
        super(nome, salario, cpf);
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Valor em ações da empresa: " + acoesEmpresa);
    }
}
