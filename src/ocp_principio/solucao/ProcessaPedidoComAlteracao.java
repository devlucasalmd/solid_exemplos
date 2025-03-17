package ocp_principio.solucao;

import srp_principio.solucao.ProcessaPedido;
import srp_principio.violacao.Pedido;

public class ProcessaPedidoComAlteracao extends ProcessaPedido{

	public void processar(Pedido pedido) {
		if(!pedido.possuiItens()) {
			throw new RuntimeException("Não é possível continuar! Pedido sem itens.");
		}
		
		super.processar(pedido);
		
		if(pedido.isValid()) {
			throw new RuntimeException("Não é possível continuar! Pedido sem Id");
		}

	}
}
