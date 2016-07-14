package br.com.alura.solid.model;

public enum Cidade {
	SAO_PAULO(new FreteParaSP()),
	RIO_DE_JANEIRO(new FretePadrao());
	
	private RegraDeFrete regraFrete;

	private Cidade(RegraDeFrete regraFrete) {
		this.regraFrete = regraFrete;
	}
	
	public RegraDeFrete getRegraDeFrete() {
		return regraFrete;
	}
}
