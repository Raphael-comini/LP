package br.cefetmg.inf.lista02.p1129;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;

            for (int i = 0; i < N; i++) {
                int[] valores = new int[5];
                boolean[] marcadas = new boolean[5];
                int contPreto = 0;
                int indiceMarcado = -1;

                for (int j = 0; j < 5; j++) {
                    valores[j] = sc.nextInt();
                    if (valores[j] <= 127) {
                        marcadas[j] = true;
                        contPreto++;
                        indiceMarcado = j;
                    }
                }

                if (contPreto == 1) {
                    System.out.println((char) ('A' + indiceMarcado));
                } else {
                    System.out.println("*");
                }
            }
        }

        sc.close();
    }
}
