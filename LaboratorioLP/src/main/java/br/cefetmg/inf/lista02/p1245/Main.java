package br.cefetmg.inf.lista02.p1245;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] botasE = new int[61];
            int[] botasD = new int[61];
            int pares = 0;

            for (int i = 0; i < n; i++) {
                int tamanho = scanner.nextInt();
                String lado = scanner.next();

                if (lado.equals("E")) {
                    botasE[tamanho]++;
                } else {
                    botasD[tamanho]++;
                }
            }

            for (int i = 30; i <= 60; i++) {
                pares += Math.min(botasE[i], botasD[i]);
            }

            System.out.println(pares);
        }
        scanner.close();
    }
}
