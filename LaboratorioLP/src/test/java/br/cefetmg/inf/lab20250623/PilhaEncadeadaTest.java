package br.cefetmg.inf.lab20250623;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class PilhaEncadeadaTest {
    @Test
    public void testPilhaEncadeada1() {
        System.out.println("testPilhaEncadeada1");
        Pilha pilha = new PilhaEncadeada();
        assertTrue(pilha.estaVazia());
        assertEquals(0, pilha.tamanho());
        assertNull(pilha.obterNoTopo());
        assertNull(pilha.desempilhar());
    }
    
    @Test
    public void testPilhaEncadeada2() {
        System.out.println("testPilhaEncadeada2");
        Pilha pilha = new PilhaEncadeada();
        int item = 1;
        pilha.empilhar(item);
        assertFalse(pilha.estaVazia());
        assertEquals(1, pilha.tamanho());
        assertEquals(item, pilha.obterNoTopo());
        assertEquals(item, pilha.desempilhar());
        assertTrue(pilha.estaVazia());
        assertEquals(0, pilha.tamanho());
    }
    
    @Test
    public void testPilhaEncadeada3() {
        System.out.println("testPilhaEncadeada3");
        Pilha pilha = new PilhaEncadeada();
        assertTrue(pilha.estaVazia());
        
        int[] itens = {1, 2};
        for(int i=0, tamanho=1; i < itens.length; i++, tamanho++) {
            int item = itens[i];
            pilha.empilhar(item);
            assertFalse(pilha.estaVazia());
            assertEquals(tamanho, pilha.tamanho());
            assertEquals(item, pilha.obterNoTopo());
        }
        
        for(int i=itens.length-1, tamanho=1; i >= 0; i--, tamanho--) {
            int item = pilha.desempilhar();
            assertEquals(item, itens[i]);
            assertEquals(tamanho, pilha.tamanho());
        }
        assertTrue(pilha.estaVazia());
        assertEquals(0, pilha.tamanho());
        
        assertNull(pilha.obterNoTopo());
        assertNull(pilha.desempilhar());        
    }
}
