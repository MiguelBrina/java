package classes;

public class moto extends veiculo {
    int cilindradas;

    public moto(String marca, int ano, String modelo, int cilindradas) {
        super(marca, ano, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("cilindradas  " + cilindradas);
    }
}
