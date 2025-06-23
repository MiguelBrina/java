package classes;

public class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int vida, int mana) {
        super(nome, vida);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void ataque() {
        System.out.println(getNome() + " está lançando um ataque mágico!");
    }

    public void lancarFeitico() {
        System.out.println(getNome() + " lançou um feitiço usando " + mana + " de mana!");
    }
}
