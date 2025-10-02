package models;

public class moto extends Veiculo  {

     protected int cilindradas;

    
     public moto(String placa, int ano, Double valorVenda, int cilindradas)
     {
            super(placa, ano, valorVenda);
            validaCilindrada(cilindradas);
            this.cilindradas=cilindradas;
        }
    
        @Override
    public Double calcularImposto() {
    return getValorVenda() * 0.03;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("placa: "+ placa + "\nano:"+ano+"\nvalor da venda:"+valorVenda+"\ncilindradas:"+cilindradas);
       
    }
    
    public void validaCilindrada(int cilindradas){

        if (cilindradas >2500 || cilindradas < 50) {
           throw new IllegalArgumentException("digite um valor de cilindradas real");
        }
   }

    public void setCilindradas(int cilindradas) {
        validaCilindrada(cilindradas);
        this.cilindradas = cilindradas;
    }      
    
    public int getCilindradas() {
        return cilindradas;
    }
} 
