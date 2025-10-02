import java.util.Scanner;
public class desafio1 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       System.out.println("classificação de idade");
       System.out.println("qual a sua idade");
       int idade = scanner.nextInt();
      
       if (idade>=0 && idade<=12) {
             System.out.println("Criança");
             
       }
       else if (idade >=13 && idade <=17) {
             System.out.println("Adolescente");
             
       }
       else if (idade>=18 && idade<=64) {
             System.out.println("Adulto");
             
       }
       else if (idade>= 65) {
             System.out.println("idoso");
             
       }
       else{
        System.out.println("digite uma idade valida");

            

        scanner.close();
       }
    } 
}
