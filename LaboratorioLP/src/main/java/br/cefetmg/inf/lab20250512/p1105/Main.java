package br.cefetmg.inf.lab20250512.p1105;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b, n;
        do {
            b = scanner.nextInt();
            n = scanner.nextInt();
            if (b == 0 && n == 0) {
                break;
            }
            int[] saldo = new int[b];
            for (int i = 0; i < b; i++) {
                saldo[i] = scanner.nextInt();
            }
            for (int j = 0; j < n; j++) {
                int devedor = scanner.nextInt();
                int credor = scanner.nextInt();
                int valor = scanner.nextInt();
                saldo[devedor - 1] -= valor;
                saldo[credor - 1] += valor;
            }
            int possivel = 1;
            for (int k = 0; k < b; k++) {
                if (saldo[k] < 0) {
                    possivel = 0;
                }
            }
            if (possivel == 0) {
                System.out.printf("N%n");
            } else if (possivel == 1) {
                System.out.printf("S%n");
            }
        } while (b != 0 && n != 0);
    }
}
