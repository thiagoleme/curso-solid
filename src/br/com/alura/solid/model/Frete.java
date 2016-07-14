package br.com.alura.solid.model;

public class Frete {
	public double para(Cidade cidade) {
		return cidade.getRegraDeFrete().calcula();
	}
}