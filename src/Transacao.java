
public class Transacao {

	private Conta conta;
	
	public Transacao(Conta conta) {
		this.conta = conta;
	}
	
	public void deposit(double quantia) {
		conta.deposito(quantia);
	}
	
	public void withdraw(double quantia) {
		conta.retirar(quantia);
	}

}