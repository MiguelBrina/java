import java.util.Scanner;

class aumento{
      public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o seu salario: ");
        Double x = scanner.nextDouble();
		
		if(x <=2000.0) {
			double porcentagem = (x * 10.0 )/ 100.0;
			double salario = porcentagem + x;
	       System.out.println("seu novo salario é " + salario);		
		}
		else{
			double porcentagem = (x * 5.0 )/ 100.0;
			double salario = porcentagem + x;
		   System.out.println("seu novo salario é " + salario);
		}
		scanner.close();
	  }
}