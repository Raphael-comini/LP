package br.cefetmg.inf.lab20250623;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FilaCircularTest{
    @Test
    public void testFilaCircular1(){
        System.out.println("testFilaCircular1");
        Fila fila = new FilaCircular();
        assertTrue(fila.estaVazia());
        assertEquals(0, fila.tamanho());
        assertNull(fila.desenfileirar());
    }
    @Test
    public void testFilaCircular2(){
        System.out.println("testFilaCircular2");
        Fila fila = new FilaCircular();
        int item = 1;
        assertTrue(fila.estaVazia());
        fila.enfileirar(item);
        assertFalse(fila.estaVazia());
        assertEquals(1, fila.tamanho());
        assertEquals(item, fila.desenfileirar());
        assertTrue(fila.estaVazia());
        assertEquals(0, fila.tamanho());
    }
    @Test
    public void testFilaCircular3(){
        System.out.println("testFilaCircular3");
        Fila fila = new FilaCircular();
        assertTrue(fila.estaVazia());
        int[] itens = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for(int i=0, tamanho=1; i < itens.length; i++, tamanho++){
           int item = itens[i];
            fila.enfileirar(item);
            assertFalse(fila.estaVazia());
            assertEquals(tamanho, fila.tamanho());
        }
        assertEquals(1, fila.desenfileirar());; 
    }
}

