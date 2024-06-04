package main;

import moeda.Dolar;
import moeda.Moeda;
import java.util.ArrayList;

// Implementação da classe Cofrinho
public class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<>();

    // Método para adicionar uma moeda ao cofrinho
    public void adicionarMoeda(Dolar moeda) {
        moedas.add(moeda);
    }

    // Método para remover uma moeda do cofrinho
    public void removerMoeda(int indice) {
        if (indice >= 0 && indice < moedas.size()) {
            moedas.remove(indice);
        } else {
            System.out.println("Número da moeda não encontrada.");
        }
    }

    // Método para listar todas as moedas no cofrinho
    public void listarMoedas() {
        for (int i = 0; i < moedas.size(); i++) {
            System.out.println(i + ". " + moedas.get(i).getmoedaEscolhida() + ": " + moedas.get(i).getValor());
        }
    }

    // Calcular o total em reais montante do cofrinho ***
    public double calcularTotalEmReal() {
        double totalReal = 0;

        for (Moeda moeda : moedas) {

            if (moeda instanceof Dolar) {
                totalReal += moeda.getValor(); // Somar valores em dólar diretamente
            } else {
                totalReal += moeda.getValor() * 5; // Multiplicar valores em reais por 5 que é a taxa de cambio utilizada
            }
        }
        System.out.println("Funcionalidade com defeito :/ - Em breve o código estará completo e funcional.");
        return totalReal;
    }
}