package br.cefetmg.inf.lab20250609;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ListaDuplamenteEncadeadaTest {

    @Test
    public void testListaDuplamenteEncadeada1() {
         System.out.println("testListaDuplamenteEncadeada1");
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        assertTrue(lista.estaVazia());
        assertEquals(0, lista.tamanho());
        assertNull(lista.obterInicio());
        assertNull(lista.removerInicio());
    }

    @Test
    public void testListaDuplamenteEncadeada2() {
         System.out.println("testListaDuplamenteEncadeada2");
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.inserirInicio(2); 
        lista.inserirFim(4);   
        lista.inserirInicio(1); 

        assertEquals(3, lista.tamanho());
        assertEquals(1, lista.obterInicio());
        assertEquals(4, lista.obterFim());
        assertEquals(2, lista.obterPosicao(1));
    }

    @Test
    public void testListaDuplamenteEncadeada3() {
         System.out.println("testListaDuplamenteEncadeada3");
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.inserirFim(10);
        lista.inserirFim(30);
        lista.inserirPosicao(1, 20); 

        assertEquals(20, lista.obterPosicao(1));
        assertEquals(20, lista.removerPosicao(1));
        assertEquals(30, lista.removerFim());
        assertEquals(10, lista.removerInicio());
        assertTrue(lista.estaVazia());
    }

    @Test
    public void testListaDuplamenteEncadeada4() {
        System.out.println("testListaDuplamenteEncadeada4");
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.inserirFim(100);
        lista.inserirFim(200);
        lista.inserirFim(300);

        assertEquals(1, lista.pesquisar(200));
        assertEquals(-1, lista.pesquisar(999));
        assertNull(lista.obterPosicao(-1));
        assertNull(lista.obterPosicao(5));
    }
}

