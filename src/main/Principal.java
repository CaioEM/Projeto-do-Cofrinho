package main;
import moeda.Dolar;
import java.util.Scanner;

// Classe Principal
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        int opcao;
        do {
            // Exibe o menu na tela do usuário
            System.out.println("");
            System.out.println("       MENU DE OPÇÕES ");
            System.out.println("");
            System.out.println("1 -    Adicionar moeda");
            System.out.println("2 -     Remover moeda");
            System.out.println("3 -     Listar moedas");
            System.out.println("4 - Calcular total em Real");
            System.out.println("0 -          Sair");
            System.out.println("");
            System.out.print("Escolha a opção desejada: ");
            opcao = scanner.nextInt();

            // Executa a ação correspondente à opção escolhida
            switch (opcao) {
                case 1:
                    adicionarMoeda(scanner, cofrinho);
                    break;
                case 2:
                    removerMoeda(scanner, cofrinho);
                    break;
                case 3:
                    cofrinho.listarMoedas();
                    break;
                case 4:
                    System.out.println("Total em Reais: R$" + cofrinho.calcularTotalEmReal());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente por favor.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // Método para adicionar moeda no cofrinho
    public static void adicionarMoeda(Scanner scanner, Cofrinho cofrinho) {
        // Exibe as opções de moedas aceitas.
        System.out.println("Opções de moedas:");
        System.out.println("1. Dólar");
        System.out.println("2. Real");


        // Solicitar a escolha do usuário
        System.out.print("Escolha o tipo de moeda que deseja adicionar (1 ou 2): ");
        int escolha = scanner.nextInt();

        // Criar a moeda com base na escolha do usuário
        String moedaEscolhida;
        switch (escolha) {
            case 1:
                moedaEscolhida = "Dólar";
                break;
            case 2:
                moedaEscolhida = "Real";
                break;
            default:
                moedaEscolhida = "Opção Inválida";
                break;
        }

        // Solicitar o valor da moeda
        System.out.print("Digite o valor da moeda: ");
        double valor = scanner.nextDouble();

        // Adicionar a moeda ao cofrinho
        cofrinho.adicionarMoeda(new Dolar(valor, moedaEscolhida));
        System.out.println("Moeda adicionada com sucesso!!");
    }

    // Método para remover moeda do cofrinho
    private static void removerMoeda(Scanner scanner, Cofrinho cofrinho) {
        cofrinho.listarMoedas();
        System.out.print("Digite o número da moeda que deseja remover: ");
        int numero = scanner.nextInt();
        cofrinho.removerMoeda(numero);
        System.out.println("Moeda removida com sucesso!!");
    }
}