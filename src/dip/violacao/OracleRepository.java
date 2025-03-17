package dip.violacao;

import srp_principio.violacao.ConexaoPostgres;
import srp_principio.violacao.Pedido;

public class OracleRepository {
	
	public boolean salvar(Pedido pedido) {
		ConexaoOracle dbConnection = new ConexaoOracle("database.url");
		
		try {
			dbConnection.salvar(pedido);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}

}
