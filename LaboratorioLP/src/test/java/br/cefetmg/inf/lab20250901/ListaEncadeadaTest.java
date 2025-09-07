package br.cefetmg.inf.lab20250901;

import br.cefetmg.inf.lab20250901.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ListaEncadeadaTest {

    private Lista lista;

    @BeforeEach
    void setUp() {
        lista = new ListaEncadeada();
    }

    @Test
    void testListaEncadeada01() {
        lista.inserirInicio("A");
        assertEquals("A", lista.obterInicio());
    }

    @Test
    void testListaEncadeada02() {
        lista.inserirFim("B");
        assertEquals("B", lista.obterFim());
    }

    @Test
    void testListaEncadeada03() {
        lista.inserirInicio("C");
        assertEquals("C", lista.removerInicio());
        assertTrue(lista.estaVazia());
    }

    @Test
    void testListaEncadeada04() {
        assertThrows(ListaVaziaException.class, () -> lista.removerInicio());
    }

    @Test
    void testListaEncadeada05() {
        lista.inserirFim("X");
        lista.inserirFim("Y");
        assertEquals(1, lista.pesquisar("Y"));
    }
}
