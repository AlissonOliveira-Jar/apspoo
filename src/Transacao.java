
public class Transacao {

	private Conta conta;

	public Transacao(Conta conta) {
		this.conta = conta;
	}

	public void deposit(double quantia) {
		this.conta.deposito(quantia);
	}

	public void withdraw(double quantia) {
		this.conta.retirar(quantia);
	}

}