package br.cefetmg.inf.lista01.p1007;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int diferenca = (A*B-C*D);
        System.out.printf("DIFERENCA = %d%n", diferenca);
        scanner.close();
    }
}
