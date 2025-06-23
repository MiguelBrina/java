package classes;

public class Revista extends Publicacao {
    private int numeroEdicao;

    public Revista(String titulo, String autor, int anoPublicacao, int numeroEdicao) {
        super(titulo, autor, anoPublicacao);
        this.numeroEdicao = numeroEdicao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Número da Edição: " + numeroEdicao);
    }
}
