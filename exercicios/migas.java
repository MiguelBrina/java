import java.util.Scanner;

class migas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = -1;
		while(x != 0){
        System.out.println("Digite um número: digite 0 pra encerrar o progama");
         x = scanner.nextInt();
        if (x == 0) {
		  System.out.println("progama encerrado");
		  break;
		 }
         
		if (x % 2 == 0) {
		
		  System.out.println("numero par ");		  
		 }
		
		  else{
			System.out.println("impar");
		}
	  } 
    }
}
