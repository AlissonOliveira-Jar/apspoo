public class ContaPoupanca extends Conta {

	private Double taxaDeJuros;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String proprietario, Double saldo, Double taxaDeJuros) {
		super(numero, proprietario, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}

	public void updateSaldo() {
		saldo += saldo * taxaDeJuros;
	}

	@Override
	public void retirar(double quantia) {
		super.retirar(quantia);
	}
}
