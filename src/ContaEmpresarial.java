public class ContaEmpresarial extends Conta {

	private Double limiteEmprestimo;

	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numero, String proprietario, Double saldo, Double limiteEmprestimo) {
		super(numero, proprietario, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double quantia) {
		if (quantia <= limiteEmprestimo) {
			saldo += quantia - 10.0;
		}
	}

	@Override
	public void retirar(double quantia) {
		super.retirar(quantia);
		saldo -= 2.0;
	}

}
