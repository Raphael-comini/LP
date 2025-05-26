package br.cefetmg.inf.lab20250512.p1094;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double total = 0.0;
        int totalCoelho = 0;
        int totalSapo = 0;
        int totalRato = 0;
        for (int i = 0; i < n; i++) {
            int teste = scanner.nextInt();
            char tipo = scanner.next().charAt(0);
            total = total + teste;
            if (tipo == 'C') {
                totalCoelho += teste;
            }
            if (tipo == 'R') {
                totalRato += teste;
            }
            if (tipo == 'S') {
                totalSapo += teste;
            }
        }
        double percentCoelho = (totalCoelho * 100) / total;
        double percentRato = (totalRato * 100) / total;
        double percentSapo = (totalSapo * 100) / total;
        System.out.printf("Total: %.0f cobaias%n", total);
        System.out.printf("Total de coelhos: %d%n", totalCoelho);
        System.out.printf("Total de ratos: %d%n", totalRato);
        System.out.printf("Total de sapos: %d%n", totalSapo);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentCoelho);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentRato);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentSapo);
    }
}
