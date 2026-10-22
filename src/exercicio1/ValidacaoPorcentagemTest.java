package exercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidacaoPorcentagemTest {
	ValidacaoPorcentagem validacaoPorcentagem = new ValidacaoPorcentagem();
	
	@DisplayName("CT01: Dentro de 50 e 90")
	@Test
	public void dentroDosValores() {
		float number = 60;
		boolean result = validacaoPorcentagem.isPorcentagemValida(number);
		
		assertTrue(result);
	}
	
	@DisplayName("CT02: Fronteira menor")
	@Test
	public void fronteiraMenor() {
		float number = 50;
		boolean result = validacaoPorcentagem.isPorcentagemValida(number);
		
		assertTrue(result);
	}
	
	@DisplayName("CT03: Fronteira maior")
	@Test
	public void fronteiraMaior() {
		float number = 90;
		boolean result = validacaoPorcentagem.isPorcentagemValida(number);
		
		assertTrue(result);
	}
	
	@DisplayName("CT04: Abaixo dos valores")
	@Test
	public void abaixoDosValores() {
		float number = 49;
		boolean result = validacaoPorcentagem.isPorcentagemValida(number);
		
		assertFalse(result);
	}
	
	@DisplayName("CT05: Acima dos valores")
	@Test
	public void acimaDosValores() {
		float number = 91;
		boolean result = validacaoPorcentagem.isPorcentagemValida(number);
		
		assertFalse(result);
	}

}
