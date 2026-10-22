package exercicio1;

import java.util.Scanner;

public class ValidacaoPorcentagem {

    // Função para verificar se a porcentagem é válida
    public static boolean isPorcentagemValida(float porcentagem) {
        return (porcentagem >= 50 && porcentagem < 90);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a porcentagem da aplicação (entre 50 e 90): ");
        float porcentagem = scanner.nextFloat();

        if (isPorcentagemValida(porcentagem)) {
            System.out.printf("Porcentagem válida: %.2f%%\n", porcentagem);
        } else {
            System.out.printf("Porcentagem inválida: %.2f%%\n", porcentagem);
            System.out.println("A porcentagem deve estar entre 50% e 90%.");
        }
        scanner.close();
    }
}