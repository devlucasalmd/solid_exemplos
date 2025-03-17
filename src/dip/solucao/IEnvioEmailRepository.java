package dip.solucao;

import srp_principio.violacao.Pedido;

public interface IEnvioEmailRepository {

    void enviarEmailConfirmacao(Pedido order);
}
