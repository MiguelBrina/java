package classes;

public class caminhao extends veiculo {
    Double capacidadecarga;

    public caminhao(String marca, int ano, String modelo, Double capacidadecarga) {
        super(marca, ano, modelo);
        this.capacidadecarga = capacidadecarga;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("capacidade de carga " + capacidadecarga + " kgs");
    }
}
