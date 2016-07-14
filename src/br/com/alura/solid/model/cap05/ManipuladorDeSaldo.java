package br.com.alura.solid.model.cap05;

public class ManipuladorDeSaldo {
	private double saldo;

	public ManipuladorDeSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void somaInvestimento(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	public double getSaldo() {
		return saldo;
	}
}
