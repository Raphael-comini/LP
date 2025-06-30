package br.cefetmg.inf.lab20250616;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DequeCircularTest {

    @Test
    public void testDequeCircular1() {
        System.out.println("testDequeCircular1");
        DequeCircular deque = new DequeCircular(3);
        assertTrue(deque.estaVazia());
        assertEquals(0, deque.tamanho());
        assertNull(deque.removerPrimeiro());
        assertNull(deque.removerUltimo());
        assertNull(deque.obterPrimeiro());
        assertNull(deque.obterUltimo());
    }

    @Test
    public void testDequeCircular2() {
        System.out.println("testDequeCircular2");
        DequeCircular deque = new DequeCircular(3);

        deque.inserirNoFim(10);
        deque.inserirNoInicio(5);
        deque.inserirNoFim(15);

        assertEquals(3, deque.tamanho());
        assertEquals(5, deque.obterPrimeiro());
        assertEquals(15, deque.obterUltimo());

        assertEquals(5, deque.removerPrimeiro());
        assertEquals(2, deque.tamanho());
        assertEquals(15, deque.removerUltimo());
        assertEquals(1, deque.tamanho());

        assertEquals(10, deque.obterPrimeiro());
        assertEquals(10, deque.removerUltimo());
        assertTrue(deque.estaVazia());
    }

    @Test
    public void testDequeCircular3() {
        System.out.println("testDequeCircular3");
        DequeCircular deque = new DequeCircular(2);

        deque.inserirNoFim(1);
        deque.inserirNoFim(2);
        deque.inserirNoFim(3); 

        assertEquals(3, deque.tamanho());
        assertEquals(1, deque.obterPrimeiro());
        assertEquals(3, deque.obterUltimo());

        assertEquals(1, deque.removerPrimeiro());
        assertEquals(2, deque.removerPrimeiro());
        assertEquals(3, deque.removerPrimeiro());
        assertTrue(deque.estaVazia());
    }

    @Test
    public void testDequeCircular4() {
        System.out.println("testDequeCircular4");
        DequeCircular deque = new DequeCircular(4);

        deque.inserirNoInicio(20);
        deque.inserirNoInicio(10);
        deque.inserirNoFim(30);
        deque.inserirNoFim(40);

        assertEquals(4, deque.tamanho());
        assertEquals(10, deque.removerPrimeiro());
        assertEquals(40, deque.removerUltimo());
        assertEquals(2, deque.tamanho());
        assertEquals(20, deque.obterPrimeiro());
        assertEquals(30, deque.obterUltimo());
    }
}

