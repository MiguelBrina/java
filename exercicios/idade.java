import java.util.Scanner;

class idade{
      public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a sua idade:");
        int x = scanner.nextInt();
		
		if(x >= 18) {
	       System.out.println("você e maior de idade");		
		}
		else{
		   System.out.println("você é menor de idade");
		}
		scanner.close();
	  }
}