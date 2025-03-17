package lsp_principio.violacao.secondexample;

public class Pinguim extends Passaro{

	@Override
	public void voar() {
		throw new UnsupportedOperationException("Eu não consigo voar");
	}
	
	@Override
	public void bicar() {
		System.out.println("Sim, eu consigo bicar");
	}
}
