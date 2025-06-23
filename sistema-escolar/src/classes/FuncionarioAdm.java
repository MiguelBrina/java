package classes;

public class FuncionarioAdm extends Pessoa {
    private String cargo;

    public FuncionarioAdm(String nome, int idade, String email, String cargo) {
        super(nome, idade, email);
        this.cargo = cargo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: " + cargo);
    }
}
