package br.cefetmg.inf.lista01.p1042;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int Atemp = A;
        int Btemp = B;
        int Ctemp = C;
        
        
        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }
        
        if (A > C) {
            int temp = A;
            A = C;
            C = temp;
        }
        
        if (B > C) {
            int temp = B;
            B = C;
            C = temp;
        }
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println();
        System.out.println(Atemp);
        System.out.println(Btemp);
        System.out.println(Ctemp);
        
        scanner.close();
    }
}
