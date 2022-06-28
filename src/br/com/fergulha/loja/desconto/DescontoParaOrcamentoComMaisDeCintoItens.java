package br.com.fergulha.loja.desconto;

import java.math.BigDecimal;

import br.com.fergulha.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCintoItens extends Desconto {

    public DescontoParaOrcamentoComMaisDeCintoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
