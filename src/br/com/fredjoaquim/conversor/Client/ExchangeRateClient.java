package br.com.fredjoaquim.conversor.Client;
import br.com.fredjoaquim.Enums.ExchangeRateResponse;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Classe responsável por se comunicar com a API.
public class ExchangeRateClient {

    // Sua chave da API.
    private static final String API_KEY = "49b3347e8d648a7e4d942755";

    // URL base da API.
    private static final String BASE_URL =
            "https://v6.exchangerate-api.com/v6/";

    // Método que retorna a taxa de conversão.
    public ExchangeRateResponse getExchangeRate(String from, String to)
            throws IOException, InterruptedException {

        // Monta a URL final.
        String url = BASE_URL + API_KEY + "/pair/" + from + "/" + to;

        // Cria cliente HTTP.
        HttpClient client = HttpClient.newHttpClient();

        // Cria requisição GET.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        // Envia requisição e captura resposta como String.
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        // Cria objeto Gson.
        Gson gson = new Gson();

        // Converte JSON em objeto Java.
        return gson.fromJson(response.body(), ExchangeRateResponse.class);
    }
}