import classes.pessoa;
import classes.Aluno;
public class App {
    public static void main(String[] args) throws Exception {
       pessoa p1 = new pessoa();
       p1.nome= "matheus";
       p1.altura=1.85;
       p1.peso = 80;
       p1.idade = 16;
       p1.genero="masculino";

       p1.dormir();
      
       Aluno a1 = new Aluno("migas", "ds", "b");
       a1.notas.add(6);
       a1.notas.add(6);
       a1.notas.add(6);
       a1.Situacao();

       
   }
}
        
