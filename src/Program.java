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
		System.out.println("--------------------------");
		
		if (o == 'p' || o == 'P') {
			System.out.println("------ Conta Poupança ------");
			System.out.print("Informe seu saldo: ");
			double saldo = sc.nextDouble();
			double taxaDeJuros = 1;
			ContaPoupanca cp = new ContaPoupanca(numero, proprietario, saldo, taxaDeJuros);
			System.out.print("O seu limite de emprestimo é: " + cp.getTaxaDeJuros());
			System.out.println("----------------------------");
		} else if (o == 'e' || o == 'E') {
			System.out.println("------ Conta Empresarial ------");
			System.out.print("Informe seu saldo: ");
			double saldo = sc.nextDouble();
			double limiteEmprestimo = saldo * 5;
			ContaEmpresarial ce = new ContaEmpresarial(numero, proprietario, saldo, limiteEmprestimo);
			System.out.print("A sua taxa de juros é: " + ce.getLimiteEmprestimo());
			System.out.println("-------------------------------");
		} else {
			System.out.print("Opção inválida.");
		}
		
		sc.close();

	}

}
