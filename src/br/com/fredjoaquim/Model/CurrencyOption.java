// Pacote onde ficam os enums.
package br.com.fredjoaquim.Model;

// Enum é um tipo especial usado para representar constantes fixas.
public enum CurrencyOption {

    // Cada opção representa:
    // (numero do menu, moeda origem, moeda destino)
    USD_TO_ARS(1, "USD", "ARS"),
    ARS_TO_USD(2, "ARS", "USD"),
    USD_TO_BRL(3, "USD", "BRL"),
    BRL_TO_USD(4, "BRL", "USD"),
    USD_TO_COP(5, "USD", "COP"),
    COP_TO_USD(6, "COP", "USD");

    // Número da opção no menu.
    private final int option;

    // Código da moeda de origem.
    private final String from;

    // Código da moeda de destino.
    private final String to;

    // Construtor do enum.
    CurrencyOption(int option, String from, String to) {
        this.option = option;
        this.from = from;
        this.to = to;
    }

    // Retorna a opção.
    public int getOption() {
        return option;
    }

    // Retorna moeda de origem.
    public String getFrom() {
        return from;
    }

    // Retorna moeda de destino.
    public String getTo() {
        return to;
    }

    // Método que recebe o número digitado e retorna o enum correspondente.
    public static CurrencyOption fromOption(int option) {

        // Percorre todas as opções do enum.
        for (CurrencyOption op : values()) {

            // Se encontrar a opção correspondente, retorna.
            if (op.option == option) {
                return op;
            }
        }

        // Se não encontrar, retorna null.
        return null;
    }
}