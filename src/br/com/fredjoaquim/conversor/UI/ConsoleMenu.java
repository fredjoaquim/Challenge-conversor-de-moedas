// Define o pacote da camada de interface com o usuário.
package br.com.fredjoaquim.conversor.UI;

import br.com.fredjoaquim.Enums.ConversionResult;
import br.com.fredjoaquim.Model.CurrencyOption;
// Importa a classe responsável pela regra de negócio.
import br.com.fredjoaquim.conversor.Service.CurrencyConverterService;

// Importa Scanner para leitura de dados via teclado.
import java.util.Scanner;

// Classe responsável pela interação com o usuário.
public class ConsoleMenu {

    // Cria uma instância do serviço que realiza a conversão.
    private final CurrencyConverterService service = new CurrencyConverterService();

    // Scanner para capturar dados digitados pelo usuário.
    private final Scanner scanner = new Scanner(System.in);

    // Método que inicia o menu.
    public void start() {

        // Variável que armazenará a opção escolhida.
        int option;

        // Loop infinito. Ele só termina quando usamos "break".
        do {

            // Exibe as opções no console.
            showMenu();

            // Lê o número digitado pelo usuário.
            option = scanner.nextInt();

            // Se o usuário escolher 7, encerra o programa.
            if (option == 7) {
                System.out.println("Encerrando aplicação...");
                break; // Sai do loop
            }

            // Converte o número digitado para o enum correspondente.
            CurrencyOption currencyOption = CurrencyOption.fromOption(option);

            // Se não existir opção válida, mostra erro.
            if (currencyOption == null) {
                System.out.println("Opção inválida!");
                continue; // Volta para o início do loop
            }

            // Solicita o valor a ser convertido.
            System.out.print("Digite o valor que deseja converter: ");

            // Lê o valor digitado.
            double value = scanner.nextDouble();

            try {
                // Chama o serviço que faz a conversão.
                ConversionResult result = service.convert(currencyOption, value);

                // Mostra o resultado formatado com duas casas decimais.
                System.out.printf(
                        "\n%.2f %s correspondem a %.2f %s\n\n",
                        result.getOriginalValue(),
                        result.getFrom(),
                        result.getConvertedValue(),
                        result.getTo()
                );

            } catch (Exception e) {
                // Caso aconteça erro na API ou na conversão.
                System.out.println("Erro ao realizar conversão: " + e.getMessage());
            }

        } while (true); // Continua até o usuário escolher sair
    }

    // Método privado que apenas imprime o menu.
    private void showMenu() {

        System.out.println("=================================");
        System.out.println("Seja bem-vindo ao Conversor de Moeda");
        System.out.println("1) Dólar => Peso argentino");
        System.out.println("2) Peso argentino => Dólar");
        System.out.println("3) Dólar => Real brasileiro");
        System.out.println("4) Real brasileiro => Dólar");
        System.out.println("5) Dólar => Peso colombiano");
        System.out.println("6) Peso colombiano => Dólar");
        System.out.println("7) Sair");
        System.out.print("Escolha uma opção válida: ");
    }
}