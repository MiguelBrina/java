import classes.*;

public class App {
    public static void main(String[] args) {
        Mago mago = new Mago("Gandalf", 100, 200);
        Guerreiro guerreiro = new Guerreiro("Thorin", 150, 80);
        Arqueiro arqueiro = new Arqueiro("Legolas", 120, 30);

        mago.ataque();
        mago.lancarFeitico();

        

        guerreiro.ataque();
        guerreiro.golpeEspada();

        

        arqueiro.ataque();
        arqueiro.atirarFlecha();
        arqueiro.atirarFlecha();
    }
}

