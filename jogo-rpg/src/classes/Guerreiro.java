package classes;

public class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(String nome, int vida, int forca) {
        super(nome, vida);
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void ataque() {
        System.out.println(getNome() + " está atacando com a espada!");
    }

    public void golpeEspada() {
        System.out.println(getNome() + " deu um golpe de espada com força " + forca + "!");
    }
}
