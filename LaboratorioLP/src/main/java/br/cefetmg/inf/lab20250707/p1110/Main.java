package br.cefetmg.inf.lab20250707.p1110;
import br.cefetmg.inf.lab20250623.DequeEncadeado;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            n = scanner.nextInt();
            DequeEncadeado deque = new DequeEncadeado();
            EmpilharCartas empilho = new EmpilharCartas(n, deque);
            empilho.inserirCartas();
            Jogadas jogadas = new Jogadas(deque, n);
            jogadas.jogar();
        }while(n != 0);
    }
}
class EmpilharCartas{
    private final DequeEncadeado deque;
    private final int quant;
    public EmpilharCartas(int n, DequeEncadeado deque){
        quant = n;
        this.deque = deque;
    }
    public void inserirCartas(){
        for(int i = 1; quant > i; i++){
            deque.inserirNoFim(i);
        }
    }
}
class Jogadas{
    private final DequeEncadeado deque;
    private final int[] descartes;
    private int restantes;
    int quantidade;
    public Jogadas(DequeEncadeado deque, int n){
        this.deque = deque;
        quantidade = n;
        descartes = new int[quantidade - 1];
    }
    public void jogar(){
        int aux = 0;
        while(deque.tamanho() > 1){
            descartes[aux] = deque.removerPrimeiro();
            aux ++;
            deque.inserirNoFim(deque.removerPrimeiro());
        }
        restantes = deque.obterPrimeiro();
        ViewConsole carregar = new ViewConsole(obterDescartes(), obterRestantes());
        carregar.ImprimirResposta();
    }
    public int[] obterDescartes(){
        return descartes;
    }
    public int obterRestantes(){
        return restantes;
    }
}
class ViewConsole{
    private final int[] descartes;
    private final int restantes;
    public ViewConsole(int[] descartes, int n){
        this.descartes = descartes;
        restantes = n;
    }
    public void ImprimirResposta(){
        System.out.print("Discarded cards:");
        for (int i = 0; i < descartes.length; i++) {
            if (i == 0) 
                System.out.print(" " + descartes[i]);
            else 
                System.out.print(", " + descartes[i]);  
        }
        System.out.printf("%n");
        System.out.printf("Remaining card: " + restantes + "%n");
    }
}
