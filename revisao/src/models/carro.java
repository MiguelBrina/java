package models;

import models.interfaces.Imanutencao;

public class carro extends Veiculo implements Imanutencao{

   protected int numeroPortas;

    public carro(String placa, int ano, Double valorVenda, int numeroPortas) {
            super(placa, ano, valorVenda);
            this.numeroPortas=numeroPortas;
        }
    
        @Override
    public Double calcularImposto() {
        
        return getValorVenda()*0.05;
    
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("placa: "+ placa + "\nano:"+ano+"\nvalor da venda:"+valorVenda+"\nnumero de portas:"+numeroPortas);
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
    
   public void validaPortas(int numeroPortas){
    if (numeroPortas>8 && numeroPortas<2) {
        throw new IllegalArgumentException("digite um numero de portas existente");
        
    }
   }

   
   public String realizarRevisao() {
    return("Revisão de 7 itens no carro"+placa);
   }


   public Double calcularCustoManutencao() {
    return(500.00);
   }
}
