import java.util.Scanner;

class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = -1;
        
        while (x != 0) {
            System.out.println("Digite um número: digite 0 para encerrar o programa");
            x = scanner.nextInt();
            
            if (x > 0) {
                System.out.println("Número positivo");
            } else if (x < 0) {
                System.out.println("Número negativo");
            } else {
                System.out.println("Número 0");
                System.out.println("Programa encerrado");
                break;
            }
        }
        
        scanner.close();
    }
}
