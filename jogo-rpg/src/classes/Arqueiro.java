package classes;

public class Arqueiro extends Personagem {
    int flechas;

     public Arqueiro( String nome, int vida, int flechas){
       super(nome, vida);
       this.flechas = flechas;

    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }

    @Override

    public void ataque(){
       System.out.println(getNome() + "está atacando com o arco");

    }
   
     public void atirarFlecha() {
        if (flechas > 0) {
            flechas--;
            System.out.println(getNome() + " atirou uma flecha! Flechas restantes: " + flechas);
        } else {
            System.out.println(getNome() + " está sem flechas!");
        }
     }
}
