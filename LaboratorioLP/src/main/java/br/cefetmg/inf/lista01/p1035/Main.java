package br.cefetmg.inf.lista01.p1035;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        if(B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0)
        {
        System.out.printf("Valores aceitos%n");
        }
        else{
        System.out.printf("Valores nao aceitos%n");     
        }
        scanner.close();
    }
}
