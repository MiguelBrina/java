import java.util.Scanner;

class desafiojava{
public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
	  System.out.println("digite o valor do primeiro lado do triangulo");
	  double a = scanner.nextDouble();
	  System.out.println("digite o valor do segundo lado do triangulo");
	  double b = scanner.nextDouble();
      System.out.println("digite o valor do terceiro lado do triangulo");
	  double c = scanner.nextDouble();
	  if(a + b > c && a + c > b && b + c > a ){
		System.out.println("é um triangulo");
			if(a == b && b == c){
				System.out.println("equilatero");
			}else if (a == b || a == c || b == c){
				System.out.println("isoceles");
			}else if (a != b && a != c && b != c){
				System.out.println("escaleno");
			}
	 }else{
	   System.out.println("não forma um triangulo");
	 }
}
}

