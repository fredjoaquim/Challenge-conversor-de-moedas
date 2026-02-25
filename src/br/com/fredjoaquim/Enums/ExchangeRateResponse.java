package br.com.fredjoaquim.Enums;

// Classe que representa o JSON retornado pela API.
public class ExchangeRateResponse {

    // Indica se a requisição foi sucesso.
    private String result;

    // Código da moeda base.
    private String base_code;

    // Código da moeda destino.
    private String target_code;

    // Taxa de conversão.
    private double conversion_rate;

    // Retorna se a requisição foi sucesso.
    public String getResult() {
        return result;
    }

    // Retorna o código da moeda base.
    public String getBase_code() {
        return base_code;
    }

    // Retorna o código da moeda destino.
    public String getTarget_code() {
        return target_code;
    }

    // Retorna a taxa.
    public double getConversion_rate() {
        return conversion_rate;
    }
}