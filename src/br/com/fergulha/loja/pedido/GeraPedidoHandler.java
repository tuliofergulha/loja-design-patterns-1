package br.com.fergulha.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.fergulha.loja.orcamento.ItemOrcamento;
import br.com.fergulha.loja.orcamento.Orcamento;
import br.com.fergulha.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

    private final List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(dados.getValorOrcamento()));
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        acoes.forEach(a -> a.executar(pedido));
    }
}
