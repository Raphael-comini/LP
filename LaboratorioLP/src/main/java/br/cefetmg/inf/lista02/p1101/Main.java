package br.cefetmg.inf.lista02.p1101;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int M = sc.nextInt();
            int N = sc.nextInt();

            if (M <= 0 || N <= 0) {
                break;
            }

            int menor = Math.min(M, N);
            int maior = Math.max(M, N);
            int soma = 0;

            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("Sum=" + soma);
        }

        sc.close();
    }
}
