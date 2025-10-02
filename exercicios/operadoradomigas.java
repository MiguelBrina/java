import java.util.Scanner;
public class operadoradomigas{
	public static void main (String[] args){
		Scanner scanner  = new Scanner(System.in);

		double saldo = 10.0; //saldo inicial
		int opcao;

		do {
			System.out.println("-- OPERADORA LEGAL -- ");
			System.out.println("1. Ver Saldo ");
			System.out.println("2. Enviar SMS (R$0,50) ");
			System.out.println("3. Fazer ligação (R$1,20 por minuto)");
			System.out.println("4. Recarregar créditos ");
			System.out.println("0. Sair ");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					System.out.printf("\n Seu saldo é R$ %.2f%n",saldo);
					break;
				case 2:
					if (saldo >= 0.50){
						saldo = saldo - 0.50;
						System.out.println("Msg enviada com sucesso");
					}
					else{
						System.out.println("Saldo Insuficiente para enviar msg");
					}
					break;
				case 3:
					int vd;
					System.out.println("quantos minutos de ligação você gostaria de carregar");
					vd = scanner.nextInt();
					if (saldo >= 1.20 * vd){
						saldo = saldo - 1.20 * vd;
						System.out.println("ligação disponível por"+vd+"minutos");}
					else{
						System.out.println("\n saldo insuficiente para concluir ação");}
					break;
				case 4:
				    double vn;
					System.out.println("\n quantos creditos você deseja recarregar? ");
					vn = scanner.nextDouble;
					saldo += vn ;
					System.out.println("saldo atualizado. ");
					break;
				case 0:
					System.out.println("\n operadora encerrada");
					break;						

				default:
					System.out.println("Opção Inválida");
			}
		} while (opcao != 0);

		scanner.close();
	}
}