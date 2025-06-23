import classes.Funcionario;
import classes.Diretor;
import classes.Gerente;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario("joão", 1350.95, "19365496340");
        Diretor margarete = new Diretor("margarete", 10000.00, "546789012426", 10);
        Gerente tgmende = new Gerente("thiago mendes", 20500.5, "19997760709", 800);
        f1.exibirDados();
        System.out.println("|------------|");
        margarete.exibirDados();
        System.out.println("|------------|");
        tgmende.exibirDados();
    }
}
