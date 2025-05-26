package br.cefetmg.inf.lista02.p1435;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;

            int[][] M = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = Math.abs(i - j) + 1;
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (j > 0) System.out.print(" ");
                    System.out.printf("%d", M[i][j]);
                }
                System.out.println();
            }

            System.out.println();
        }

        sc.close();
    }
}
