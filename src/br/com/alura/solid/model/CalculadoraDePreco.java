package br.com.alura.solid.model;

public class CalculadoraDePreco {
	private TabelaDePreco tabela;

	public CalculadoraDePreco(TabelaDePreco tabela) {
		this.tabela = tabela;
	}

	public double calcula(Compra produto) {
		Frete correios = new Frete();

		double desconto = tabela.descontoPara(produto.getValor());
		double frete = correios.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}
}