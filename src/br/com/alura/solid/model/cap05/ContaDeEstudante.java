package br.com.alura.solid.model.cap05;

public class ContaDeEstudante extends ContaComum {
	private int milhas;
	private ManipuladorDeSaldo m;

	public ContaDeEstudante() {
		this.m = new ManipuladorDeSaldo(0);
	}

	public void deposita(double valor) {
		this.m.deposita(valor);
		this.milhas += (int) valor;
	}

	public void saca(double valor){
		this.m.saca(valor);
	}
	public int getMilhas() {
		return milhas;
	}
	
	public double getSaldo(){
		return this.m.getSaldo();
	}

}