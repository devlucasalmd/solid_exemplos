package dip.violacao;

import srp_principio.violacao.ConexaoPostgres;
import srp_principio.violacao.Pedido;

public class PostgresRepository {
	
	public boolean salvar(Pedido pedido) {
		ConexaoPostgres dbConnection = new ConexaoPostgres("database.url");
		
		try {
			dbConnection.salvar(pedido);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}

}
