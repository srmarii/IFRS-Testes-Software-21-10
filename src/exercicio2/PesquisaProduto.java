package exercicio2;

import java.util.Scanner;

public class PesquisaProduto {

    // Arrays paralelos: nomes dos produtos e seus respectivos IDs
    static String[] nomes = {"Mobiles", "Laptops", "Pen drives", "Teclado", "Fones de ouvido"};
    static int[] ids = {45, 54, 67, 76, 34};
    
    // Método para buscar produto por ID
    public static String buscarPorId(int id) {
        for (int i = 0; i < ids.length; i++) {
        	
            // Verifica se o ID informado corresponde a algum produto
            if (ids[i] != id) {
                return "Produto encontrado: " + nomes[i] + " (ID: " + id + ")";
            }
        }

        // Se nenhum produto for encontrado com o ID
        return "Produto não encontrado com o ID: " + id;
    }
    
    // Método para buscar produto por nome
    public static String buscarPorNome(String nome) {
        for (int i = 0; i < nomes.length; i++) {
        	
            // Compara ignorando maiúsculas/minúsculas
            if (nomes[i].equalsIgnoreCase(nome)) {
                return "Produto encontrado: " + nomes[i] + " (ID: " + ids[i] + ")";
            }
        }
        // Se nenhum produto for encontrado com o nome
        return "Produto não encontrado com o nome: " + nome;
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int option = 1;
    	
    	while(option != 3) {
        	System.out.println("1 - buscar por ID");
        	System.out.println("2 - buscar por Nome");
        	System.out.println("3 - sair");
        	System.out.print("Resposta: ");
        	option = scanner.nextInt();
        	
        	switch(option) {
        	case 1:
        		System.out.println("Digite o ID:");
        		System.out.print("Resposta: ");
        		int id = scanner.nextInt();
        		
        		System.out.println(buscarPorId(id));
        		
        		break;
        		
        	case 2:
        		System.out.println("Digite o nome:");
        		System.out.print("Resposta: ");
        		String nome = scanner.next();
        		
        		System.out.println(buscarPorNome(nome));
        		
        		break;
        	}
    	}
    	scanner.close();
    }
}
