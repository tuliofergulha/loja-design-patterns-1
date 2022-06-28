package br.com.fergulha.loja.imposto;

import java.math.BigDecimal;

import br.com.fergulha.loja.orcamento.Orcamento;

public class ISS extends Imposto {

    public ISS(Imposto outro) {
        super(outro);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
