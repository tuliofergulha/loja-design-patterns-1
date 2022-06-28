package br.com.fergulha.loja.imposto;

import java.math.BigDecimal;

import br.com.fergulha.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
