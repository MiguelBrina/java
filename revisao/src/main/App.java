package main;

import controllers.Concessionaria;
import models.Veiculo;
import models.caminhao;
import models.carro;
import models.moto;

public class App {
    public static void main(String[] args) throws Exception {
        Concessionaria concessionaria = new Concessionaria();
        carro macqueen = new carro("ABC1234", 2020, 50000.0, 4);
        moto xre = new moto("XYZ5678", 2018, 15000.0, 300);
        caminhao scania = new caminhao("DEF9876", 2015, 120000.0, 5000.0);
        concessionaria.adicionarVeiculo(macqueen);
        concessionaria.adicionarVeiculo(xre);
        concessionaria.adicionarVeiculo(scania);
        concessionaria.realizarManutencao("ABC1234");
        concessionaria.calcularTotalImpostos();
        concessionaria.exibirVeiculos();

        
    }
}
