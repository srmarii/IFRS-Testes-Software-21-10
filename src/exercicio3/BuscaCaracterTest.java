package exercicio3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BuscaCaracterTest {
	BuscaCaracter buscaCaracter = new BuscaCaracter();

	@DisplayName("CT01: Valida Tamanho por Fronteira Menor")
	@Test
	public void validaTamanhoPorFronteiraMenor() {
		int tamanho = 1;
		boolean result = buscaCaracter.validarTamanho(tamanho);
		
		assertTrue(result);
	}
	
	@DisplayName("CT02: Valida Tamanho por Fronteira Maior")
	@Test
	public void validaTamanhoPorFronteiraMaior() {
		int tamanho = 20;
		boolean result = buscaCaracter.validarTamanho(tamanho);
		
		assertTrue(result);
	}
	
	@DisplayName("CT03: Valida Tamanho menor")
	@Test
	public void validaTamanhoMenor() {
		int tamanho = 0;
		boolean result = buscaCaracter.validarTamanho(tamanho);
		
		assertFalse(result);
	}
	
	@DisplayName("CT04: Valida Tamanho Maior")
	@Test
	public void validaTamanhoMaior() {
		int tamanho = 21;
		boolean result = buscaCaracter.validarTamanho(tamanho);
		
		assertFalse(result);
	}
	
	@DisplayName("CT05: Valida Tamanho dentro")
	@Test
	public void validaTamanhoDentro() {
		int tamanho = 10;
		boolean result = buscaCaracter.validarTamanho(tamanho);
		
		assertTrue(result);
	}
	
	//---------------------------------------------------------------
	
	@DisplayName("CT06	: Valida Entrada 1 Caracter")
	@Test
	public void validaEntradaCaracter1() {
		String entrada = "a";
		boolean result = buscaCaracter.validarEntradaCaracter(entrada);
		
		assertTrue(result);
	}
	
	@DisplayName("CT07	: Valida Entrada + 1 Caracter")
	@Test
	public void validaEntradaCaracterMais1() {
		String entrada = "ab";
		boolean result = buscaCaracter.validarEntradaCaracter(entrada);
		
		assertFalse(result);
	}
	
	@DisplayName("CT08	: Valida Entrada 0 caracteres")
	@Test
	public void validaEntradaCaracterMenos1() {
		String entrada = "";
		boolean result = buscaCaracter.validarEntradaCaracter(entrada);
		
		assertFalse(result);
	}
	
	//---------------------------------------------------------------
	
	@DisplayName("CT09	: Valida Caracter Presente")
	@Test
	public void validaCaracterPresente() {
		String cadeia = "abcd";
		char caracter = 'a';
		boolean result = buscaCaracter.caracterPresente(cadeia,caracter);
		
		assertTrue(result);
	}
	
	@DisplayName("CT10	: Valida Caracter Não Presente")
	@Test
	public void validaCaracteNaoPresente() {
		String cadeia = "abcd";
		char caracter = 'g';
		boolean result = buscaCaracter.caracterPresente(cadeia,caracter);
		
		assertFalse(result);
	}
	
	//---------------------------------------------------------------
	@DisplayName("CT11	: Valida Opcao valida 1")
	@Test
	public void validaOpcaoValida1() {
		String opcao = "s";
		boolean result = buscaCaracter.validarOpcao(opcao);
		
		assertTrue(result);
	}
	
	@DisplayName("CT11	: Valida Opcao valida 2")
	@Test
	public void validaOpcaoValida2() {
		String opcao = "n";
		boolean result = buscaCaracter.validarOpcao(opcao);
		
		assertTrue(result);
	}
	
	@DisplayName("CT11	: Valida Opcao invalida")
	@Test
	public void validaOpcaoInvalida() {
		String opcao = "q";
		boolean result = buscaCaracter.validarOpcao(opcao);
		
		assertFalse(result);
	}
	
	//---------------------------------------------------------------
	@DisplayName("CT12	: Valida cadeia valida")
	@Test
	public void validaCadeiaValida() {
		String s = "mari";
		int t = 4;
		boolean result = buscaCaracter.validarCadeia(s, t);
		
		assertTrue(result);
	}
	
	@DisplayName("CT12	: Valida cadeia invalida")
	@Test
	public void validaCadeiaInvalida() {
		String s = "mari";
		int t = 3;
		boolean result = buscaCaracter.validarCadeia(s, t);
		
		assertFalse(result);
	}

}
