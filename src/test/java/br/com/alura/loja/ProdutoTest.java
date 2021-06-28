package br.com.alura.loja;

import static org.junit.Assert.*;

import org.junit.Test;

import java.math.BigDecimal;

public class ProdutoTest {

	@Test
	public void test() {
		Produto p = new Produto("teste", BigDecimal.TEN);
		assertEquals("teste", p.getNome());
		assertEquals(BigDecimal.TEN, p.getPreco());
	}

}
