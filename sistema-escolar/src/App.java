import classes.*;
public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Maria", 20, "maria@email.com", "20231001", 8.5);
        Professor professor = new Professor("João", 45, "joao@email.com", "Matemática");
        FuncionarioAdm funcionario = new FuncionarioAdm("Ana", 30, "ana@email.com", "Secretária");

        System.out.println("=== Aluno ===");
        aluno.exibirDados();

        System.out.println("\n=== Professor ===");
        professor.exibirDados();

        System.out.println("\n=== Funcionário ===");
        funcionario.exibirDados();
    }
}
