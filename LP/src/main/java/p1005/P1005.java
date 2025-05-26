/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1005;
import java.util.Scanner;
public class P1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double media = (A * 3.5 + B * 7.5) / 11;
        System.out.printf("MEDIA = %.5f\n", media);
        scanner.close();
    }
}
