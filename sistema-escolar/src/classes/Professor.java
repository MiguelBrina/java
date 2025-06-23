package classes;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String email, String disciplina) {
        super(nome, idade, email);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
    }
}
