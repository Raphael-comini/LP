package br.cefetmg.inf.lab20250616;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FilaEncadeadaTest{
    @Test
    public void testFilaEncadeada1(){
        System.out.println("testFilaEncadeada1");
        Fila fila = new FilaEncadeada();
        assertTrue(fila.estaVazia());
        assertEquals(0, fila.tamanho());
        assertNull(fila.desenfileirar());
    }
    @Test
    public void testFilaEncadeada2(){
        System.out.println("testFilaEncadeada2");
        Fila fila = new FilaEncadeada();
        assertTrue(fila.estaVazia());
        int item = 1;
        fila.enfileirar(item);
        assertFalse(fila.estaVazia());
        assertEquals(1, fila.tamanho());
        assertEquals(item, fila.desenfileirar());
        assertEquals(0, fila.tamanho());
        assertTrue(fila.estaVazia());
    }
}


