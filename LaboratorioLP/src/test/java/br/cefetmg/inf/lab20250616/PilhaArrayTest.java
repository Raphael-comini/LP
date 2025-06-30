package br.cefetmg.inf.lab20250616;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PilhaArrayTest{
    @Test
    public void testPilhaArray1(){
       System.out.println("testPilhaArray1");
        Pilha pilha = new PilhaArray();
        assertTrue(pilha.estaVazia());
        assertEquals(0, pilha.tamanho());
        assertNull(pilha.obterNoTopo());
        assertNull(pilha.desempilhar()); 
    }
     @Test
    public void testPilhaArray2() {
        System.out.println("testPilhaArray2");
        Pilha pilha = new PilhaArray();
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
    public void testPilhaArray3(){
        System.out.println("testPilhaArray3");
        Pilha pilha = new PilhaArray();
        assertTrue(pilha.estaVazia());
        int[] itens = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for(int i=0, tamanho=1; i < itens.length; i++, tamanho++){
           int item = itens[i];
            pilha.empilhar(item);
            assertFalse(pilha.estaVazia());
            assertEquals(tamanho, pilha.tamanho());
            assertEquals(item, pilha.obterNoTopo()); 
        }
        pilha.desempilhar();
        assertEquals(10, pilha.obterNoTopo()); 
    }
}
