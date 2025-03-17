package dip.solucao;

import srp_principio.violacao.Pedido;

public interface IBancoDadosRepository {

	boolean salvar(Pedido pedido);
}
