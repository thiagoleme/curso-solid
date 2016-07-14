package br.com.alura.solid.model;

import java.util.List;

public class GeradorDeNotaFiscal {
	private List<AcaoAposGerarNota> acoes;

	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gera(Fatura fatura) {
		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		for (AcaoAposGerarNota a : acoes) {
			a.executa(nf);
		}
		
		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}