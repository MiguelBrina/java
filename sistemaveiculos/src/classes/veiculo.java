
package classes;

public class veiculo {
    String marca;
    int ano;
    String modelo;

    public veiculo(String marca, int ano, String modelo) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Modelo: " + modelo);
    }
}
