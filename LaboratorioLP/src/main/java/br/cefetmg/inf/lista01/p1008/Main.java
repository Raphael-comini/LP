package br.cefetmg.inf.lista01.p1008;
import java.util.Scanner;
public class Main {
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
