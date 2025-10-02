package Models;

import Enums.ETipoIngresso;
 
public class Ingresso {
    private ETipoIngresso tipo;
    private double preco;
   
    public Ingresso(ETipoIngresso tipo, double preco)
    {    //validação
       validarIngresso(tipo, preco);
       this.tipo = tipo ;  
       this.preco= preco;
    }

    private void validarIngresso(ETipoIngresso tipo,double preco){
        if (tipo == null) {

            throw new IllegalArgumentException("o tipo não pode ser nulo");
            
        }
       switch (tipo) {
        case PADRAO: validarPadrao(preco);
            break;

        case VIP: validaVIP(preco);
            break;

        case ESTUDANTE: validaEstudante(preco);
             break;

        default: 

        throw new IllegalArgumentException("tipo inválido");
       
        }

    }

    private void validarPadrao(double preco){
        if (preco <50) {
             throw new IllegalArgumentException("preco inválido");
        } 
    }

    private void validaVIP(double preco){
      if (preco <150) {
        throw new IllegalArgumentException("preco inválido");
      }
    }

    private void validaEstudante(double preco){
      if (preco < 30) {
       throw new IllegalArgumentException("preco inválido");
      }
    }

//#region Encapsulamento
    public ETipoIngresso getTipo() {
        return tipo;
    }
    public void setTipo(ETipoIngresso tipo) {
        this.tipo = tipo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        validarIngresso(getTipo(), preco);
        this.preco = preco;
    }
    //#endregion




}
 
 
