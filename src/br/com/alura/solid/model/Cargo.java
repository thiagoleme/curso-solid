package br.com.alura.solid.model;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorcento()), 
	DBA(new QuinzeOuVintePorcento()), 
	TESTER(new QuinzeOuVintePorcento());

	RegraDeCalculo regraDeCalculo;

	Cargo(RegraDeCalculo regraDeCalculo) {
		this.regraDeCalculo = regraDeCalculo;
	}

	public RegraDeCalculo getRegraDeCalculo() {
		return regraDeCalculo;
	}
	
}