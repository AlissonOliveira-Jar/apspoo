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
	}

	public void retirar(double quantia) {
		saldo -= quantia + 5.0;
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
