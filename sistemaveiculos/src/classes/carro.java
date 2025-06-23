package classes;

public class carro extends veiculo {
    int nportas;

    public carro(String marca, int ano, String modelo, int nportas) {
        super(marca, ano, modelo);
        this.nportas = nportas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("numero de portas  " + nportas);
    }
}
