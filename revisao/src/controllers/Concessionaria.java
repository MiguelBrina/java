package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Veiculo;
import models.interfaces.Imanutencao;

public class Concessionaria
{
    private List<Veiculo> veiculos;

    public Concessionaria() {
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void exibirVeiculos() {
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();           
        }
    }

    public double calcularTotalImpostos() {
        double total = 0;
        for (Veiculo veiculo : veiculos) {
            total += veiculo.calcularImposto();
        }
        return total;
    }

    public void realizarManutencao(String placa) {
        
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) 
            {
                if (veiculo instanceof Imanutencao) 
                {
                    Imanutencao manutencao = (Imanutencao) veiculo;
                    System.out.println(manutencao.realizarRevisao());
                    System.out.println("R$" + manutencao.calcularCustoManutencao() +
                    "\n===========================================");
                    return;
                } 
                else 
                {
                    System.out.println("Este veículo não pode fazer manutenções");
                    return;
                }
            }
        }
        System.out.println("Veículo com placa " + placa + " não encontrado");
    }
}