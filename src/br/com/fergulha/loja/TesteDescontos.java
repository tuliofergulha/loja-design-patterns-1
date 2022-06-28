package br.com.fergulha.loja;

import java.math.BigDecimal;

import br.com.fergulha.loja.desconto.CalculadoraDeDescontos;
import br.com.fergulha.loja.orcamento.ItemOrcamento;
import br.com.fergulha.loja.orcamento.Orcamento;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

        Orcamento terceiro = new Orcamento();
        terceiro.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        System.out.println(calculadora.calcular(terceiro));
    }
}
