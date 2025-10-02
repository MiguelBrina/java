package models;

import models.interfaces.Imanutencao;

public class caminhao extends Veiculo implements Imanutencao {

    protected Double carga;
    
    public caminhao(String placa, int ano, Double valorVenda, Double carga) {
            super(placa, ano, valorVenda);
                  validaCarga(carga);
                  this.carga = carga;
           }
       
           public void validaCarga(Double carga) {
               if (carga > 7500.00 && carga <1000.00) {
                throw new IllegalArgumentException("carga invalida");
               }
               
           }

           public Double getCarga() {
               return carga;
           }

           public void setCarga(Double carga) {
            validaCarga(carga);
               this.carga = carga;
           }

           @Override
           public String realizarRevisao() {
            return("revisão de 15 itens no caminhão "+placa);
           }

           @Override
           public Double calcularCustoManutencao() {
            return(1500.00);
           }

           @Override
           public Double calcularImposto() {
            return(getValorVenda()*0.08);
           }

           @Override
           public void exibirDetalhes() {
            System.out.println("placa: "+ placa + "\nano:"+ano+"\nvalor da venda:"+valorVenda+"\ncapacidade de carga:"+carga);
           }
    
}
