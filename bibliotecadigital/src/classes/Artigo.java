package classes;

public class Artigo extends Publicacao {
    private String revistaOrigem;

    public Artigo(String titulo, String autor, int anoPublicacao, String revistaOrigem) {
        super(titulo, autor, anoPublicacao);
        this.revistaOrigem = revistaOrigem;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Revista de Origem: " + revistaOrigem);
    }
}

