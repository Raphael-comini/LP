package br.cefetmg.inf.lista02.p1071;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int menor = Math.min(X, Y);
        int maior = Math.max(X, Y);
        int soma = 0;
        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
        sc.close();
    }
}
