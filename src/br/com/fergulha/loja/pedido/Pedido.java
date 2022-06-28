package br.com.fergulha.loja.pedido;

import java.time.LocalDateTime;

import br.com.fergulha.loja.orcamento.Orcamento;

public class Pedido {

    private final String cliente;
    private final LocalDateTime data;
    private final Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime data,
        Orcamento orcamento) {
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
