import java.util.Scanner;
import java.util.ArrayList;

public class desafio2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Digite quantos números você quer escrever:");
        int quantidade = scanner.nextInt();

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            int numero = scanner.nextInt();
            numeros.add(numero); 
            if(numero %2 == 0){
                pares.add(numero);
            }
            else{
                impares.add(numero);
            }
        }
       
        System.out.println("Números digitados: " + numeros);
        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
        
        scanner.close(); 
    }
}
