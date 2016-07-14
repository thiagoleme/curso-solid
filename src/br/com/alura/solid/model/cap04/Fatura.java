package br.com.alura.solid.model.cap04;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

	private String cliente;
	private double valor;
	private double valorPago;
	private List<Pagamento> pagamentos;
	private boolean pago;

	public Fatura(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.valorPago = 0;
		this.pagamentos = new ArrayList<Pagamento>();
		this.pago = false;
	}

	public String getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public boolean isPago() {
		return pago;
	}

	private void setPago(boolean pago) {
		this.pago = pago;
	}

	public void adicionaPagamento(Pagamento pagamento) {
		pagamentos.add(pagamento);
		
		valorPago += pagamento.getValor();
		
		if (valorPago >= this.getValor()) {
			this.setPago(true);
		}
	}

}
