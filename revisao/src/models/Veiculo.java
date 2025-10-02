package models;

public abstract class Veiculo {
 protected  String placa;
 protected  int ano;
 protected  Double valorVenda;
         
public Veiculo(String placa, int ano, Double valorVenda) {
    validaPlaca(placa);
    validaAno(ano);
    validaVenda(valorVenda);
    
    this.placa = placa;
    this.ano=ano;
    this.valorVenda=valorVenda;


    
}

public String getPlaca() {
    return placa;
}

public void setPlaca(String placa) {
    validaPlaca(placa);
    this.placa = placa;
}

public int getAno() {
    return ano;
}

public void setAno(int ano) 
{   validaAno(ano);
    this.ano = ano;
}

public Double getValorVenda() {
    return valorVenda;
}

public void setValorVenda(Double valorVenda) {
    validaVenda(valorVenda);
    this.valorVenda = valorVenda;
}

public void validaPlaca(String placa){
    if (placa.length() != 7) {
       
        throw new IllegalArgumentException("digite uma placa válida");
        
    }

}

public void validaAno(int ano){
    if (ano > 2025 || ano < 1900) {

        throw new IllegalArgumentException("digite um ano válido");
        
        
    }
       
}

public void validaVenda(Double valorVenda){
    if (valorVenda <= 0 ) {
        
        throw new IllegalArgumentException("digite um valor válido");

        
        
    }
}




public abstract Double calcularImposto();

public abstract void exibirDetalhes();


    
}
