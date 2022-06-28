package br.com.fergulha.loja;

import java.math.BigDecimal;

import br.com.fergulha.loja.http.JavaHttpClient;
import br.com.fergulha.loja.orcamento.ItemOrcamento;
import br.com.fergulha.loja.orcamento.Orcamento;
import br.com.fergulha.loja.orcamento.RegistroDeOrcamento;

public class TesteAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
