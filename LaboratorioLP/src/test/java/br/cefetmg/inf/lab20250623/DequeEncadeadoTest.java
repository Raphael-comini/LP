package br.cefetmg.inf.lab20250623;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DequeEncadeadoTest {

    @Test
    public void testDequeEncadeado1() {
        System.out.println("testDequeEncadeado1");
        DequeEncadeado deque = new DequeEncadeado();
        assertTrue(deque.estaVazia());
        assertEquals(0, deque.tamanho());
        assertNull(deque.removerPrimeiro());
        assertNull(deque.removerUltimo());
        assertNull(deque.obterPrimeiro());
        assertNull(deque.obterUltimo());
    }

    @Test
    public void testDequeEncadeado2() {
        System.out.println("testDequeEncadeado2");
        DequeEncadeado deque = new DequeEncadeado();

        deque.inserirNoInicio(10);
        assertFalse(deque.estaVazia());
        assertEquals(1, deque.tamanho());
        assertEquals(10, deque.obterPrimeiro());
        assertEquals(10, deque.obterUltimo());

        deque.inserirNoFim(20);
        assertEquals(2, deque.tamanho());
        assertEquals(10, deque.obterPrimeiro());
        assertEquals(20, deque.obterUltimo());

        assertEquals(10, deque.removerPrimeiro());
        assertEquals(1, deque.tamanho());
        assertEquals(20, deque.obterPrimeiro());
        assertEquals(20, deque.obterUltimo());

        assertEquals(20, deque.removerUltimo());
        assertEquals(0, deque.tamanho());
        assertTrue(deque.estaVazia());
    }
     @Test
    public void testDequeEncadeado3() {
        System.out.println("testDequeEncadeado3");
        DequeEncadeado deque = new DequeEncadeado();

        deque.inserirNoInicio(10);
        assertFalse(deque.estaVazia());
        assertEquals(1, deque.tamanho());
        assertEquals(10, deque.obterPrimeiro());
        assertEquals(10, deque.obterUltimo());

        deque.inserirNoFim(20);
        assertEquals(2, deque.tamanho());
        assertEquals(10, deque.obterPrimeiro());
        assertEquals(20, deque.obterUltimo());

        assertEquals(10, deque.removerPrimeiro());
        assertEquals(1, deque.tamanho());
        assertEquals(20, deque.obterPrimeiro());
        assertEquals(20, deque.obterUltimo());

        assertEquals(20, deque.removerUltimo());
        assertEquals(0, deque.tamanho());
        assertTrue(deque.estaVazia());
    }
}