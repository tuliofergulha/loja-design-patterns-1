package br.com.fergulha.loja.pedido.acao;

import br.com.fergulha.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executar(Pedido pedido) {
        System.out.println("Enviando e-mail com dados do pedido!");
    }

}
