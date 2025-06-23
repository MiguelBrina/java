package classes;

public class Aluno extends Pessoa {
    private String matricula;
    private double notaFinal;

    public Aluno(String nome, int idade, String email, String matricula, double notaFinal) {
        super(nome, idade, email);
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota Final: " + notaFinal);
    }
}
