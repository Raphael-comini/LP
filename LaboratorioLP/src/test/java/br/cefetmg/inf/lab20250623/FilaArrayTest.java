package br.cefetmg.inf.lab20250623;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FilaArrayTest {

    @Test
    public void testFilaArray1() {
        System.out.println("testFilaArray1");
        Fila fila = new FilaArray();
        assertTrue(fila.estaVazia());
        assertEquals(0, fila.tamanho());
        assertNull(fila.desenfileirar());
    }

    @Test
    public void testFilaArray2() {
        System.out.println("testFilaArray2");
        Fila fila = new FilaArray();
        int item = 42;
        assertTrue(fila.estaVazia());
        fila.enfileirar(item);
        assertFalse(fila.estaVazia());
        assertEquals(1, fila.tamanho());
        assertEquals(item, fila.desenfileirar());
        assertTrue(fila.estaVazia());
        assertEquals(0, fila.tamanho());
    }

    @Test
    public void testFilaArray3() {
        System.out.println("testFilaArray3");
        Fila fila = new FilaArray();
        assertTrue(fila.estaVazia());
        int[] itens = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        for (int i = 0, tamanho = 1; i < itens.length; i++, tamanho++) {
            int item = itens[i];
            fila.enfileirar(item);
            assertFalse(fila.estaVazia());
            assertEquals(tamanho, fila.tamanho());
        }
        assertEquals(10, fila.desenfileirar());
    }

    @Test
    public void testFilaArrayOrdemRemocao() {
        System.out.println("testFilaArrayOrdemRemocao");
        Fila fila = new FilaArray();
        int[] itens = {5, 15, 25, 35, 45};
        for (int item : itens) {
            fila.enfileirar(item);
        }

        for (int item : itens) {
            assertEquals(item, fila.desenfileirar());
        }

        assertTrue(fila.estaVazia());
    }
}

