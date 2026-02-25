package br.com.fredjoaquim.conversor.Service;

import br.com.fredjoaquim.conversor.Client.ExchangeRateClient;
import br.com.fredjoaquim.Enums.ConversionResult;
import br.com.fredjoaquim.Enums.ExchangeRateResponse;
import br.com.fredjoaquim.Model.CurrencyOption;
// Classe responsável pela regra de negócio.
public class CurrencyConverterService {

    // Cliente que acessa a API externa.
    private final ExchangeRateClient client = new ExchangeRateClient();

    // Método que realiza a conversão.
    public ConversionResult convert(CurrencyOption option, double value)
            throws Exception {

        // Busca a taxa de conversão na API.
        ExchangeRateResponse response =
                client.getExchangeRate(option.getFrom(), option.getTo());

        // Calcula o valor convertido.
        double convertedValue = value * response.getConversion_rate();

        // Retorna objeto com o resultado final.
        return new ConversionResult(
                option.getFrom(),
                option.getTo(),
                value,
                convertedValue
        );
    }
}