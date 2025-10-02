package Main;
import Enums.ENivelDeAcesso;
import Models.Usuario;
public class App {
    public static void main(String[] args) throws Exception {

       Usuario migas = new Usuario(ENivelDeAcesso.ADMIN, 2);
       System.out.println("função "+ migas.getAcesso() +"\n Anos de serviço :"+migas.getAnosDeServico());
    }
}
