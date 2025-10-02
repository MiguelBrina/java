import java.util.Scanner;

class ex10{
      public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
	  System.out.println("digite seu peso");
	  double peso = scanner.nextDouble();
	  System.out.println("digite sua altura");
	  double altura = scanner.nextDouble();
	   double imc = peso / Math.pow(altura, 2);
	  if(imc <18.5){
		System.out.println("abaixo do peso");		
	  }
	  if(imc >= 18.5 && imc <= 24.9){
		System.out.println("peso normal") ;   
	  }
	  if(imc >= 25.0 && imc <= 29.9){
		System.out.println("sobrepeso") ; 
	  }
	  if(imc >= 30.0){
		 System.out.println("obesidade");
	  }
  }
}		