package br.cefetmg.inf.lab20250616;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ListaEncadeadaTest {

    @Test
    public void testListaEncadeada1() {
        System.out.println("testListaEncadeada1");
        ListaEncadeada lista = new ListaEncadeada();
        assertTrue(lista.estaVazia());
        assertEquals(0, lista.tamanho());
        assertNull(lista.obterInicio());
        assertNull(lista.obterFim());
        assertNull(lista.removerInicio());
        assertNull(lista.removerFim());
        assertEquals(-1, lista.pesquisar(42));
    }

    @Test
    public void testListaEncadeada2() {
        System.out.println("testListaEncadeada2");
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserirInicio(10); 
        lista.inserirFim(20);   

        assertEquals(2, lista.tamanho());
        assertEquals(10, lista.obterInicio());
        assertEquals(20, lista.obterFim());

        assertEquals(10, lista.obterPosicao(0));
        assertEquals(20, lista.obterPosicao(1));
    }

    @Test
    public void testListaEncadeada3() {
        System.out.println("testListaEncadeada3");
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirFim(1);
        lista.inserirFim(3);
        lista.inserirPosicao(1, 2);

        assertEquals(3, lista.tamanho());
        assertEquals(2, lista.obterPosicao(1));

        assertFalse(lista.inserirPosicao(-1, 99));
        assertFalse(lista.inserirPosicao(100, 99));
    }

    @Test
    public void testListaEncadeada4() {
        System.out.println("testListaEncadeada4");
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirFim(1);
        lista.inserirFim(2);
        lista.inserirFim(3);

        assertEquals(1, lista.removerInicio()); 
        assertEquals(3, lista.removerFim());    
        assertEquals(2, lista.removerPosicao(0));
        assertNull(lista.removerPosicao(0));
    }

    @Test
    public void testListaEncadeada5() {
        System.out.println("testListaEncadeada5");
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirFim(5);
        lista.inserirFim(10);
        lista.inserirFim(15);

        assertEquals(0, lista.pesquisar(5));
        assertEquals(1, lista.pesquisar(10));
        assertEquals(2, lista.pesquisar(15));
        assertEquals(-1, lista.pesquisar(99));
    }

    @Test
    public void testListaEncadeada6() {
        System.out.println("testListaEncadeada6");
        ListaEncadeada lista = new ListaEncadeada();

        assertTrue(lista.estaVazia());
        lista.inserirInicio(1);
        assertFalse(lista.estaVazia());
        assertEquals(1, lista.tamanho());
    }
}

