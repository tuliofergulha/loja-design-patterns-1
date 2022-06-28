package br.com.fergulha.loja.desconto;

import java.math.BigDecimal;

import br.com.fergulha.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCintoItens(
            new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
