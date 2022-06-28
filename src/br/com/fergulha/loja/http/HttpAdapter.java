package br.com.fergulha.loja.http;

import java.util.Map;

public interface HttpAdapter {

    void post(String url, Map<String, Object> dados);
}
