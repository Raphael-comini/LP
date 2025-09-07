package br.cefetmg.inf.lab20250901;

import br.cefetmg.inf.lab20250901.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ListaArrayTest {

    private Lista lista;

    @BeforeEach
    void setUp() {
        lista = new ListaArray();
    }

    @Test
    void testListaArray01() {
        lista.inserirInicio("A");
        assertEquals("A", lista.obterInicio());
    }

    @Test
    void testListaArray02() {
        lista.inserirFim("B");
        assertEquals("B", lista.obterFim());
    }

    @Test
    void testListaArray03() {
        lista.inserirInicio("C");
        assertEquals("C", lista.removerInicio());
        assertTrue(lista.estaVazia());
    }

    @Test
    void testListaArray04() {
        assertThrows(ListaVaziaException.class, () -> lista.removerInicio());
    }

    @Test
    void testListaArray05() {
        lista.inserirFim("X");
        lista.inserirFim("Y");
        assertEquals(1, lista.pesquisar("Y"));
    }
}
