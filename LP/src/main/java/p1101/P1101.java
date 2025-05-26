/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1101;
import java.util.Scanner;
public class P1101 {
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
