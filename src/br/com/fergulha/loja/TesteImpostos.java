package br.com.fergulha.loja;

import java.math.BigDecimal;

import br.com.fergulha.loja.imposto.CalculadoraDeImpostos;
import br.com.fergulha.loja.imposto.ICMS;
import br.com.fergulha.loja.imposto.ISS;
import br.com.fergulha.loja.orcamento.ItemOrcamento;
import br.com.fergulha.loja.orcamento.Orcamento;

public class TesteImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
