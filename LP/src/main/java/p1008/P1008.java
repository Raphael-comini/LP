/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1008;
import java.util.Scanner;
public class P1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int horas = scanner.nextInt();
        double valorPorHora = scanner.nextDouble();
        double salario = horas * valorPorHora;
        System.out.printf("NUMBER = %d%n", number);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        scanner.close();
    }
}
