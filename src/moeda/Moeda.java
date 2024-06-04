package moeda;

// Classe abstrata Moeda
public abstract class Moeda {
    private double valor;
    private String moedaEscolhida;

    // Construtor
    public Moeda(double valor, String moedaEscolhida) {
        this.valor = valor;
        this.moedaEscolhida = moedaEscolhida;
    }

    // Método para obter o valor da moeda
    public double getValor() {
        return valor;
    }

    // Método para obter a moeda desejada
    public String getmoedaEscolhida() {
        return moedaEscolhida;
    }

    // Método abstrato para calcular o valor em Real da moeda
    public abstract double getValorEmReal();
    public abstract double getValorEmDolar();
}