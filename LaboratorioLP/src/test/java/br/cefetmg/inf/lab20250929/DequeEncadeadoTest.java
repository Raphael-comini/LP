package br.cefetmg.inf.lab20250929;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DequeEncadeadoTest {

    private DequeEncadeado<Integer> deque;

    @BeforeEach
    public void setUp() {
        deque = new DequeEncadeado<>();
    }

    @Test
    public void DequeEncadeado1() {
        System.out.println("testDequeEncadeado1");
        assertTrue(deque.estaVazia());
        assertEquals(0, deque.tamanho());
    }

    @Test
    public void DequeEncadeado2() {
        System.out.println("testDequeEncadeado2");

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
    public void DequeEncadeado3() {
        System.out.println("testDequeEncadeado3");

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
    public void DequeEncadeado4(){
        System.out.println("testDequeEncadeado4");
        
        try{
            deque.obterPrimeiro();
            assertTrue(false);
        }catch(DequeVazioException e){
            assertTrue(true);
        }catch(Exception e){
            assertTrue(false);
        }
    }
}