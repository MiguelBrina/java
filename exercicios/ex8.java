import java.util.Scanner;

class ex8{
       public static void main(String[] args){
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("digite o primeiro numero");
	   int x = scanner.nextInt();
	   System.out.println("digite o segundo numero");
	   int y = scanner.nextInt();
	   System.out.println("digite o terceiro");
	   int z = scanner.nextInt();
	   
	   int soma = x + y;
	   if(soma > z){
	   System.out.println("triangulo formado");
	   }
	   else{
	   System.out.println("nao e possivel formar um triangulo");
	   }
	   scanner.close();
	   }
}