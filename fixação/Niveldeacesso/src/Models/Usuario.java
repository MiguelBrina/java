package Models;

import Enums.ENivelDeAcesso;

public class Usuario {
    private ENivelDeAcesso acesso;
    private int anosDeServico;
 
    public Usuario(ENivelDeAcesso acesso, int anosDeServico) {
        validaUsuario(acesso, anosDeServico);
        this.acesso = acesso;
        this.anosDeServico = anosDeServico;
    }
    
    private void validaUsuario(ENivelDeAcesso acesso, int anosDeServico){
    if (acesso == null) {
        throw new IllegalArgumentException("o tipo não pode ser nulo");
    }
    switch (acesso) {
        case MODERADOR: validaModerador(anosDeServico);
                    break;
              
        case ADMIN: validaADMIN(anosDeServico);
                   break;
        default:
        }
                        
    }
                
    private void validaModerador(int anosDeServico) {
        if (anosDeServico > 2) {
            throw new IllegalArgumentException("o minímo para MOD é 2 anos de serviço");
        }
    }

    private void validaADMIN(int anosDeServico) {
        if (anosDeServico < 5) {
         throw new IllegalArgumentException("o minímo para ADMIN é 5 anos de serviço");
        }
        
    }


        
//#region Getters e Setters
    public ENivelDeAcesso getAcesso() {
        return acesso;
    }
    public void setAcesso(ENivelDeAcesso acesso) {
        this.acesso = acesso;
    }
    public int getAnosDeServico() {
        return anosDeServico;
    }
    public void setAnosDeServico(int anosDeServico) {
        validaUsuario(acesso, anosDeServico);
        this.anosDeServico = anosDeServico;
    }
    //#endregion
   
   
       
}
 
