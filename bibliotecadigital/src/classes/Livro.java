package classes;

public class Livro extends Publicacao {
    private String editora;

    public Livro(String titulo, String autor, int anoPublicacao, String editora) {
        super(titulo, autor, anoPublicacao);
        this.editora = editora;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Editora: " + editora);
    }
}
