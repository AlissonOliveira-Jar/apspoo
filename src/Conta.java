public class Conta {

	protected Double saldo;
	private Integer numero;
	private String proprietario;

	public Conta() {
	}

	public Conta(Integer numero, String proprietario, Double saldo) {
		this.numero = numero;
		this.proprietario = proprietario;
		this.saldo = saldo;
	}

	public void deposito(double quantia) {
		saldo += quantia;
		System.out.println("Saldo depositado com sucesso!");
		System.out.println("Seu saldo atual é: R$" + saldo);
	}

	public void retirar(double quantia) {
		if (quantia > saldo) {
			System.out.println("Saldo insuficiente.");
		} else {
			saldo -= quantia;
			System.out.println("Saldo retirado com sucesso!");
			System.out.println("Seu saldo atual é: R$" + saldo);
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

}
