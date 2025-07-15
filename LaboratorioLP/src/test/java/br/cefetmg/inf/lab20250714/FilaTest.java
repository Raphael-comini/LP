package br.cefetmg.inf.lab20250714;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public abstract class FilaTest {
    public abstract Fila getInstance();
    @Test
    public void testFila1(){
        Fila fila = getInstance();
        System.out.println(fila.getClass().getName() + ": testFila1");
        assertTrue(fila.estaVazia());
        assertEquals(0, fila.tamanho());
        assertNull(fila.desenfileirar());
    }
    @Test
    public void testFila2(){
        Fila fila = getInstance();
        System.out.println(fila.getClass().getName() + ": testFila2");
        Integer item = 1;
        assertTrue(fila.estaVazia());
        fila.enfileirar(item);
        assertFalse(fila.estaVazia());
        assertEquals(1, fila.tamanho());
        assertEquals(item, fila.desenfileirar());
        assertTrue(fila.estaVazia());
        assertEquals(0, fila.tamanho());
    }
    @Test
    public void testFila3(){
        Fila fila = getInstance();
        System.out.println(fila.getClass().getName() + ": testFila3");
        assertTrue(fila.estaVazia());
        Integer[] itens = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for(int i=0, tamanho=1; i < itens.length; i++, tamanho++){
           Integer item = itens[i];
            fila.enfileirar(item);
            assertFalse(fila.estaVazia());
            assertEquals(tamanho, fila.tamanho());
        }
        assertEquals(1, fila.desenfileirar());
    }
}


