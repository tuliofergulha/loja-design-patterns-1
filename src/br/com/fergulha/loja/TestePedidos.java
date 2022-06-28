package br.com.fergulha.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.fergulha.loja.pedido.GeraPedido;
import br.com.fergulha.loja.pedido.GeraPedidoHandler;
import br.com.fergulha.loja.pedido.acao.EnviarEmailPedido;
import br.com.fergulha.loja.pedido.acao.LogDePedido;
import br.com.fergulha.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestePedidos {

    public static void main(String[] args) {
        String cliente = "Túlio";
        BigDecimal valorOrcamento = new BigDecimal("1500");
        int quantidadeItens = 1;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
            Arrays.asList(
                new SalvarPedidoNoBancoDeDados(),
                new EnviarEmailPedido(),
                new LogDePedido()));
        handler.execute(gerador);
    }
}
