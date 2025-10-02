import java.util.Scanner;

class ex7{
      public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero: ");
        int x = scanner.nextInt();
		if( x >=10 && x<=50){
		System.out.println("dentro do intervalo");
		}
		else{
		System.out.println("fora do intervalo");
		}
		scanner.close();
	  }
}