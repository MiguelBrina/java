import classes.*;

public class App {
    public static void main(String[] args) {

        Livro livro = new Livro("branca de neve", "zuck", 1899, "Editora Globo");

        Revista revista = new Revista("Superinteressante", "Editora Abril", 2024, 350);

        Artigo artigo = new Artigo("Tecnologia 5G", "minguel", 2023, "tec nologia");

        System.out.println("\n=== Dados do Livro ===");
        livro.exibirDados();

        System.out.println("\n=== Dados da Revista ===");
        revista.exibirDados();

        System.out.println("\n=== Dados do Artigo ===");
        artigo.exibirDados();
    }
}
