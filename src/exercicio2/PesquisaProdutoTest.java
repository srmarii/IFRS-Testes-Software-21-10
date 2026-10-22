package exercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PesquisaProdutoTest {
	PesquisaProduto pesquisaProduto = new PesquisaProduto();

	@DisplayName("CT01: Busca por '45'")
	@Test
	public void buscaPor45() {
		int id = 45;
		String result = pesquisaProduto.buscarPorId(id);
		
		assertEquals("Produto encontrado: Mobiles (ID: 45)", result);
	}
	
	@DisplayName("CT02: Busca por 'Mobiles'")
	@Test
	public void buscaPorMobiles() {
		String nome = "Mobiles";
		String result = pesquisaProduto.buscarPorNome(nome);
		
		assertEquals("Produto encontrado: Mobiles (ID: 45)", result);
	}
	
	@DisplayName("CT03: Busca por '76'")
	@Test
	public void buscaPor76() {
		int id = 76;
		String result = pesquisaProduto.buscarPorId(id);
		
		assertEquals("Produto encontrado: Teclado (ID: 76)", result);
	}
	
	@DisplayName("CT04: Busca por '89'")
	@Test
	public void buscaPor89() {
		int id = 89;
		String result = pesquisaProduto.buscarPorId(id);
		
		assertEquals("Produto não encontrado com o ID: 89", result);
	}
	
	@DisplayName("CT05: Busca por produto que não existe")
	@Test
	public void buscaProdutoNaoExistente() {
		String nome = "Monitor";
		String result = pesquisaProduto.buscarPorNome(nome);
		
		assertEquals("Produto não encontrado com o nome: Monitor", result);
	}

}
