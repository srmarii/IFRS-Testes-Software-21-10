package exercicio3;

import java.util.Scanner;

public class BuscaCaracter {
	//
    public boolean validarTamanho(int t) {
        return t >= 1 && t <= 20;
    }

    //
    public boolean validarCadeia(String s, int t) {
        return s.length() == t;
    }

    //
    public boolean validarEntradaCaracter(String entrada) {
        return entrada.length() == 1;
    }

    //
    public boolean caracterPresente(String s, char c) {
        return s.indexOf(c) >= 0;
    }

    //
    public boolean validarOpcao(String opcao) {
        return opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("n");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BuscaCaracter service = new BuscaCaracter();
        int tamanho = 0;

        // 1. Solicita um inteiro positivo entre 1 e 20
        while (true) {
            System.out.print("Informe um número inteiro positivo (1-20): ");
            if (scanner.hasNextInt()) {
                tamanho = scanner.nextInt();
                scanner.nextLine(); // consome a quebra de linha
                if (service.validarTamanho(tamanho)) {
                    break;
                }
            } else {
                scanner.nextLine(); // descarta entrada inválida
            }
            System.out.println("Entrada inválida! Tente novamente.");
        }

        // 2. Solicita uma cadeia de caracteres do tamanho informado
        String texto;
        while (true) {
            System.out.print("Informe uma cadeia de " + tamanho + " caracteres: ");
            texto = scanner.nextLine();
            if (service.validarCadeia(texto, tamanho)) {
                break;
            }
            System.out.println("A cadeia deve ter exatamente " + tamanho + " caracteres. Tente novamente.");
        }

        // 3. Loop para busca de caracteres
        String opcao;
        do {
            System.out.print("Informe o caracter a ser buscado: ");
            String entrada = scanner.nextLine();
            if (!service.validarEntradaCaracter(entrada)) {
                System.out.println("Por favor, digite apenas um caracter.");
            } else {
                char caracter = entrada.charAt(0);
                if (service.caracterPresente(texto, caracter)) {
                    System.out.println("O caracter '" + caracter + "' foi encontrado na cadeia.");
                } else {
                    System.out.println("O caracter '" + caracter + "' não está presente na cadeia.");
                }
            }

            System.out.print("Deseja buscar outro caracter? (s/n): ");
            opcao = scanner.nextLine().trim().toLowerCase();
        } while (service.validarOpcao(opcao) && opcao.equals("s"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
