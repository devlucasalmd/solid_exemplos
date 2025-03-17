package srp_principio.violacao;

public class ConexaoPostgres {
	
	public ConexaoPostgres(String dbUrl) {
		
	}

	public void salvar(Pedido order) {
		System.out.println("Salvando pedido no Postgres");
	}
}
