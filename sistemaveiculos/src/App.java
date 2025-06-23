import classes.carro;
import classes.caminhao;
import classes.moto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, javorld");
        carro carrinho = new carro("nike", 2000, "macqueen", 4);
        caminhao caminhudo = new caminhao("addidas", 2015, "scania", 1000.5);
        moto pop100 = new moto("honda", 2019, "pop-100", 97);

        carrinho.exibirDados();
        caminhudo.exibirDados();
        pop100.exibirDados();
    }
}
