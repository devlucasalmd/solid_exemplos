package isp_principio.violacao;

public class SetorDataScience implements IGerarRelatorioVendas{

	@Override
	public void gerarExcel() {
		System.out.println("Show! Super útil para mim");
	}
	
	@Override
	public void gerarPDF() {
		System.out.println("Não! isso não é útil para mim");
	}
}
