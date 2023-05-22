import java.util.Locale;
import java.util.Scanner;

public class Program {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("---------- Banco ----------");
		System.out.print("Titular da conta: ");
		String proprietario = sc.next();
		System.out.print("Numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Conta Poupança [P] ou Conta Empresarial [E]: ");
		char o = sc.next().charAt(0);
		System.out.println("----------------------------");

		if (o == 'p' || o == 'P') {
			System.out.println("------ Conta Poupança ------");
			System.out.print("Informe seu saldo: R$ ");
			double saldo = sc.nextDouble();
			double taxaDeJuros = saldo * 2;
			ContaPoupanca cp = new ContaPoupanca(numero, proprietario, saldo, taxaDeJuros);
			Transacao transaction = new Transacao(cp);
			System.out.println("O seu limite de emprestimo é: R$" + cp.getTaxaDeJuros());

			do {
				System.out.println("----------------------------");
				System.out.println("Sacar     [S] \nDepositar [D] \nFinalizar [F] ");
				o = sc.next().charAt(0);

				if (o == 's' || o == 'S') {
					System.out.println("----------------------------");
					System.out.print("Quanto deseja sacar? R$");
					float valorSaque = sc.nextFloat();
					transaction.withdraw(valorSaque);

				}else if (o == 'd' || o == 'D') {
					System.out.println("----------------------------");
					System.out.print("Quanto deseja depositar? R$");
					float valorDeposito = sc.nextFloat();
					transaction.deposit(valorDeposito);

				}else if(o == 'f' || o == 'F') {
					System.out.println("Sessão encerrada.");
					break;
				}

			}while(true);


		} else if (o == 'e' || o == 'E') {
			System.out.println("------ Conta Empresarial ------");
			System.out.print("Informe seu saldo: R$");
			double saldo = sc.nextDouble();
			double limiteEmprestimo = saldo * 5;
			ContaEmpresarial ce = new ContaEmpresarial(numero, proprietario, saldo, limiteEmprestimo);
			Transacao transaction = new Transacao(ce);
			System.out.println("A sua taxa de juros é: R$" + ce.getLimiteEmprestimo());
			System.out.println("-------------------------------");


			do {
				System.out.println("----------------------------");
				System.out.println("Sacar     [S] \nDepositar [D] \nFinalizar [F] ");
				o = sc.next().charAt(0);

				if (o == 's' || o == 'S') {
					System.out.println("----------------------------");
					System.out.print("Quanto deseja sacar? R$");
					float valorSaque = sc.nextFloat();
					transaction.withdraw(valorSaque);

				}else if (o == 'd' || o == 'D') {
					System.out.println("----------------------------");
					System.out.print("Quanto deseja depositar? R$");
					float valorDeposito = sc.nextFloat();
					transaction.deposit(valorDeposito);

				}else if(o == 'f' || o == 'F') {
					System.out.println("Sessão encerrada.");
					break;
				}

			}while(true);



		} else {
			System.out.print("Opção inválida.");
		}

		sc.close();

	}

}
