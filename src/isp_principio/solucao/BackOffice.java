package isp_principio.solucao;

public class BackOffice implements IGerarRelatorioVendasExcel, IGerarRelatorioVendasPDF{

	@Override
	public void gerarExcel() {
		System.out.println("Show! Super útil para mim");
	}
	
	@Override
	public void gerarPDF() {
		System.out.println("Show! Super útil para mim");
	}
}
