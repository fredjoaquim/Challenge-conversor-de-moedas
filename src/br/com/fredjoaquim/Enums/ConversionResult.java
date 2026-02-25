package br.com.fredjoaquim.Enums;

// Classe que representa o resultado final da conversão.
public class ConversionResult {

    private final String from;
    private final String to;
    private final double originalValue;
    private final double convertedValue;

    // Construtor
    public ConversionResult(String from, String to,
                            double originalValue,
                            double convertedValue) {
        this.from = from;
        this.to = to;
        this.originalValue = originalValue;
        this.convertedValue = convertedValue;
    }

    // Métodos getters
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public double getOriginalValue() {
        return originalValue;
    }

    public double getConvertedValue() {
        return convertedValue;
    }
}