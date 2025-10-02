import java.util.Scanner;

class maiormenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int x = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println(x + " é o maior e " + y + " é o menor.");
        } else if (x < y) {
            System.out.println(y + " é o maior e " + x + " é o menor.");
        } else {
            System.out.println("Os dois números são iguais.");
        }

        scanner.close();
    }
}
