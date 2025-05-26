/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1010;
import java.util.Scanner;
public class P1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo1 = scanner.nextInt();
        int numeroDePecas1 = scanner.nextInt();
        double valorUnitario1 = scanner.nextDouble();
        int codigo2 = scanner.nextInt();
        int numeroDePecas2 = scanner.nextInt();
        double valorUnitario2 = scanner.nextDouble();
        double valorTotal = (numeroDePecas1 * valorUnitario1) + (numeroDePecas2 * valorUnitario2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
        scanner.close();
    }
}
