package br.com.alura.solid.model.cap05;

public class ContaComum {
	private ManipuladorDeSaldo m;

	public ContaComum() {
		this.m = new ManipuladorDeSaldo(0);
	}

	public void deposita(double valor) {
		this.m.deposita(valor);
	}

	public void saca(double valor) {
		this.m.saca(valor);
	}

	public void somaInvestimento() {
		this.m.somaInvestimento(0.01);
	}

	public double getSaldo() {
		return m.getSaldo();
	}

}