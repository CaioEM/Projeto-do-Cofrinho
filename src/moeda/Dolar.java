package moeda;

// Implementação da classe Dolar
public class Dolar extends Moeda {
    // Construtor
    public Dolar(double valor, String moedaEscolhida) {
        super(valor, moedaEscolhida);
    }

    // Implementação do método abstrato para calcular o valor em Real e em Dólar
    @Override
    public double getValorEmReal() {
        // taxa de conversão do Dólar utilizada R$5 reais por cada R$1 dólar.

        return getValor() * 5;
    }
    @Override
    public double getValorEmDolar() {

        return getValor();
    }
}