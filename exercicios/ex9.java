import java.util.Scanner;
class ex9{
         public static void main(String[] args){
		    Scanner scanner = new Scanner(System.in);
		 System.out.println("digite o valor da sua compra");
		 int vd = scanner.nextInt();
		  if (vd <= 100) {
            int porcentagem = (vd * 5) / 100;
            int resultado = vd - porcentagem;
            System.out.println("O valor da sua compra ficou " + resultado + " pois você obteve um desconto de " + porcentagem);
        } else if (vd > 100 && vd <= 500) {
            int porcentagem2 = (vd * 10) / 100;
            int resultado2 = vd - porcentagem2;
            System.out.println("O valor da sua compra ficou " + resultado2 + " pois você obteve um desconto de " + porcentagem2);
        } else if (vd > 500) {
            int porcentagem3 = (vd * 15) / 100;
            int resultado3 = vd - porcentagem3;
            System.out.println("O valor da sua compra ficou " + resultado3 + " pois você obteve um desconto de " + porcentagem3);
        }
		 
		 
		 
		 }
}